package s17.application;

import s17.services.PrintService;

import java.util.Scanner;

public class CriaListaNumeros {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        PrintService<String> pt = new PrintService<>();

        System.out.print("How many values? ");
        int number = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < number; i++){
            pt.addValue(sc.nextLine());
//            pt.addValue(Integer.parseInt(sc.nextLine()));
        }
        pt.print();
        System.out.println("First: " + pt.first());
        sc.close();
    }
}
