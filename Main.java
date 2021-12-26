package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1, n2, select;
        float result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        System.out.print("Choose select: 1(+)2(-)3(*)4(/) ");
        select = input.nextInt();

        switch (select)
        {
            case 1:
                result = n1+n2;
                break;
            case 2:
                result = n1-n2;
                break;
            case 3:
                result = n1*n2;
                break;
            case 4:
                result = n1 / n2;
                break;
        }
        System.out.println(result);
    }
}
