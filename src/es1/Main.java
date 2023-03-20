package es1;
/*
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
   private static  int[] arr;
   static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        initArray();
        while (true){
          try  {
                inserisci();
            } catch (Exception e) { break;}
            }


       //init array
        //while
        //inserisci


    }


        //inserisci ()
    public static void inserisci() throws Exception {
        //chiedere posizione
        //se 0 exit
        //chiedere numero
        //inserire nell'array
        System.out.println("inserisci la posizione (0-exit)");
        int x = s.nextInt();
        if(x == 0) {

        }
        System.out.println("inserisci un numero");
        int n = s.nextInt();
        try{
        inserisciNumero(n, x);} catch(Exception e) {
            e.error("indice inserito non valido");
        }


    }
    private static void inserisciNumero(int n, int p) throws Exception {
        if(p >= arr.length){
            throw new Exception("indice out of bound");

        }
        int[ ] nuovo = new int [arr.length+1];
        for(int i = 0; i < arr.length; i++){

            if(i < p){nuovo[i] = arr[i];}
            if(i==p){nuovo[i] = n;}
            if( i> p){nuovo[i+1]=arr[i];}
            arr = nuovo;

        }
    }

    public static void initArray(){
        for (int i = 0; i< arr.length; i++) {
            arr[0] = (int) ((Math.random() * 10) + 1);
        }
        System.out.println(Arrays.toString(arr));

    }

        /*int[] array = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int posizione;
        int valore;



        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }


        System.out.println("Array iniziale:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        while (true) {
            try {


                System.out.println("inserisci valore compreso tra 1 e 10 (inserisci 0 per uscire)");
                valore = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Inserire la posizione (1-5)");
                posizione = (scanner.nextInt()) - 1;
                scanner.nextLine();



                if (valore == 0) {
                    break;
                }
                else if (valore < 0){
                   throw  valoreOutOfRange();

                }
               else  if (valore > 10){
                   throw valoreOutOfRange();
                }

                array[posizione] = valore;


                System.out.println("nuovo array:");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();

            } catch (Exception e) {
                System.out.println("errore");
            }
        }


    }

   public static void valoreOutOfRange() {
       System.out.println("errore");





}*/