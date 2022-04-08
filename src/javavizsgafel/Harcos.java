
package javavizsgafel;


public class Harcos extends Karakter{
    private int ero;
    private String ugyesseg;
    
    public Harcos(int ero, String ugyesseg, String nev, String faj) {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
    }

    @Override
    public String toString() {
        return "Harcos{" + "ero=" + ero + ", ugyesseg=" + ugyesseg + '}';
    }
    
       
   

    
   
   
    
                
}
