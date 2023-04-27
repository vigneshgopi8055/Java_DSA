package src;

import java.util.Scanner;

public class ATM {
    static int pin_number = 1111;
    static int balance = 100000;
    static String pass = "hello123";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE PIN :  ");
        int pin = sc.nextInt();
        if (Checkpin(pin)){
            System.out.println("PLEASE SELECT THE CHOICE");
            System.out.println("1 : WITHDRAW");
            System.out.println("2 : DEPOSIT");
            System.out.println("3 : BALANCE");
            System.out.println("4 : EXIT");
        }else {
            System.out.println("INVALID PIN.PLEASE TRY AGAIN");
        }
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("ENTER THE AMOUNT");
                int amount = sc.nextInt();
                System.out.println("WITHDRAW SUCCESSFUL");
                System.out.println("BALANCE : " + (balance-amount));
                break;
            case 2 :
                System.out.println("ENTER THE AMOUNT TO DEPOSIT");
                int deposit = sc.nextInt();
                System.out.println("DEPOSITED SUCCESSFULLY");
                System.out.println("BALANCE : " + (balance+deposit));
                break;
            case 3 :
                System.out.println("BALANCE : " + balance);
                break;
            case 4 :
                System.out.println("EXITED SUCCESSFULLY");
        }
    }

    static boolean Checkpin(int num){
        return num==pin_number;
    }
}
