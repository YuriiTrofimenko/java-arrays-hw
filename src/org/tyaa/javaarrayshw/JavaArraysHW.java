/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaarrayshw;

/**
 *
 * @author student
 */
public class JavaArraysHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][] demoArray = new String[2][];
        
        String[] row1 = {"Y", "", "N"};
        demoArray[0] = row1;
        
        String[] row2 = {"N", "Y", "Y", "", "N"};
        demoArray[1] = row2;
        
        for (int i = 0; i < demoArray.length; i++) {
            for (int j = 0; j < demoArray[i].length; j++) {
                System.out.printf("%2s",demoArray[i][j]);
            }
            System.out.println();
        }
    }
    
}
