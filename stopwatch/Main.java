/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stopwatch;

/**
 *
 * @author salsa
 */
public class Main {

    public static void main(String[] args) {
        int[] angka= new int[100000];
        
        Stopwatch hitung = new Stopwatch();
        selectionSort(angka);
        hitung.stop();
        
        System.out.println("Sorting 100,000 angka memakan waktu " +hitung.getElapsedTime() +" milidetik");
    }
    
    public static void selectionSort(int[] angka){
        for (int i=0; i<angka.length; i++){
            int currentMin = angka[i];
            int currentMinIndex = i;
            
            for (int j=i+1; j<angka.length; j++){
                if (currentMin>angka[j]){
                    currentMin=angka[j];
                    currentMinIndex=j;
                }
            }
            if (currentMinIndex !=i){
                angka[currentMinIndex] = angka[i];
                angka[i]=currentMin;
            }
        }
    }
}
