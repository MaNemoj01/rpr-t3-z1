package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private int mreza;                                              //atributi
    private String broj;

    MobilniBroj(int mobilnaMreza, String broj){                             // konstruktor
        this.setMreza(mobilnaMreza); this.setBroj(broj);
    }

    public String ispisi(){
        return "0" + this.getMreza() + "/" + this.getBroj();
    }                                                                    // ispisi funckija iz bazne

   @Override
   public int hashCode(){                                           // hashiranje manufactory
        int hash = 1;
        hash = hash * 17 + mreza;
        hash = hash * 31 + broj.hashCode();
        return hash;
    }

    public int getMreza() {                                     //getteri i setteri
        return mreza;
    }

    public void setMreza(int mreza) {
        this.mreza = mreza;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String toString(){                                       // toString override za lijep ispis
        return this.ispisi();
    }

    @Override
    public int compareTo(Object o){                                 // compareTo override za poredenje
        FiksniBroj broj = (FiksniBroj) o;
        return this.ispisi().compareTo(broj.ispisi());
    }
}
