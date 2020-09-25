

/**
 * Write a description of class Parientes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parientes
{
   private int valor1,valor2;
   private String mensaje;
   public Parientes(int Valor1, int Valor2){
       valor1 = Valor1;
       valor2 = Valor2;
   }
   public String Calcular(){
      if(valor1 >= valor2){
        if(valor1 % valor2 == 0){
           mensaje = valor1 +" y "+ valor2 +" son parientes";
        }  
      }else if(valor2 % valor1 == 0){
          mensaje = valor2 +" y " + valor1 +" son parientes";
      }
      return mensaje;
      }
 }

