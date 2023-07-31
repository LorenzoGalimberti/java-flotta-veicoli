package org.java.lessons.flotta;

public class Motocicletta extends  Veicle{
    // attributi
    private  boolean cavalletto;

    // costruttore

    public Motocicletta(String numeroTarga, int annoImmatricolazione, boolean cavalletto) {
        super(numeroTarga, annoImmatricolazione);
        this.cavalletto = cavalletto;
    }

    // g and s

    public boolean isCavalletto() {
        return cavalletto;
    }

    // metodi
    public String cavallettoToString(){
        if(cavalletto){

            return "con cavalletto ";
        }else{
            return "senza cavalletto";
        }
    }
    @Override
    public String toString() {
        return super.toString()+" , veicolo = automobile" +
                " , cavalletto =" + cavallettoToString() +
                '}';
    }
}
