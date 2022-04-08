
package javavizsgafel;

import java.util.ArrayList;


public abstract class Karakter {
    private String nev,faj;
    ArrayList<Eszkoz> eszkoz=new  ArrayList<>();
    public Karakter(String nev, String faj) {
        eszkoz.add(new Eszkoz("balta", 20));
        eszkoz.add(new Eszkoz("kés", 20));
        eszkoz.add(new Eszkoz("gyujtó", 20));
        this.nev = nev;
        this.faj = faj;
    }
    
    
    
    
}
