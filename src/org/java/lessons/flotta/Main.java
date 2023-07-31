package org.java.lessons.flotta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Esempio di utilizzo
        GestoreFlotta gestoreFlotta = new GestoreFlotta();


        // inserimento manuale
        boolean flag= false;
        while(!flag){
            System.out.print(" vuoi inserire un veicolo (Y/n) ?");
            String answer = scan.nextLine();
            if(answer.equalsIgnoreCase("y")){
                System.out.print("aggiungiamo un veicolo !! quale vuoi inserire '1-automobile' o '2-motocicletta' :");
                String choice = scan.nextLine();
                System.out.println("inseriamo i dati !! ");
                System.out.print("Targa : ");
                String targa= scan.nextLine();
                System.out.print("Anno di immatricolazione : ");
                int anno = scan.nextInt() ;
                switch (choice){
                    case "1":
                        System.out.print("inserisci il numero di porte : ");
                        int numeroPorte = scan.nextInt();
                        Automobile auto = new Automobile(targa,anno,numeroPorte);
                        gestoreFlotta.aggiungiVeicolo(auto);
                        scan.nextLine();
                        break;
                    case "2":
                        System.out.println("motocicletta");
                        System.out.print("Ha un cavalletto ? (true/false): ");
                        boolean cavalletto = scan.nextBoolean();
                        Motocicletta moto = new Motocicletta(targa,anno,cavalletto);
                        gestoreFlotta.aggiungiVeicolo(moto);
                        scan.nextLine();
                        break;
                    default:
                        break;
                }




            } else if (answer.equalsIgnoreCase("n")) {
                flag=true;
                System.out.println(" grazie lo stesso !! :)");
            }else {
                System.out.println("comando non valido !");
            }

        }



        // cinteggio veicoli specifici
        int conteggioAutomobili = gestoreFlotta.conteggioVeicoli("automobile");
        int conteggioMotociclette = gestoreFlotta.conteggioVeicoli("motocicletta");

        System.out.println("Numero di automobili: " + conteggioAutomobili);
        System.out.println("Numero di motociclette: " + conteggioMotociclette);
        // stampo
            gestoreFlotta.stampFlotta();
        // ricerca targa
        System.out.println(" inserisci la targa da cercare");

        String numeroTargaDaCercare = scan.nextLine();
        Veicle veicoloTrovato = gestoreFlotta.trovaVeicolo(numeroTargaDaCercare);
        if (veicoloTrovato != null) {
            System.out.println("Veicolo trovato: " + veicoloTrovato.toString());
        } else {
            System.out.println("Veicolo non trovato.");
        }
        scan.close();
    }
    }

