package src;

import java.util.Scanner;

public class ATM {
    static int pin_number = 1111;
    static int balance = 100000;
    static String pass = "hello123";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        enterPin();

        System.out.println("PLEASE SELECT THE CHOICE");
        System.out.println("1 : WITHDRAW");
        System.out.println("2 : DEPOSIT");
        System.out.println("3 : BALANCE");
        System.out.println("4 : EXIT");
        System.out.println("ENTER THE CHOICE");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                System.out.println("ENTER THE AMOUNT");
                int amount = sc.nextInt();
                if (amount>balance)
                    System.out.println("INSUFFICIENT BALANCE");
                else {
                    System.out.println("WITHDRAW SUCCESSFUL");
                    System.out.println("BALANCE : " + (balance-amount));
                }
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
    static void enterPin(){
        System.out.print("ENTER THE PIN :  ");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if (num == pin_number)
            return;
        System.out.println("INVALID PIN");
        enterPin();
    }
}
