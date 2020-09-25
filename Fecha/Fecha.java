
/**
 * Write a description of class Fecha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fecha
{
     private int dia;
     private int mes;
     private int año;
     private String res;
     public Fecha(int Dia, int Mes, int Año){
          dia = 31 % Dia;
          mes = Mes;
          año = Año;
     }
     public String setFecha(){
         switch(mes){
            case 1: res = dia + " de enero de " + año;break;
            case 2: res = dia + " de febrero de " + año;break; 
            case 3: res = dia + " de marzo de " + año;break; 
            case 4: res = dia + " de abril de " + año;break; 
            case 5: res = dia + " de mayo de " + año;break; 
            case 6: res = dia + " de junio de " + año;break; 
            case 7: res = dia + " de julio de " + año;break; 
            case 8: res = dia + " de agosto de " + año;break; 
            case 9: res = dia + " de septiembre de " + año;break; 
            case 10: res = dia + " de octubre de " + año;break; 
            case 11: res = dia + " de noviembre de " + año;break; 
            case 12: res = dia + " de diciembre de " + año;break;
            default: res ="el mes ingresado no existe";break;
         }
         return res;
      }
} 