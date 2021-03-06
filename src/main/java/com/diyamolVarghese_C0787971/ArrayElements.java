package com.diyamolVarghese_C0787971;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collections;

public class ArrayElements {
    public static void main(String[] args){
        int[] elements;
        elements=insertElements();
        reverseArray(elements);
        sortedArray(elements);
        displayOddEvenNumbers(elements);
        sumOfElements(elements);
    }

    public static int[] insertElements(){
        int[] elements=new int[10];
        for(int i=0;i<10;i++)
        {
            elements[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));
        }
        JOptionPane.showMessageDialog(null,"Array is: "+Arrays.toString(elements));
         return elements;
    }

    public static void reverseArray(int[] elements){
        int[] reverseArray=new int[10];
        int j=0;
        for(int i=elements.length-1;i>=0;i--)
        {
            reverseArray[j]=elements[i];
            j++;
        }
        JOptionPane.showMessageDialog(null,"Array in reverse order is: "+Arrays.toString(reverseArray));
    }

    public static void sortedArray(int[] elements){
        Arrays.sort(elements);
        JOptionPane.showMessageDialog(null,"Sorted array in ascending order is: "+Arrays.toString(elements));
        int[] reverseArray=new int[10];
        int j=0;
        for(int i=elements.length-1;i>=0;i--)
        {
            reverseArray[j]=elements[i];
            j++;
        }
        JOptionPane.showMessageDialog(null,"Sorted array in descending order is: "+Arrays.toString(reverseArray));
    }

    public static void displayOddEvenNumbers(int[] elements){
        String oddNumbers="";
        String evenNumbers="";
        int oddCount=0,evenCount=0;
        for(int i=0;i<10;i++)
        {
            if((elements[i]%2)==0)
            {
                evenNumbers+=Integer.toString(elements[i])+", ";
            }
            else
            {
                oddNumbers+=Integer.toString(elements[i])+", ";
            }
        }
        JOptionPane.showMessageDialog(null,"Odd numbers in the array is: "+oddNumbers);
        JOptionPane.showMessageDialog(null,"Even numbers in the array is: "+evenNumbers);
    }

    public static void sumOfElements(int[] elements){
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum+=elements[i];
        }
        JOptionPane.showMessageDialog(null,"Sum of numbers: "+sum);
    }
}
