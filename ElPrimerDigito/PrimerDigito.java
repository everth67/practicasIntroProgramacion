
/**
 * Write a description of class PrimerDigito here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimerDigito
{
     private int numero;
     public PrimerDigito(int Numero){//preguntar si aqui deve ingresar el numero
         numero = Numero;
     }
     public int ObtenerDigito(){//o aqui para que se cumpla la condicion
        if(numero >= 100 && numero < 1000){
           numero = numero / 100;
        }else{
       
        }
        return numero;
     }
}
