/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo2;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Trabajo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros: ");
        for (int i=0;i<5;i++){
            System.out.println("Numero "+(i+1)+": ");
            numeros[i]=sc.nextInt();
        }
    }
}