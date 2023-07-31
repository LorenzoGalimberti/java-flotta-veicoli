package org.java.lessons.flotta;

public class Automobile extends Veicle{
    //attributi
    private  int numeroPorte;

    // costruttore

    public Automobile(String numeroTarga, int annoImmatricolazione, int numeroPorte) {
        super(numeroTarga, annoImmatricolazione);
        this.numeroPorte = numeroPorte;
    }

    // g e s

    public int getNumeroPorte() {
        return numeroPorte;
    }

    // metodi

    @Override
    public String toString() {
        return super.toString()+" , veicolo = automobile" +
                " , numeroPorte=" + getNumeroPorte() +
                '}';
    }
}
