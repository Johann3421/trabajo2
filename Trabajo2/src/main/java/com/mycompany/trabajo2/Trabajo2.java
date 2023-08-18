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
        int[] numeros=new int[5];
        System.out.println("Ingrese 5 numeros: ");
        for (int i=0;i<5;i++){
            System.out.println("Numero "+(i+1)+": ");
            numeros[i]=sc.nextInt();
        }
        ordenarBurbuja(numeros);
        System.out.println("Numeros ordenados de menor a mayor: ");
        for (int num : numeros){
            System.out.println(num+" ");
        }
    }
    public static void ordenarBurbuja(int[]array){
        int n=array.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Los numeros fueron ordenados correctamente");
    }
}
