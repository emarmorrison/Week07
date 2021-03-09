package CSAT;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Week07 {

    public static void main(String [] args)
    {
        int[] array = {34, 45, 67, 8, 99, 04, 67, 32, 645, 34};
        int temp = 0, temp2=9999;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j]) {
                    temp2 = array[i];
                    array[i] = array[j];
                    array[j] = temp2;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\n\nElements of array sorted in descending order: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\nElements of array sorted in descending order: ");
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
                System.out.println("Even: "+ array[i]);
            else
                System.out.println("Odd: "+ array[i]);
        }

        int sum = 0;

        for (int i=0; i<array.length; i++)
        {
            sum += array[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }

}

/*

Week07 - Class Exercise based on Arrays
    Declare 10 integer elements array
        - Display array in reverse order
        - Sort array in ascending order
        - Sort array in descending order
        - Display only ODD elements
        - Display only EVEN elements
        - Sum of all elements

 */