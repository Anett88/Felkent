
package javavizsgafel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Karakter {
    private String nev,faj;
    private int nevszamlalo;
    ArrayList<Eszkoz> eszkoz=new  ArrayList<>();
    public Karakter(String nev, String faj) {
        this.faj = faj;
        eszkoz.add(new Eszkoz("balta", 20));
        eszkoz.add(new Eszkoz("kés", 30));
        eszkoz.add(new Eszkoz("gyujtó", 2));
        nevszamlalo=nev.length();  
        if(nevszamlalo<3){ 
            try {
                throw new KivetelException(nev);
            } catch (KivetelException ex) {
                System.out.println("A névnek minimum 3 karakternek kellene lennie!"+ex);
               
            }
        }else{
            this.nev = nev;
        }
        
        
    }
    
    

    @Override
    public String toString() {
        return "Karakter{" + "nev=" + nev + ", faj=" + faj + ", eszkoz=" + eszkoz + '}';
    }
    
    
    public void felvesz(Eszkoz e){
            eszkoz.add(e);
    }
    
    public void torol(){
    
}
    
}
    
    

