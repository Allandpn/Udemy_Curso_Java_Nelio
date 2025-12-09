package s10.exercicies;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MatrizSimples {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[][] matriz = new int[n][m];

        System.out.println("adicione um numero: ");
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                int x = sc.nextInt();
                matriz[i][j] = x;
            }
        }

        System.out.println("Escolha um numero: ");
        int ref = sc.nextInt();
        sc.nextLine();

        int posN = 0;
        int posM = 0;

        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matriz[i][j] == ref) {
                    System.out.println("Position [" + i  + "," + j + "] :");
                    try {
                        System.out.println("Left: " + matriz[i][j-1]);
                    } catch (Exception e) {
                    }
                    try {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    } catch (Exception e) {
                    }
                    try {
                        System.out.println("Up: " + matriz[i-1][j]);
                    } catch (Exception e) {
                    }
                    try {
                        System.out.println("Down: " + matriz[i+1][j]);
                    } catch (Exception e) {
                    }
                }

            }
        }

       sc.close();
    }
;}
