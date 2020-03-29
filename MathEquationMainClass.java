package com.AdvJava.PracticeClasses;

public class MathEquationMainClass {
    public static void main(String[] args)
    {
        MathEquation[] equations = new MathEquation[2];
        equations[0] =create(10.6d,20.1d,'a');
        equations[1] =create(31.6d,21.6d,'s');
        for(MathEquation eq: equations){
            eq.calculation();
            System.out.println(eq.result);
        }

        ////============================
        //This is for test class

        test t = new test();
        t.typeofNumber(4);
        System.out.println("this is >> "+t.typeofNumber(6));


        test[] myTest = new test[2];
        myTest[0]=execute(4);
        myTest[1]=execute(7);
    }

   public static test execute(int a)
    {
        test t= new test();
        t.x =a;
        return t;

    }

    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;
        return  equation;
    }
}
