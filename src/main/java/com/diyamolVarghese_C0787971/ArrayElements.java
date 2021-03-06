package com.diyamolVarghese_C0787971;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args){
        int[] elements=new int[10];
        insertElements();
    }

    public static void insertElements(){
        int[] elements=new int[10];
        for(int i=0;i<10;i++)
        {
            elements[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));
        }
        JOptionPane.showMessageDialog(null,"Array is: "+Arrays.toString(elements));
    }
}
