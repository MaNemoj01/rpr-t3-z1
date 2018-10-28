package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;


    MedunarodniBroj(String drzava, String broj){

    }

    public String ispisi(){
        return this.drzava + "/" + this.getBroj();
    }

    public int hashCode(){

        return 0;
    }



    public String getDrzava() {
        return drzava;
    }

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
    public int compareTo(Object o){
        FiksniBroj broj = (FiksniBroj) o;
        return this.ispisi().compareTo(broj.ispisi());
    }
}
