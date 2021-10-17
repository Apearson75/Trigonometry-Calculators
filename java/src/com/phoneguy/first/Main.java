package com.phoneguy.first;

import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner sudo = new Scanner(System.in);
        System.out.println("sin/cos/tan>");
        String choice;
        choice = sudo.nextLine();
        if (choice.equals("sin")) {
            Scanner sine = new Scanner(System.in);
            System.out.println("Type a number you want to sine>");
            int number = sine.nextInt();
            System.out.println(Math.sin(number));
          } else if (choice.equals("cos")) {
            Scanner cosine = new Scanner(System.in);
            System.out.println("Type a number you want to cosine>");
            int number = cosine.nextInt();
            System.out.println(Math.cos(number));
          } else if (choice.equals("tan")) {
            Scanner tangent = new Scanner(System.in);
            System.out.println("Type a number you want to tangent>");
            int number = tangent.nextInt();
            System.out.println(Math.tan(number));
          }

}
}
