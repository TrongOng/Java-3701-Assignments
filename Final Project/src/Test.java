import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Test {
    public static void main(String[] args) {
        // Create a GenericPriorityQueue and test its methods
        GenericPriorityQueue<Integer> queueAscending = new GenericPriorityQueue<>();

        //inputs
        Scanner input = new Scanner(System.in);
        int length = 5;
        System.out.println("Enter 5 Integers: ");
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        //Selection Sort
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < length-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < length; j++)
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }

        //Enqueue
        for (int i = 0; i < length; i++) {
            queueAscending.enqueue(numbers[i]);
        }

        //Dequeue
        System.out.println("Ascending Order: ");
        while (!queueAscending.isEmpty()) {
            System.out.print(queueAscending.dequeue() + " ");
        }

    }

    
}
