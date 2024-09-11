package Sort;

import java.util.Scanner;

public class LinearQueue {
    final int MAX = 10;
    int[] queue = new int[MAX];
    int front = -1, rear = -1;
    Scanner sc = new Scanner(System.in);

    // Enqueue operation
    void enqueue() {
        if (rear == MAX - 1) {
            System.out.println("\nQueue is full");
        } else {
            System.out.println("\nEnter element to insert: ");
            int num = sc.nextInt();
            if (rear == -1 && front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = num;
        }
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1) {
            System.out.println("\nQueue is empty");
        } else if (front == rear) {
            System.out.println("\nDeleted element is: " + queue[front]);
            front = -1;
            rear = -1;
        } else {
            System.out.println("\nDeleted element is: " + queue[front]);
            front++;
        }
    }

    // Display operation
    void display() {
        if (front == -1) {
            System.out.println("\nQueue is empty");
        } else {
            System.out.println("\nElements of the queue are: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + "\t");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        LinearQueue q = new LinearQueue();
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n--MENU--");
            System.out.println("1. Insert element ");
            System.out.println("2. Delete element ");
            System.out.println("3. Display elements ");
            System.out.println("4. Exit ");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    q.enqueue();
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice! Enter a number between 1-4.");
            }
        } while (ch != 4);

        sc.close();
    }
}
