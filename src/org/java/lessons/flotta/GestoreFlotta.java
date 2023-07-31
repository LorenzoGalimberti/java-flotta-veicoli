package org.java.lessons.flotta;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {
    // attributi
    private List<Veicle> flotta;
    // costruttore

    public GestoreFlotta() {
        flotta=new ArrayList<>();
    }

    // metodi
    public boolean verificaTargaDuplicata(String numeroTarga) {
        for (Veicle veicolo : flotta) {
            if (veicolo.getNumeroTarga().equalsIgnoreCase(numeroTarga)) {
                return true; // Targa duplicata trovata
            }
        }
        return false; // Targa non trovata
    }
    public void aggiungiVeicolo(Veicle veicolo) {
        String numeroTarga = veicolo.getNumeroTarga();
        if (verificaTargaDuplicata(numeroTarga)) {
            System.out.println("Errore: La targa " + numeroTarga + " è già presente nel sistema.");
        } else {
            flotta.add(veicolo);
            System.out.println("Veicolo aggiunto alla flotta.");
        }
    }

    public int conteggioVeicoli(String tipo) {
        int conteggio=0;
        for (Veicle veicolo : flotta) {
            if (tipo.equalsIgnoreCase("automobile") && veicolo instanceof Automobile) {
                conteggio++;
            } else if (tipo.equalsIgnoreCase("motocicletta") && veicolo instanceof Motocicletta) {
                conteggio++;
            }
        }
        return conteggio;
    }

    public Veicle trovaVeicolo(String numeroTarga) {
        for (Veicle veicolo : flotta) {
            if (veicolo.getNumeroTarga().equalsIgnoreCase(numeroTarga)) {
                return veicolo;
            }
        }
        return null; // Veicolo non trovato
    }

    public void stampFlotta() {
        System.out.println("Flotta di veicoli:");
        for (Veicle veicolo : flotta) {
            System.out.println("-------------------");
            System.out.println("Numero di targa: " + veicolo.getNumeroTarga());
            System.out.println("Anno di immatricolazione: " + veicolo.getAnnoImmatricolazione());
            if (veicolo instanceof Automobile) {
                Automobile automobile = (Automobile) veicolo;
                System.out.println("Tipo veicolo: Automobile");
                System.out.println("Numero di porte: " + automobile.getNumeroPorte());
            } else if (veicolo instanceof Motocicletta) {
                Motocicletta motocicletta= (Motocicletta) veicolo;
                System.out.println("Tipo veicolo: Motocicletta");
                System.out.println("Numero di porte: " + motocicletta.cavallettoToString());


            }
            System.out.println("-------------------");
        }
    }


}
