package com.diyamolVarghese_C0787971;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args){
        int[] elements;
        elements=insertElements();
        reverseArray(elements);
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
}
