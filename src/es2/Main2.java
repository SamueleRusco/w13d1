package es2;

import java.util.Scanner;

public class Main2 {
    double kilometriPercorsi;
    double litriConsumati;
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Main2 m = new Main2();
        m.calcolo();
    }

    public void calcolo() {
        try {
            System.out.println("inserire km percorsi");
            kilometriPercorsi = s.nextDouble();

            if (kilometriPercorsi < 0) {
                throw new kilometriNegativiException("Il numero dei chilometri percorsi non può essere negativo!");
            }
            s.nextLine();


            System.out.println("inserire i litri di carburante consumati");

            litriConsumati = s.nextDouble();

            if (litriConsumati < 0) {
                throw new litriNegativiException("Il numero dei litri consumati non può essere negativo!");
            }
            s.nextLine();// perché non va senza sout vuoto?
            System.out.println("");

            double risultato = kilometriPercorsi / litriConsumati;
            System.out.println("hai percorso " + risultato + " km ogni litro di carburante consumato");
            calcolo();
        } catch (kilometriNegativiException e) {
            System.out.println("Errore: " + e.getMessage());
            calcolo();
        } catch (litriNegativiException e) {
            System.out.println("Errore: " + e.getMessage());
            calcolo();
        }
    }
}
