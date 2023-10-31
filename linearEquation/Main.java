/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linearequation;

import java.util.Scanner;

/**
 *
 * @author salsa
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = input.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = input.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = input.nextDouble();

        LinearEquation hitung = new LinearEquation(a, b, c, d, e, f);

        if (hitung.isSolvable()) {
            System.out.println("Nilai X adalah: " + hitung.getX());
            System.out.println("Nilai Y adalah: " + hitung.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}
