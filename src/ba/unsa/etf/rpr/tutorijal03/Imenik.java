package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;
import ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;

public class Imenik {
    private HashMap<String,TelefonskiBroj> imenik = new HashMap<>();
    //enum Grad {SARAJEVO, TUZLA, ZENICA, ORASJE, TRAVNIK, LIVNO, MOSTAR, BIHAC, BRCKO, GORAZDE, SIROKI_BRIJEG, MRKONJIC_GRAD, BANJA_LUKA, PRIJEDOR, DOBOJ, SAMAC, BIJELJINA, ZVORNIK, PALE, FOCA, TREBINJE};


    public  void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime,broj);
    }

    public String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
    public String dajIme (TelefonskiBroj broj){

        for (Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()) {
            if(entry.getValue().equals(broj)){
                return entry.getKey();
            }
        }
    return null;
    }

    public String naSlovo(char s){
        String spisak="";
        int i=1;

        for (Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()) {
            if(entry.getKey().charAt(0) == s){
                spisak=i+". "+entry.getKey()+" - "+entry.getValue()+"\n";
                i++;
            }
        }

        return spisak;

    }

    public Set<String> izGrada(Grad g){
        TreeSet<String> setLjudi = null;
        for (Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            if(entry.getValue() instanceof FiksniBroj){
                if(( (FiksniBroj)entry.getValue()).getGrad().equals(g))
                setLjudi.add(entry.getKey());
            }
        }
        return setLjudi;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){

        Collection<String> imenaLjudi = null;
        for (Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            if(entry.getValue() instanceof FiksniBroj){
                if(( (FiksniBroj)entry.getValue()).getGrad().equals(g))
                    imenaLjudi.add(entry.getKey());
            }
        }



        return null;

    }

}
