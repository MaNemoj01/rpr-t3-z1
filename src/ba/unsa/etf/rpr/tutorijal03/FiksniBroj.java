package ba.unsa.etf.rpr.tutorijal03;

import java.util.EnumMap;
import java.util.Map;

public class FiksniBroj extends TelefonskiBroj {

    public enum Grad {SARAJEVO, TUZLA, ZENICA, ORASJE, TRAVNIK, LIVNO, MOSTAR, BIHAC, BRCKO, GORAZDE, SIROKI_BRIJEG, MRKONJIC_GRAD, BANJA_LUKA, PRIJEDOR, DOBOJ, SAMAC, BIJELJINA, ZVORNIK, PALE, FOCA, TREBINJE}

    private Grad grad;                                          //atributi
    private String broj;
    private Map<Grad, String> pozivni = new EnumMap<Grad, String>(Grad.class);

    FiksniBroj(Grad grad, String broj) {                    // konstruktori
        this.setGrad(grad); this.setBroj(broj);

        pozivni.put(Grad.TRAVNIK,"030");                 // kantoni
        pozivni.put(Grad.ORASJE,"031");
        pozivni.put(Grad.ZENICA,"032");
        pozivni.put(Grad.SARAJEVO,"033");
        pozivni.put(Grad.LIVNO,"034");
        pozivni.put(Grad.TUZLA,"035");
        pozivni.put(Grad.MOSTAR,"036");
        pozivni.put(Grad.BIHAC,"037");
        pozivni.put(Grad.GORAZDE,"038");
        pozivni.put(Grad.SIROKI_BRIJEG,"039");
        pozivni.put(Grad.BRCKO,"049");                   //brcko distirkt
        pozivni.put(Grad.MRKONJIC_GRAD,"050");           // Republika Srpska
        pozivni.put(Grad.BANJA_LUKA,"051");
        pozivni.put(Grad.PRIJEDOR,"052");
        pozivni.put(Grad.DOBOJ,"053");
        pozivni.put(Grad.SAMAC,"054");
        pozivni.put(Grad.BIJELJINA,"055");
        pozivni.put(Grad.ZVORNIK,"056");
        pozivni.put(Grad.PALE,"057");
        pozivni.put(Grad.FOCA,"058");
        pozivni.put(Grad.TREBINJE,"059");

    }

    @Override
    public String ispisi(){                                         // ispisi iz bazne
        String s="";
        s+=pozivni.get(this.grad)+"/"+this.broj;
        return s;
    }

    @Override
    public int hashCode(){                                      // hashiranje manufactory
        int hash = 1;
        hash= hash * 17 + broj.hashCode();
        hash = hash * 31 + grad.hashCode();
        hash = hash * 13 + pozivni.hashCode();
        return hash;
    }

    public Grad getGrad() {                                         //getteri i setteri
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String toString(){
       return this.ispisi();
    }               // toString override za lijep ispis


    public boolean equals(Grad g){                                  // poredenje za gradove
        if(this.grad.equals(g))
            return true;
        else{
            return false;
        }
    }

    @Override
    public int compareTo(Object o){                                     // compareTo override za poredenje
        FiksniBroj broj = (FiksniBroj) o;
        return this.ispisi().compareTo(broj.ispisi());
    }
}
