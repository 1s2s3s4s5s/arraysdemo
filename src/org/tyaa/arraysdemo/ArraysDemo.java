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
        
        int[][] t = new int[11][11];
        
        
        
        /*System.out.println(t[0][0]);
        System.out.println(t[1][0]);
        System.out.println(t[0][1]);*/
        
        /*for (int i = 0; i < 10; i++) {
            System.out.printf("n = %d; value = %s\n", i, t[i]);
        }*/
        
        /*for (int i = 0; i < 10; i++) {
            System.out.printf("n = %d; value = %s\n", i, t[i][0]);
        }*/
        
        /*for (int i = 0; i < 10; i++) {
            //System.out.printf("n = %d; value = %s\n", i, t[i][0]);
            //i = 0
            for (int j = 0; j < 10; j++) {
                //System.out.printf("i = %d; j = %d; value = %d\t\t", i, j, t[i][j]);
                System.out.printf("%5d", t[i][j]);
            }
            System.out.println();
        }*/
        
        for (int i = 1; i <= 10; i++) {
            t[i][0]= i;
            t[0][i]=i;
            for (int j = 1; j <= 10; j++) {
                
                 t[i][j]= i * j;
                //System.out.print(i + " " + j+ "  ");
                //System.out.printf("%5d", t[i-1][j-1]);
            }
        }
        for (int i =1; i == 10; i++)
        {t[0][1] = 1;
        t [ 1 ][ 0 ] = 1;
      
        }
        for (int i = 1; i <= 11; i++ ){
        }  
        for (int i = 1; i <= 11; i++) {
            
            for (int j = 1; j <= 11; j++) {
                
                System.out.printf("%5d", t[i-1][j-1]);
            }
            System.out.println();
        }
    }
    
}
