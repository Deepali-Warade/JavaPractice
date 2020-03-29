package com.AdvJava.PracticeClasses;

public class test {
    public int x;
    public String msg;
    public String typeofNumber(int x)
    {

        switch (x) {
            case 2:
            switch (x % 2) {
                case 0:
                    //System.out.println("Number is divisible by 3");
                    msg="Number is divisible by 2";
                    break;
                default:
                    //System.out.println("The number is not divisible by 3");
                    msg="Number is NOT divisible by 2";
                    break;
            }
            case 3:
            switch (x % 3) {
                case 0:
                    //System.out.println("Number is divisible by 3");
                    msg="Number is divisible by 3";
                    break;
                default:
                   // System.out.println("The number is not divisible by 3");
                    msg="Number is NOT divisible by 3";
                    break;
            }
        }
        return msg;
    }
}
