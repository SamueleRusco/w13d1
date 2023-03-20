package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       esercizio2();
    }

        public static void esercizio2(){
        double kmPercorsi;
        double litriConsumati;
        Scanner scanner = new Scanner (System.in);

            System.out.println("inserisci i Kilometri che hai percorso");
            kmPercorsi = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("inserisci i litri consumati");
            litriConsumati = scanner.nextDouble();
            scanner.nextLine();
            double rapporto = kmPercorsi / litriConsumati;

            System.out.println("hai fatto " + rapporto + "km per ogni litro di carburante utilizzato");
            esercizio2();
        }












    }


