package com.hexaware.trainer;

public class Quiz13
{
    static int score;
    static {
        score=0;
    }
    public void incr() {
        score++;
    }
    public static void main(String[] args) {
        Quiz13 obj1 = new Quiz13();
        Quiz13 obj2 = new Quiz13();
        Quiz13 obj3 = new Quiz13();

        obj1.incr();
        obj2.incr();
        obj3.incr();

        System.out.println(obj1.score);
    }
}
