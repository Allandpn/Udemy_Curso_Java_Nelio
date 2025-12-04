package s10.exercicies;

import s10.entities.*;

import java.util.Locale;
import java.util.Scanner;

public class RegistroAluguel {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Quarto[] quartos = new Quarto[10];

        for(int i = 0; i < quartos.length; i++){
            quartos[i] = new Quarto(i, null);
        }

        System.out.println("How many rooms will be rented: ");
        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){
            sc.nextLine();
            System.out.printf("\nRent #%d\n", i + 1);
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            Estudante estudante = new Estudante(nome, email);

            boolean ocupado = false;
            while(!ocupado){
                System.out.print("Room: ");
                int numeroQuarto = sc.nextInt();
                if(!quartos[numeroQuarto].isOcupado()){
                    quartos[numeroQuarto].setHospede(estudante);
                    ocupado = true;
                } else {
                    ocupado = false;
                }
            }
        }
        System.out.println("\nBusy rooms: ");
        for (Quarto quarto : quartos) {
            if (quarto.getHospede() != null) {
                System.out.printf(
                        "%d: %s, %s\n",
                        quarto.getNumero(),
                        quarto.getHospede().getNome(),
                        quarto.getHospede().getEmail()
                );
            }
        }
        sc.close();
    }
}
