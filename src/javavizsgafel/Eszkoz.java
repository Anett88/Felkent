
package javavizsgafel;


public class Eszkoz {
    private String nev;
    private int suly;
    

    public Eszkoz(String nev, int suly) {
        this.nev = nev;
        if(this.suly<=10){
           this.suly=10;
        }else{
            this.suly=suly;
            
        }
        
        
        
        
    }

    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }
    
    
    
    
}
