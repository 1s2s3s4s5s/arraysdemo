/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.arraysdemo;

/**
 *
 * @author student
 */
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 10;
        
        int[] arr1 = new int[10];
        
        arr1[0] = 1;
        arr1[1] = 3;
        arr1[2] = 5;
        
        //System.out.println(x);
        //System.out.println(arr1[0]);
        //System.out.println(arr1[3]);
        
        /*for (int i = 0; i < arr1.length; i++) {
            //System.out.println(Math.random() * 100);
            arr1[i] = (int) (Math.random() * 100);
            //arr1[i] = Integer.parseInt(String.valueOf(Math.random()));
        }
        
        for (int i = 0; i < arr1.length; i++) {
            //System.out.println(i);
            System.out.println(arr1[i]);
        }*/
        
        int[][] t = new int[10][10];
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                t[i][j] = i * j;
            }
        }
    }
    
}
