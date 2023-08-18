/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoribusqueda;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Algoribusqueda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]numbers = new int[5];
        
        System.out.println("Ingrese 5 numeros: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            for (int j= 0; j<4 - i;j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]= temp ;
                }
            }
        }           
        System.out.println("numeros ordenados de mayor a menor:");
        for (int num : numbers){
            System.out.println(num +" ");
        }
        
        scanner.close();
    }
}
