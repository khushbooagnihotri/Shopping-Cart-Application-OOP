package shoppingcart.khushboo;

import java.util.*;
import java.util.Scanner;

public class ShoppingCart {
    static List<Integer> l = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] items = {"comb","shampoo","dryer","hair band","washing powder","mobile"};
        for (int i = 0; i < items.length; i++) {

        }
        boolean y = true;
        do {
            System.out.println("Enter \n0 to display  menu\n1 to add an item in list\n2 to edit item\n3 to search item \n4 to remove item\n5 to check total no. of items\n6 to print cart\n7 to exit");
            System.out.println("Enter your choice");
            int choice = in.nextInt();
            switch (choice) {
                case 0:
                    displayMenu(items);
                    break;
                case 1:
                    displayMenu(items);
                    insert();
                    break;
                case 2:
                    displayMenu(items);
                    print(items);
                    edit();
                    break;
                case 3:
                    displayMenu(items);
                    search();
                    break;
                case 4:
                    print(items);
                    delete();
                    break;
                case 5:
                    total();
                    break;
                case 6:
                    print(items);
                    break;
                case 7:
                    toexit();
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
            System.out.println("want to continue? y/n");
            String x = in.next();
            char ch = x.charAt(0);
            if (ch == 'n')
                y = false;
        }
        while (y != false);
    }

    static public void displayMenu(String[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(i+": "+ items[i]);
        }
        System.out.println("Use item code as mentioned in the above list of items");
    }

    static public void insert() {

        Scanner in = new Scanner(System.in);

        boolean y = true;
        do {
            System.out.println("Enter item to add in list");
            int num = in.nextInt();
            if (num < 0 || num>5)
                System.out.println("not alowed");
            else
                l.add(num);
            System.out.println("want to insert more?y/n");
            String x = in.next();
            char ch = x.charAt(0);
            if (ch == 'n')
                y = false;
        }
        while (y != false);
    }

    static public void print(String[] items) {


        if (l.isEmpty())
            System.out.println("list is empty ");
        else
            System.out.println("Items in the cart are:");
        for (int i = 0; i < l.size(); i++)
            System.out.println("index " + i + " : " + items[l.get(i)] + " ");

    }

    static public void search() {

        //List<Integer> I=new ArrayList<Integer>();
        System.out.println("enter Item no to search");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == num)
                System.out.println(num + " is  PRESENT at Index " + i);
        }

        if (l.lastIndexOf(num) == -1)
            System.out.println(num + " is NOT PRESENT");
    }

    static public void edit() {


        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.println("enter Item no. you want to add");
        num2 = in.nextInt();
        if (num2 < 0 || num2>5)
            System.out.println("not alowed");
        else {
            try {
                System.out.println("enter Item Index you want to edit");
                num1 = in.nextInt();
                l.set(num1, num2);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("caught IndexOutOfBoundsException: specified position is empty " + e.getMessage());
            }

        }
    }

    static public void delete() {


        Scanner in = new Scanner(System.in);
        System.out.println("enter position you want to delete");
        int num = in.nextInt();
        l.remove(num);

    }

    static public void total() {


        System.out.println("total no. in list are " + l.size());
    }

    static public void toexit() {

        System.exit(0);
    }
}