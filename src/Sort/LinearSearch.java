package Sort;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter Element to search: ");
        int search = scanner.nextInt();
        int first = 0;
        int last = arr.length-1;
        int mid = (first+last)/2;

        while (first <= last){
            if(arr[mid] == search){
                System.out.println("Element found at " + mid);
                break;
            } else if (arr[mid] < search) {
                first = mid+1;
                mid = (first+last)/2;
            } else {
                last = mid-1;
                mid = (first+last)/2;
            }
        }
        if(first > last){
            System.out.println("Element not found");
        }
    }
}
