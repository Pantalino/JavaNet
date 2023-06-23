package gestionieccezzioni;

import java.util.Scanner;

public class EsEccezione {

    /*
    creare un programma che permette all'utente di scegliere la lunghezzadi un array
    riempirlo con valori a piacere
    il programma deve continuare finchè l'utente non digita la parola fine
    gestire l'eccezione in cui l'utente non digita fine e mette più valori di quelli ammessi dall'array
    se si supera la lunchezza, allora svuotare l'array e far inserire di nuovo gli errori
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] numeri = new int[0];

        System.out.println("Inserisci numeri:");
        for (int i = 0; i < numeri.length; i++) {
             numeri[i] = in.nextInt();
               System.out.println("Risulato\n" + numeri[i]);
        }
        
     
       
            
        }


    }

}
