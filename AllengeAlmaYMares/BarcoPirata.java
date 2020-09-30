
/**
 * Write a description of class BarcoPirata here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BarcoPirata
{
    private int rx;
    private int ry;
    private int numIntentos;
    private int numIntReali;
    private String mensaje;
    public BarcoPirata()
    {
       numIntentos = 3;
       numIntReali = 0;
       generarAleatorio();
    }
    private void generarAleatorio(){
        rx = (int)(Math.random()*10+1);
        ry = (int)(Math.random()*10+1);
    }
    public String jugar(int ejeX, int ejeY){
        if(numIntReali <= numIntentos){
            numIntReali = numIntReali + 1;
           if(ejeX == rx && ejeY == ry){
                mensaje = "Ganaste!!! aqui esta tu tesoro"; 
                numIntReali = 0;
                generarAleatorio();
           }else{
             if((ejeX == rx)&&(ejeY >= ry + 3 || ejeY <= ry - 3 )){
                  mensaje = "X esta en pocision, Y esta lejos";
             }else{
               if((ejeX == rx)&&(ejeY == ry + 2 || ejeY == ry - 2 || ejeY == ry + 1 || ejeY == ry - 1)){
                  mensaje = "X esta en pocision, Y esta cerca";
               }else{
                  if((ejeY == ry)&&(ejeX >= rx + 3 || ejeX <= rx - 3)){
                      mensaje = "Y esta en pocision, X esta lejos";
                  }else{
                    if((ejeY == ry)&&(ejeX == rx + 2 || ejeX == rx - 2 || ejeX == rx + 1 || ejeX == rx - 1)){
                        mensaje = "Y esta en pocision, X esta cerca";
                    }else{
                       if((ejeX == rx + 2 || ejeX == rx - 2 || ejeX == rx + 1 || ejeX == rx - 1)&&(ejeY == ry + 2 || ejeY == ry - 2 || ejeY == ry + 1 || ejeY == ry - 1)){
                           mensaje = "X esta cerca, Y esta cerca";
                       }else{
                          if((ejeX == rx + 2 || ejeX == rx - 2 || ejeX == rx + 1 || ejeX == rx - 1)&&(ejeY >= ry + 3 || ejeY <= ry - 3 )){
                             mensaje = "X esta cerca, Y esta lejos";   
                          }else{
                             if((ejeY == ry + 2 || ejeY == ry - 2 || ejeY == ry + 1 || ejeY == ry - 1)&&(ejeX >= rx + 3 || ejeX <= rx - 3)){
                                  mensaje = "Y esta cerca, X esta lejos";
                             }else{
                               mensaje = "Y esta lejos, X esta lejos";
                             }  
                          }
                       }
                    }
                  }
               }
             }
           }
        }else{
            mensaje = "perdiste saludame al megalodon";
            generarAleatorio();
            numIntReali = 0;
        }
       return mensaje;
    }
}
