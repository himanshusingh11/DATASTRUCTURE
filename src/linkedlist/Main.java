package linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Linkedlist linkedlist = new Linkedlist();
        boolean flag = true;
        while (flag) {
            System.out.println(" ");
            System.out.println("1. Add item to the list at start");
            System.out.println("2. Add item to the list at Last");
            System.out.println("3. Add item to the list at position");
            System.out.println("4.  Delete First item from the list");
            System.out.println("5. Delete Last item from the list ");
            System.out.println("6. Delete  item from the list with given position ");
            System.out.println("7. Print List ");
            System.out.println("8. Search an item in the list ");
            System.out.println("9. Exit");
            System.out.println("Enter your choice");
            System.out.println();
            int choice = scanner.nextInt();
            int position;
            int val;
            switch (choice) {
                case 1:
                    System.out.println("Enter value of list Item");
                    val = scanner.nextInt();
                    linkedlist.insertAtFirst(val);
                    break;
                case 2:
                    System.out.println("Enter value of list Item");
                    val = scanner.nextInt();
                    linkedlist.insertAtLast(val);
                    break;
                case 3:
                    System.out.println("Enter position");
                    position = scanner.nextInt();
                    System.out.println("Enter value of list Item");
                    val = scanner.nextInt();
                    linkedlist.insertAtPos(position, val);
                    break;
                case 4:
                    linkedlist.deleteFirst();
                    break;
                case 5:
                    linkedlist.deleteLast();
                    break;
                case 6:
                    System.out.println("Enter position");
                    position = scanner.nextInt();
                    linkedlist.deleteAtPos(position);
                    break;
                case 7:
                    linkedlist.printList();
                    break;
                case 8:
                    System.out.println("enter the number for searching");
                    int x = scanner.nextInt();
                    linkedlist.search(x);
                    if (linkedlist.search(x)) {
                        System.out.println("true element " + x + " is present");
                    } else {
                        System.out.println("false element " + x + " is not present ");
                    }
                    break;

                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice ");


            }
        }
    }
}
