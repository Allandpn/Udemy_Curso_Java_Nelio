package s14.exercicies;

import java.util.Scanner;

public class LearnTryCatch {
    public static void main(String args[]){

        method1();
        System.out.println("FIM DO PROGRAMA");

    }

    public static void method1(){
        method2();
    }


    public static void method2(){
        Scanner sc = new Scanner(System.in);
        try {
            String vet[] = sc.nextLine().split(" ");
            int n = Integer.parseInt(sc.nextLine());
            System.out.println(vet[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index errado\n" + e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Error: indice invalido\n" + e);
        } finally {
            System.out.println("FINALY");
        }
        sc.close();
    }

}
