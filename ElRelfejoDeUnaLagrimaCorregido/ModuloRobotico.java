
/**
 * Write a description of class ModuloRObotico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ModuloRobotico{
    private int limitSavia,limitReflejoLagrima;
    private int cantSavia, cantReflejoLagrima;
    private int estado;
    private String mensaje;
    public ModuloRobotico(){
        limitSavia          = 90;
        cantSavia           = 0;
        limitReflejoLagrima = 20;
        cantReflejoLagrima  = 0;
        estado         = 0;
    }
    public String Apagar(){
        estado = 0;
        mensaje = "la maquina apagada";
        return mensaje;
    }
    public String setEncender(){
        estado = 1;
        mensaje = "maquina encendida";
        return mensaje;
    }
    public String recolectarSavia(int saviaRecolectada){
        if(estado == 1){
            if(saviaRecolectada <= limitSavia && cantReflejoLagrima <= limitReflejoLagrima ){
                  cantSavia = (cantSavia + saviaRecolectada)%50;
                  cantReflejoLagrima =cantReflejoLagrima +(saviaRecolectada / 50);
                  mensaje = "la accion ha sido completada con exito";
            }else{
                  mensaje = "la accion no pudo realizarce";
            }
        }else{
           mensaje = "enceder la maquina primero";
        }
        return mensaje;
    }
    public String VaciarMaquina(){
       if(estado == 1){
          cantSavia = 0;
          cantReflejoLagrima = 0;
       }else{
           mensaje = "encienda la maquina primero";
       }
       return mensaje;
     }
    
}
