
/**
 * Write a description of class Semaforo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Semaforo{
    private String rojo;
    private String amarillo;
    private String verde;
    private String actual;
    public Semaforo(String colorActual){
       rojo     = "rojo";
       amarillo = "amarillo";
       verde    = "verde";
       actual   = colorActual;
    }
    public String Funcionar(){
       if(actual.equals(rojo)){
          actual = verde;
       }else if(actual.equals(verde)){
          actual = amarillo;
       }else if(actual.equals(amarillo)){
          actual = rojo;
       }
       return actual;
    }
}
