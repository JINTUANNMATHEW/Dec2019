package com.hexaware.trainer;

public class Cricket 
{
    static int score;

    public void incr(int x) {
        score+=x;
    }
    public static void main( String[] args )
    {
        Cricket fb = new Cricket();
        Cricket sb = new Cricket();
        Cricket ext = new Cricket();

        fb.incr(11);
        sb.incr(5);
        ext.incr(3);
        System.out.println("Total Score " +Cricket.score);        
    }
}
