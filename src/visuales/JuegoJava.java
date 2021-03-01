/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visuales;
import javax.swing.JFrame;
import visuales.pantallaTablero;
import static visuales.pantallaTablero.main;

/**
 *
 * @author Karla
 */
public class JuegoJava {
    public static int espa, mate, hist,geo,cult;
    public static int puntaje, puntos, corr;
    public static  boolean[][] activos=new boolean[6][5];

    /*geters y seters utilizados gracias a: 
    * https://stackoverflow.com/questions/24433951/setting-the-value-of-a-variable-from-another-class-in-java
    */
    public static int getEspa() {
        return espa;
    }
    public static void setEspa(int espa) {
        JuegoJava.espa = espa;
    }
    public static int getMate() {
        return mate;
    }
    public static void setMate(int mate) {
        JuegoJava.mate = mate;
    }
    public static int getHist() {
        return hist;
    }
    public static void setHist(int hist) {
        JuegoJava.hist = hist;
    }
    public static int getGeo() {
        return geo;
    }
    public static void setGeo(int geo) {
        JuegoJava.geo = geo;
    }
    public static int getCult() {
        return cult;
    }
    public static void setCult(int cult) {
        JuegoJava.cult = cult;
    }

    /*public static int getPuntaje() {
        return puntaje;
    }

    public static void setPuntaje(int puntaje) {
        JuegoJava.puntaje = puntaje;
    }*/
    

    
    /*public JuegoJava(int puntaje, int puntos) {
             
        Suma.puntaje = puntaje + puntos;
        Suma.setPuntaje(Suma.puntaje);
    }*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pantallaInicio objpantallaInicio = new pantallaInicio();
        //hacer un for anidado para inicializar los valores del array, todos a true
        //activos[0][0]=true;
       for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                activos[i][j]=true;
            }
        }
        objpantallaInicio.setVisible(true);
    }
    
}
