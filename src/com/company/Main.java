 package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r= new Random();
        int n, sum=0, m, k=0, q=0, s=0;
        System.out.println("Введите размерность массива:");
        System.out.println( "N = ");
        n= 5;
        int A[][] = new int[n][n];
        int B[] = new int[n*n];
        for (int i = 0; i < n; i++)
        {
            for(int j=0; j<n;j++){
                A[i][j]=r.nextInt(50) -10;
                System.out.print(A[i][j]+ " ");
                B[s]=A[i][j];
                s++;
            }
            System.out.println();
        }
        System.out.println();
        start:
        for (int i = 0; i < n*n; i++) {
            if(B[i]<0){
                k=i;
                break start;
            }
        }
        for (int i = k; i < n*n; i++) {
            sum+=Math.abs(B[i]);
        }
        System.out.println("Sum" + sum );
    }
}






