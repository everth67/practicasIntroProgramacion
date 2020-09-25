
/**
 * Write a description of class anioBisiesto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class anioBisiesto
{
    private int anio;
    private boolean res;
    public anioBisiesto(int Anio){
        anio = Anio;
    }
    public boolean esBisiesto(){
       if(anio % 4 == 0){
          res = true;
       }else if(anio % 400 == 0){
          res = true;
       }else if(anio % 100 == 0){
          res = false; 
       }
       return res;
    }
}
