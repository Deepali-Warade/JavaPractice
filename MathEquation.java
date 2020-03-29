package com.AdvJava.PracticeClasses;

public class MathEquation {
        public double leftVal;
        public double rightVal;
        public char opCode;
        public double result;
        public void calculation()
        {
            switch (opCode) {
                case 'a':
                    result = leftVal + rightVal;
                    break;
                case 's':
                    result = leftVal - rightVal;
                    break;
                case 'm':
                    result = leftVal * rightVal;
                    break;
                case 'd':
                    result = leftVal / rightVal;
                    break;
                default:
                    System.out.println("Enter correct op Code");
                    break;
            }
        }
}
