package ba.unsa.etf.rpr.tutorijal03;

import java.util.Scanner;
import java.util.Set;

import ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.SARAJEVO;
import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.TRAVNIK;

public class Program {

    public static void main(String[] args) {
	    boolean kraj=true;
	    Scanner ulaz = new Scanner(System.in);
        Imenik imenik = new Imenik();
    	do{
	    	System.out.println("Dobar dan, molimo unesite redni broj tipa broja kojeg zelite unijeti.");
	    	System.out.println("1. Fiksni broj \n2. Mobilni broj \n3.Medunarodni broj");
	    	String odabir= ulaz.nextLine();
	    	switch (odabir){
                case "1": System.out.println("Odabrali ste unos Fiksnog broja, molimo unesite ime pozivnog grada.");
                        String grad = ulaz.nextLine();
                        System.out.println("Unesite broj fiksnog telefona.");
                        String broj1=ulaz.nextLine();
                        FiksniBroj fbroj = new FiksniBroj(Grad.valueOf(grad.toUpperCase()),broj1);
                        System.out.println("Jeste sigurni da zelite unijeti ovaj broj(DA/NE)"+ fbroj.ispisi());
                        String odabir2 = ulaz.nextLine();
                        if(odabir2.equals("DA")){
                            System.out.println("Unesite ime i prezime osobe ciji je ovo broj.");
                            String ime1 = ulaz.nextLine();
                            imenik.dodaj(ime1,fbroj);
                            System.out.println("Broj je uspjesno dodan.");
                        }
                        else{
                            System.out.println("Unos Fiksnog broja otkazan.");
                        }
                        break;
                case "2": System.out.println("Odabrali ste unos Mobilnog broja, molimo unesite broj mreze.");
                        int mreza = ulaz.nextInt();
                        System.out.println("Unesite broj mobilnog telefona.");
                        String broj2=ulaz.nextLine();
                        MobilniBroj mbroj = new MobilniBroj(mreza,broj2);
                        System.out.println("Jeste sigurni da zelite unijeti ovaj broj(DA/NE)"+ mbroj.ispisi());
                        String odabir3 = ulaz.nextLine();
                        if(odabir3.equals("DA")){
                        System.out.println("Unesite ime i prezime osobe ciji je ovo broj.");
                        String ime2 = ulaz.nextLine();
                        imenik.dodaj(ime2,mbroj);
                        System.out.println("Broj je uspjesno dodan.");
                        }
                        else{
                        System.out.println("Unos Mobilnog broja otkazan.");
                        }
                        break;
                case "3": System.out.println("Odabrali ste unos Medunaradnog broja, molimo unesite pozivni broj drzave.");
                        String pozivni = ulaz.nextLine();
                        System.out.println("Unesite broj mobilnog telefona.");
                        String broj3=ulaz.nextLine();
                        MedunarodniBroj Mbroj = new MedunarodniBroj(pozivni,broj3);
                        System.out.println("Jeste sigurni da zelite unijeti ovaj broj(DA/NE)"+ Mbroj.ispisi());
                        String odabir4 = ulaz.nextLine();
                        if(odabir4.equals("DA")){
                        System.out.println("Unesite ime i prezime osobe ciji je ovo broj.");
                        String ime3 = ulaz.nextLine();
                        imenik.dodaj(ime3,Mbroj);
                        System.out.println("Broj je uspjesno dodan.");
                        }
                        else{
                        System.out.println("Unos Medunaradnog broja otkazan.");
                        }
                        break;
                default: System.out.println("Niste odabrali opciju izmedu 1 i 3.");
                         break;
                }


        System.out.println("Dali zelite unijeti jos koji broj? (DA/NE)");
	    String odabir5 = ulaz.nextLine();
	    if(odabir5.equals("NE")){
            kraj=false;}

		}while(kraj);

        System.out.println("-----------");
    	Set<String> imenikZaSarajevo = imenik.izGrada(SARAJEVO);
        String spisakSarajevo = "";
        for (String ime: imenikZaSarajevo) {
            spisakSarajevo += ime + ", ";
        }
        System.out.println(spisakSarajevo);
        System.out.println("-----------");

        Set<TelefonskiBroj> imenikZaTravnik = imenik.izGradaBrojevi(TRAVNIK);
        String spisakTravnik = "";
        for (TelefonskiBroj ime: imenikZaTravnik) {
            spisakTravnik += ime.ispisi() + ", ";
        }
        System.out.println(spisakTravnik);
        System.out.println("-----------");

        System.out.println(imenik.dajBroj("Belmin"));



    }
}
