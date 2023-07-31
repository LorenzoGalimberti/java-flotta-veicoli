package org.java.lessons.flotta;

abstract class Veicle {
    // attributi
    private String numeroTarga;
    private int annoImmatricolazione;
    // costruttore

    public Veicle(String numeroTarga, int annoImmatricolazione) {
        this.numeroTarga = numeroTarga;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    // g e s

    public String getNumeroTarga() {
        return numeroTarga;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    // metodi

    @Override
    public String toString() {
        return "Veicle{" +
                "numeroTarga='" + getNumeroTarga() + '\'' +
                ", annoImmatricolazione=" + getAnnoImmatricolazione() ;
    }
}
