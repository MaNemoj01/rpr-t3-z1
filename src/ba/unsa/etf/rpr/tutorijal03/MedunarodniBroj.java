package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;                                      //atributi
    private String broj;


    MedunarodniBroj(String drzava, String broj){                                // konstruktor
        this.drzava=drzava; this.broj=broj;
    }

    public String ispisi(){
        return this.drzava + "/" + this.getBroj();
    }

    public int hashCode(){                                                      // hashiranje manufactory
        int hash = 1;
        hash = hash * 17 + drzava.hashCode();
        hash = hash * 31 + broj.hashCode();
        return hash;
    }



    public String getDrzava() {
        return drzava;
    }                                         //getteri i setteri

    public void setDrzava(String drzava) {
        this.drzava = drzava;
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
    }                               // toString override za lijep ispis

    @Override
    public int compareTo(Object o){                                                  // compareTo override za poredenje
        FiksniBroj broj = (FiksniBroj) o;
        return this.ispisi().compareTo(broj.ispisi());
    }
}
