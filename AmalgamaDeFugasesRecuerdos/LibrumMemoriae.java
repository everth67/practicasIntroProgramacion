
/**
 * Write a description of class LibrumMemoriae here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibrumMemoriae{
    private String tarea;
    private int contador;
    private boolean estado;
    private String mensaje;
    public LibrumMemoriae(String tareaActual){
       tarea    = tareaActual;
       contador = 0;
       estado   = false;
       mensaje  = "";
    }
    public String TareaConcluida(){
        String mensaje;
        tarea    =""; 
        contador = contador + 1;
        estado   = true;
        mensaje  = "tarea concluida";
        return mensaje;
    }
    public String NuevaTarea(String NuevaTarea){
       String mensaje;
       if(estado){
           tarea = NuevaTarea;
           mensaje = "nueva tarea asignada";
        }else{
           mensaje = "complete su tarea";
        }
       return mensaje;
    }
    public int getTareasRealizadas(){
         return contador;
    }
    public String getTareaActual(){
         return tarea;
    }
    private String getMensaje(){
        return mensaje;
    }
}
