package day07_Operators;

public class SwipeTwoVarWithTempVar {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int t = a;

         a = b;
         b= t;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}

/*
1. write a program that can swipe two variables' value by using a
temporary variable
    Ex:
        if a= 10, b=15
    output:
        a = 15
        b = 10
 */