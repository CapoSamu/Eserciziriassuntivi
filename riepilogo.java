/**
 * riepilogo
 */
public class riepilogo {

    public static void main(String[] args) {
        
    /* primo esercizio:
        
        Stampa numeri pari da 1 a 20:
        Scrivi un programma che stampi i numeri pari da 1 a 20.
        */

        for (int numero = 10; numero >= 1; numero--) {

            if (numero % 2 == 0) {
                 System.out.println(numero);
                
            }

        }

        System.out.println("fine esercizio");

    

    /*
    Somma dei numeri dispari da 1 a 50:
    Calcola e stampa la somma dei numeri dispari da 1 a 50.

     */

     for (int numero = 1; numero <=50; numero++) {
        if (numero % 2  != 0) {
            System.out.println(numero);

         }
        }

         System.out.println("fine esercizio");

         /*
        Tabellina del 5:
        Stampare la tabellina del 5 da 1 a 10.

          */

          for (int numero = 1; numero <=10; numero++) {

            System.out.println("cinque per"+numero+" = "+(5*numero));
          }

        System.out.println("fine esercizio");

         /*
        Conta all'indietro da 10 a 1:
        Scrivi un programma che stampi i numeri da 10 a 1 in ordine decrescente.

          */

          for (int numero = 10; numero >= 1; numero--) {
            System.out.println(numero);
          }

          System.out.println("fine esercizio");

          /*
        Moltiplicazione senza l'operatore :
        Scrivi un programma che moltiplichi due numeri senza utilizzare l'operatore di moltiplicazione ().

           */

        for (int numero = 1; numero <= 30;numero++) {
            if (numero % 3 == 0) {
                System.out.println(numero);}
            
            }

        System.out.println("fine esercizio");



    }
    
}

