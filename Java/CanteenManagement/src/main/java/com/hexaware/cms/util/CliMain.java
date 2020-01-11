package com.hexaware.cms.util;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Console;
import com.hexaware.cms.factory.MenuFactory;
import com.hexaware.cms.factory.VendorFactory;
import com.hexaware.cms.factory.OrdersFactory;
import com.hexaware.cms.model.Menu;
import com.hexaware.cms.model.Orders;
import com.hexaware.cms.model.OrderStatus;
import com.hexaware.cms.factory.CustomerFactory;
import com.hexaware.cms.factory.OrdersFactory;
import com.hexaware.cms.factory.WalletFactory;

import com.hexaware.cms.model.Customer;
import com.hexaware.cms.model.Vendor;
import com.hexaware.cms.model.WalletSource;
import java.util.InputMismatchException;
//import java.util.Date;
//import java.text.SimpleDateFormat;
import java.util.List;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
class CliMain {
    private Scanner option = new Scanner(System.in, "UTF-8");
    //private int quantity;

    /**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Show Menu");
    System.out.println("2. Place Order");
    System.out.println("3. Personal Details");
    System.out.println("4. Vendor Details");
    System.out.println("5. Show pending orders");
    System.out.println("6. Orders History");
    System.out.println("7. Accept/Reject Order");
    System.out.println("8. Exit");

    mainMenuDetails();
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          showFullMenu();
          break;
        case 2:
          placeOrder();
          break;
        case 3:
          showCustomerDetails();
          break;
        case 4:
          showVendorDetails();
          break;
        case 5:
          showPendingOrders();
          break;
        case 6:
          showOrderHistory();
          break;
        case 7:
         // acceptReject();
        case 8:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose from 1 - 8");
      }
    } catch(InputMismatchException e) {
        System.out.println("Invalid Number");
    }
    
    catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }

  /**
 * showFullMenu method  display the menu item stored in database.
 */
private void showFullMenu() {
    List<Menu> menu = MenuFactory.showMenu();
    System.out.println("----------------------------------------------------------"
        + "--------------------------------------------");
    System.out.printf("%5s %20s %20s %20s %20s", "Menu Id",
        "Menu Name", "Menu Calories", "Menu Price", "Menu Speciality");
    System.out.println();
    System.out.println("-----------------------------------------------------------"
        + "--------------------------------------------");

    for (Menu menulist : menu) {
      System.out.format("%5s %20s %20s %20s %20s ",
          menulist.getMenuId(), menulist.getMenItem(), menulist.getMenCalories(),
          menulist.getMenuPrice(), menulist.getMenuSpeciality());
      System.out.println();
    }
  }
  private void placeOrder() {
    Orders order = new Orders();
    System.out.println("Enter Customer ID ");
    order.setCusId(option.nextInt());
    System.out.println("Enter Menu Id  ");
    order.setMenuId(option.nextInt());
    System.out.println("Enter Vendor Id ");
    order.setVenId(option.nextInt()); 
    System.out.println("Enter Quantity ");
    order.setOrderQuantity(option.nextInt());
    System.out.println("Enter Vallet Source ");
    String ws = option.next();
    if(ws.equals("PAYTM")) { 
      order.setWalletSource(WalletSource.PAYTM);
    }
    if(ws.equals("CREDIT_CARD")) {
      order.setWalletSource(WalletSource.CREDIT_CARD);
    }
    if(ws.equals("DEBIT_CARD")) {
      order.setWalletSource(WalletSource.DEBIT_CARD);
    }
    System.out.println("Enter Order Date (yyyy-MM-dd)  ");
    String ord = option.next();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    try {
      Date dt = sdf.parse(ord);
      order.setOrderDate(dt);
    } catch(ParseException e) {
      System.out.println(e);
    }
    System.out.println("Enter Order Comments ");
    order.setOrderComments(option.next());
    order.setOrderStatus(OrderStatus.PENDING);
    order.setOrderBillAmount(0);
    System.out.println(OrdersFactory.setPlaceOrder(order));
  }
  private void showCustomerDetails() {
    System.out.println("Enter your customer UserName");
    String username = option.next();
    Console console = System.console();
    char[] pwd = console.readPassword("Enter password"); 
    String password=String.valueOf(pwd);
    //String password = option.next();
    int count = 0;
    try {
      count = CustomerFactory.validateCustomer(username, password);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      mainMenu();
    }
    if (count == 1) {
        System.out.println("Customer Validated Successfully...");
        Customer customer=CustomerFactory.findCustomerByUserName(username);
        int custId=customer.getCusId();
        customer = CustomerFactory.showCustomer(custId);
        double amount = WalletFactory.fetchtotalAmount(custId);
      // double amount = 0;
       System.out.println("-----------------------------------------"
          + "------------------------------------------------------");
       System.out.printf("%10s %20s %25s %20s %15s", "Customer ID", "Customer Name", "Customer Phone Number", "Customer Username", "Wallet Balance");
    System.out.println();
    System.out.println("-----------------------------------------------------------------------------------------------");


      System.out.format("%10d %20s %25s %20s %15s",
                         customer.getCusId(), customer.getCusName(), customer.getCusPhoneNo(), customer.getCusUserName(), amount);
      System.out.println();


    } else {
        System.out.println("Invalid Customer Credentials...");
    }
    System.out.println("Count is  " +count);
  }

  private void showPendingOrders() {
    System.out.println("Enter The Vendor UserName");
    int vendorId = option.nextInt();
    System.out.println("Enter your password");
    String vendorPassword = option.next();
    int count = 0;
    try {
      count = VendorFactory.authenticateVendor(vendorId, vendorPassword);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      mainMenu();
    }
    if (count == 1) { 
    List<Orders> pendingList = OrdersFactory.showPendingOrders(vendorId);
    System.out.println("----------------------------------------------------"
        + "----------------------------------------------");
    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s", "Item Id", "Menu Id",
         "Order Status", "Order quantity", "Order id","Customer ID", "Bill Amount",
         "Order Date");
    System.out.println();
    System.out.println("----------------------------------------------------"
        + "----------------------------------------------");
    for (Orders order : pendingList) {
      System.out.format("%10d %10d %10s %10s %10d %10d %10s %10s",
          order.getOrderId(), order.getMenuId(), order.getOrderStatus(),
          order.getOrderQuantity(), order.getOrderId(),order.getCusId(),
          order.getOrderBillAmount(),order.getOrderDate());
      System.out.println(); 
    }
   } else {
      System.out.println("Invalid Vendor Credentials...");
    }
    }
  
    private void showOrderHistory() {
      System.out.println("Order history:\n1. Customer\n2. Vendor");
      int choice = option.nextInt();
      if (choice == 1) {
        System.out.println("Enter your customer UserName");
        String username = option.next();
        Console console = System.console();
        char[] pwd = console.readPassword("Enter password"); 
        String password=String.valueOf(pwd);
        //String password = option.next();
        int count = 0;
        try {
          count = CustomerFactory.validateCustomer(username, password);
        } catch (IllegalArgumentException e) {
          System.out.println(e.getMessage());
          mainMenu();
        }
        if (count == 1) {
          System.out.println("Customer Validated Successfully...");
          Customer customer=CustomerFactory.findCustomerByUserName(username);
          int custId=customer.getCusId();
        List<Orders> cusHistory = OrdersFactory.showCustomerHistory(custId);
        System.out.println("----------------------------------------------------"
        + "----------------------------------------------");
    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s", "Item Id", "Menu Id",
         "Order Status", "Order quantity", "Order id","Customer ID", "Bill Amount",
         "Order Date");
    System.out.println();
    System.out.println("----------------------------------------------------"
        + "----------------------------------------------");
    for (Orders order : cusHistory) {
      System.out.format("%10d %10d %10s %10s %10d %10d %10s %10s",
          order.getOrderId(), order.getMenuId(), order.getOrderStatus(),
          order.getOrderQuantity(), order.getOrderId(),order.getCusId(),
          order.getOrderBillAmount(),order.getOrderDate());
      System.out.println(); 
    }
   } else {
      System.out.println("Invalid Vendor Credentials...");
    }
      
      } else if (choice == 2) {
        System.out.println("Enter The Vendor ID");
        int vendorId = option.nextInt();
        System.out.println("Enter your password");
        String vendorPassword = option.next();
        try {
          VendorFactory.authenticateVendor(vendorId, vendorPassword);
        } catch (IllegalArgumentException e) {
          System.out.println(e.getMessage());
          mainMenu();
        }
        List<Orders> vendorHistory = OrdersFactory.showVendorHistory(vendorId);
        System.out.println("----------------------------------------------------"
        + "----------------------------------------------");
    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s", "Item Id", "Menu Id",
         "Order Status", "Order quantity", "Order id","Customer ID", "Bill Amount",
         "Order Date");
    System.out.println();
    System.out.println("----------------------------------------------------"
        + "----------------------------------------------");
    for (Orders order : vendorHistory) {
      System.out.format("%10d %10d %10s %10s %10d %10d %10s %10s",
          order.getOrderId(), order.getMenuId(), order.getOrderStatus(),
          order.getOrderQuantity(), order.getOrderId(),order.getCusId(),
          order.getOrderBillAmount(),order.getOrderDate());
      System.out.println(); 
    }
      }
    }
  
  private void showVendorDetails() {
    List<Vendor> vendorList = VendorFactory.showVendor();
    System.out.println("--------------------------------------------------------------------------------------------------");
    System.out.printf("%10s %20s %20s %20s %20s", "Vendor Id", "Vendor Name", "Vendor Phone", "Vendor Username", "Vendor Email");
    System.out.println();
    System.out.println("--------------------------------------------------------------------------------------------------");

    for (Vendor vendor : vendorList) {
      System.out.format("%10d %20s %20s %20s %20s",
                vendor.getVenId(), vendor.getVenName(), vendor.getVenPhoneNo(), vendor.getVenUsername(), vendor.getVenEmail());
      System.out.println();
    }
  }


  /**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */

public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}  