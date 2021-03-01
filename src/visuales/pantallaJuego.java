/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visuales;
import static visuales.JuegoJava.activos;
import static visuales.JuegoJava.espa;
import static visuales.JuegoJava.hist;
import static visuales.JuegoJava.mate;
import static visuales.JuegoJava.cult;
import static visuales.JuegoJava.geo;
/**
 *
 * @author Karla
 */
public class pantallaJuego extends javax.swing.JFrame {
 //int com = pantallaTablero.espa;
    
    int puntaje;
    
    public void volver(){
        pantallaTablero ObjVolver;
        ObjVolver = new pantallaTablero();
        ObjVolver.setVisible(true);
        this.setVisible(false);
    }
    
    
    public final void modificarText() {
        boolean correcto = false;//para saber si el botón seleccionado es correcto o no.
        // JuegoJava.getPuntaje();

        //Suma sum = new Suma(puntaje,puntos);
        
        //System.out.println(JuegoJava.getEspa());
        
        
        
        /**
         * SWITCH PARA CAMBIAR LOS DATOS DE LA PANTALLA DE JUEGO
         * DEPENDIENDO DEL VALOR DEL BOTÓN EN LA COLUMNA DE ESPAÑOL.
         * 1 = 50; 2 = 100; 3 = 150; 4 = 200; 5 = 300; 6 = 500
         * getEspa toma el valor asignado en el codigo de la pantallaTablero
         * JuegoJava.setEspa(n); donde "n" es el valor del 1 al 6.
         */
        
        switch (JuegoJava.getEspa()){
            case 1:{
                
                cuadroSeccion.setText("ESPAÑOL");
                cuadroValor.setText("50 puntos");
                cuadroPregunta.setText("Nos impidieron __________ aquella noche.");
                op1.setText("Salgamos");
                op2.setText("salir");
                op3.setText("que salimos");
                op4.setText("salen");
                JuegoJava.corr=1;
                
                
                if (op2.isSelected()){
                    correcto = true;
                    
                    //JuegoJava.puntaje=JuegoJava.puntaje+50;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                    dispose();
                    //pantallaTablero p = new pantallaTablero();
                    //p.setVisible(true);
                    //JuegoJava.puntaje=JuegoJava.puntaje+50;
                    //System.out.println(JuegoJava.puntaje);
                    //this.setVisible(false);
                    
                    //pantallaJuego.this.dispose();
                    
                    //setPuntaje(getPuntaje()+50);
                }
                else{
                    //correcto = false;
                    //System.out.println("nada");
                    correcto = false;
                    System.out.println("nada");
                }
                
                break;
                }
            case 2:{
                cuadroSeccion.setText("ESPAÑOL");
                cuadroValor.setText("100 puntos");
                cuadroPregunta.setText("¿Qué es una autobiografía?");
                op1.setText("La historia del arte de los autos");
                op2.setText("<html><center>La historia de la vida de alguien escrita por la misma persona</center></html>");
                op3.setText("<html><center>Una obra que relata la autosuficiencia de los seres vivos</center></html>");
                op4.setText("La historia de la vida de alguien");
                JuegoJava.corr=2;
                if (op2.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+100;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                    dispose();
                }
                else{
                    correcto = false;
                    
                }
                break;
            }
            case 3: {
                cuadroSeccion.setText("ESPAÑOL");
                cuadroValor.setText("150 puntos");
                cuadroPregunta.setText("¿Dónde ___________ una tienda?");
                op1.setText("ahí");
                op2.setText("hay");
                op3.setText("está");
                op4.setText("ay");
                JuegoJava.corr=3;
                if (op2.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+150;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                    dispose();
                }
                else{
                    correcto = false;
                }
                break;
            }
            case 4:{
                cuadroSeccion.setText("ESPAÑOL");
                cuadroValor.setText("200 puntos");
                cuadroPregunta.setText("<html><center>Es la palabra que tiene como función primordial ser el núcleo del predicado.</center></html>");
                op1.setText("Verbo");
                op2.setText("Sujeto");
                op3.setText("Ninguna");
                op4.setText("Frases");
                JuegoJava.corr=4;
                if (op1.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+200;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                    
                }
                else{
                    correcto = false;
                }
                break;
            }
            case 5:{
                cuadroSeccion.setText("ESPAÑOL");
                cuadroValor.setText("300 puntos");
                cuadroPregunta.setText("<html><center>¿Cuántas páginas mínimo debe tener un libro para que se le considere libro?</center></html>");
                op1.setText("47");
                op2.setText("120");
                op3.setText("50");
                op4.setText("49");
                JuegoJava.corr=5;
                if (op4.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+300;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                    
                }
                else{
                    correcto = false;
                }
                break;
            }
            case 6:{
                cuadroSeccion.setText("ESPAÑOL");
                cuadroValor.setText("500 puntos");
                cuadroPregunta.setText("<html><center>Publicación impresa de carácter periódico, editada en intervalos previamente definidos bajo un mismo título (generalmente con identificadores numéricos con el propósito de tener continuidad), tiene como contenido artículos de carácter formativo,analítico o de difusión, cultural, científico o recreativo.</center></html>");
                op1.setText("Volante");
                op2.setText("Periodico");
                op3.setText("Folleto");
                op4.setText("Revista");
                JuegoJava.corr=6;
                if (op4.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+500;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                    
                }
                else{
                    correcto = false;
                }
                break;
            }
        
        }
        
        /**
         * SWITCH PARA CAMBIAR LOS DATOS DE LA PANTALLA DE JUEGO
         * DEPENDIENDO DEL VALOR DEL BOTÓN EN LA COLUMNA DE MATEMÁTICAS.
         * 1 = 50; 2 = 100; 3 = 150; 4 = 200; 5 = 300; 6 = 500
         * getMate toma el valor asignado en el codigo de la pantallaTablero
         * JuegoJava.setMate(n); donde "n" es el valor del 1 al 6.
         * 
         * PUEDES COPIAR Y PEGAR EL CÓDIGO DE LOS BOTONES DE ESPAÑOL.
         * Pero modifica los datos.
         * NO MOVER LO COMENTADO.
         * 
         * Puede ponerse la etiqueta <html> y </html> para acomodar los textos largos automaticamente.
         * <center> y </center> van dentro de las etiquetas de html y sirve para centrar el texto dentro de un elemento.
         * 
         */
        
        
        switch (JuegoJava.getMate()){
            case 7:{
                cuadroSeccion.setText("MATEMÁTICAS");
                cuadroValor.setText("50 puntos");
                cuadroPregunta.setText("¿Cuál es el valor de Pi?");
                op1.setText("ninguna de las anteriores");
                op2.setText("3.18");
                op3.setText("2.16");
                op4.setText("3,14159");
                JuegoJava.corr=7;
                if (op4.isSelected()){ //BOTÓN 4
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+50;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                dispose();
                break;
            }
        case 8:{
            cuadroSeccion.setText("MATEMÁTICAS");
                cuadroValor.setText("100 puntos");
                cuadroPregunta.setText("<html><center>En un torneo de tenis, el jugador que pierde se vuelve a casa. Cuántos jugadores iniciaron este torneo si desde la ronda preliminar hasta la final se han jugado 128 partidos.</center></html>");
                op1.setText("64");
                op2.setText("no se puede saber");
                op3.setText("129");
                op4.setText("127");
                JuegoJava.corr=8;
                if (op3.isSelected()){ //BOTÓN 3
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+100;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
        } case 9:{
            cuadroSeccion.setText("MATEMÁTICAS");
                cuadroValor.setText("150 puntos");
                cuadroPregunta.setText("El monstruo del lago Ness mide 80 metros más la mitad de lo que mide, ¿cuánto mide el monstruo del lago Ness?");
                op1.setText("120");
                op2.setText("no se puede saber");
                op3.setText("160");
                op4.setText("80");
                JuegoJava.corr=9;
                if (op4.isSelected()){//BOTÓN 4
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+150;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
                }   
        case 10:{
            cuadroSeccion.setText("MATEMÁTICAS");
                cuadroValor.setText("200 puntos");
                cuadroPregunta.setText("<html><center>Tengo 20 metros de cinta roja para hacer lazos en unos paquetes de regalo idénticos. Para cada lazo necesito 50 centímetros de cinta. ¿Cuántos lazos puedo hacer?</html></center>");
                op1.setText("40");
                op2.setText("70");
                op3.setText("160");
                op4.setText("60");
                JuegoJava.corr=10;
                if (op1.isSelected()){//BOTÓN 1
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+200;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
    }
                case 11:{
            cuadroSeccion.setText("MATEMÁTICAS");
                cuadroValor.setText("300 puntos");
                cuadroPregunta.setText("¿Cuánto es la cuarta parte de la tercera parte?");
                op1.setText("1/8");
                op2.setText("1/12");
                op3.setText("1/26");
                op4.setText("ninguno");
                JuegoJava.corr=11;
                if (op2.isSelected()){//BOTÓN 2
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+300;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
                }
               case 12:{
            cuadroSeccion.setText("MATEMÁTICAS");
                cuadroValor.setText("500 puntos");
                cuadroPregunta.setText("Tengo que viajar en autobús durante 1,5 horas y luego esperar 45 minutos hasta tomar un tren que me dejará en mi destino dos horas y media después. ¿Cuánto dura mi trayecto?");
                op1.setText(" 5hr y 15min");
                op2.setText("4hr 30min");
                op3.setText("4 horas y 45 min ");
                op4.setText("unas cuantas horas");
                JuegoJava.corr=12;
                if (op3.isSelected()){//BOTÓN 3
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+500;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
                }
             
               
        }   
        
        
        /**
         * SWITCH PARA CAMBIAR LOS DATOS DE LA PANTALLA DE JUEGO
         * DEPENDIENDO DEL VALOR DEL BOTÓN EN LA COLUMNA DE HISTORIA.
         * 1 = 50; 2 = 100; 3 = 150; 4 = 200; 5 = 300; 6 = 500
         * getMate toma el valor asignado en el codigo de la pantallaTablero
         * JuegoJava.setMate(n); donde "n" es el valor del 1 al 6.
         * 
         * PUEDES COPIAR Y PEGAR EL CÓDIGO DE LOS BOTONES DE ESPAÑOL.
         * Pero modifica los datos.
         * NO MOVER LO COMENTADO.
         * 
         * Puede ponerse la etiqueta <html> y </html> para acomodar los textos largos automaticamente.
         * <center> y </center> van dentro de las etiquetas de html y sirve para centrar el texto dentro de un elemento.
         * 
         */
        
        /*switch (JuegoJava.getHist()){
            case 13:{
                cuadroSeccion.setText("HISTORIA");
                cuadroValor.setText("50 puntos");
                cuadroPregunta.setText("¿En que país nació Adolf Hitler?");
                op1.setText("Stalingrado");
                op2.setText("Austria");
                op3.setText("Alemania");
                op4.setText("Suiza");
                JuegoJava.corr=2;
                if (op2.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+50;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
            }
        case 14:{
                cuadroSeccion.setText("HISTORIA");
                cuadroValor.setText("100 puntos");
                cuadroPregunta.setText("¿Quién fue el primer emperador romano?");
                op1.setText("Cesar Augusto");
                op2.setText("Julio Cesar");
                op3.setText("JulioProfe");
                op4.setText("Alejandro Magno");
                JuegoJava.corr=1;
                if (op1.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+100;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
        }   
            case 15:{
                cuadroSeccion.setText("Historia");
                cuadroValor.setText("150 puntos");
                cuadroPregunta.setText("¿En que año descubrió Colón América?");
                op1.setText("1942");
                op2.setText("1532");
                op3.setText("1498");
                op4.setText("1492");
                JuegoJava.corr=4;
                if (op4.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+150;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
    }       
            case 16:{
                cuadroSeccion.setText("HISTORIA");
                cuadroValor.setText("200 puntos");
                cuadroPregunta.setText("¿En que guerra participó Juana de Arco?");
                op1.setText("La Guerra de los cien años");
                op2.setText("Primera cruzada");
                op3.setText("Guerra napoleonica");
                op4.setText("La Guerra jesuita");
                JuegoJava.corr=1;
                if (op1.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+200;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
    }
            case 17:{
                cuadroSeccion.setText("HISTORIA");
                cuadroValor.setText("300 puntos");
                cuadroPregunta.setText("¿Cuzco era la capital del imperio?");
                op1.setText("Romano");
                op2.setText("Inca");
                op3.setText("Macchu Picchu");
                op4.setText("Mesopotamico");
                JuegoJava.corr=2;
                if (op2.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+300;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
                }
            case 18:{
                cuadroSeccion.setText("HISTORIA");
                cuadroValor.setText("500 puntos");
                cuadroPregunta.setText("¿Cómo se llamó durante más de 50 años San Petersburgo?");
                op1.setText("Petroburgo");
                op2.setText("Trotskigrado");
                op3.setText("Lenningrado");
                op4.setText("Stalingrado");
                JuegoJava.corr=3;
                if (op3.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+500;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
                }
               
                }   
        
        switch (JuegoJava.getGeo()){
            case 19:{
                cuadroSeccion.setText("GEOGRAFIA");
                cuadroValor.setText("50 puntos");
                cuadroPregunta.setText("¿En qué país se ubican las ruinas de Esparta?");
                op1.setText("Grecia");
                op2.setText("Argentina");
                op3.setText("Italia");
                op4.setText("Suiza");
                JuegoJava.corr=1;
                if (op1.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+50;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
            }
        case 20:{
                cuadroSeccion.setText("Geografia");
                cuadroValor.setText("100 puntos");
                cuadroPregunta.setText("¿Cuál de estos países no tiene acceso al Mar Mediterráneo?");
                op1.setText("Serbia");
                op2.setText("Eslovenia");
                op3.setText("Egipto");
                op4.setText("Chipre");
                JuegoJava.corr=1;
                if (op1.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+100;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
        } 
            case 21:{
                cuadroSeccion.setText("GEOGRAFIA");
                cuadroValor.setText("150 puntos");
                cuadroPregunta.setText("¿Cuál es el rió más largo del mundo?");
                op1.setText("Amazonas");
                op2.setText("Rio de Janeiro");
                op3.setText("Rio Sonora");
                op4.setText("Rio Nilo");
                JuegoJava.corr=4;
                if (op4.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+150;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
        }   
        case 22:{
                cuadroSeccion.setText("GE0GRAFIA");
                cuadroValor.setText("200 puntos");
                cuadroPregunta.setText("¿Qué país es el segundo más grande del mundo en términos de población?");
                op1.setText("India");
                op2.setText("China");
                op3.setText("Rusia");
                op4.setText("Induchina");
                JuegoJava.corr=1;
                if (op1.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+200;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
        }
            case 23:{
                cuadroSeccion.setText("Geografia");
                cuadroValor.setText("300 puntos");
                cuadroPregunta.setText("¿Cuántos océanos hay en la Tierra?");
                op1.setText("4");
                op2.setText("5");
                op3.setText("7");
                op4.setText("6");
                JuegoJava.corr=2;
                if (op2.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+300;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
                }
            case 24:{
                cuadroSeccion.setText("Geografia");
                cuadroValor.setText("500 puntos");
                cuadroPregunta.setText("¿Cuál es la parte más seca de la Tierra?");
                op1.setText("America del sur");
                op2.setText("Asia");
                op3.setText("Antartida");
                op4.setText("Hermosillo");
                JuegoJava.corr=3;
                if (op3.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+500;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
                }
               
               }   
        switch (JuegoJava.getCult()){
            case 25:{
                cuadroSeccion.setText("CULTURA GENERAL");
                cuadroValor.setText("50 puntos");
                cuadroPregunta.setText("¿¿Cuál es la ciudad más poblada del mundo?");
                op1.setText("Pekin,China");
                op2.setText("Shangai,China");
                op3.setText("Indonesia");
                op4.setText("Suiza");
                JuegoJava.corr=2;
                if (op2.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+50;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
            }
        case 26:{
                cuadroSeccion.setText("CULTURA GENERAL");
                cuadroValor.setText("100 puntos");
                cuadroPregunta.setText("¿Qué es el Cutis?");
                op1.setText("Piel de la cara");
                op2.setText("Piel de las piernas");
                op3.setText("Piel de las palmas");
                op4.setText("Ninguna de las anteriores");
                JuegoJava.corr=1;
                if (op1.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+100;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
        } 
            case 27:{
                cuadroSeccion.setText("CULTURA GENERAL");
                cuadroValor.setText("150 puntos");
                cuadroPregunta.setText("¿Quién compuso 'Las cuatro estaciones'?");
                op1.setText("Beethoven");
                op2.setText("Mozart");
                op3.setText("La Sonora Dinamita");
                op4.setText("Vivaldi");
                JuegoJava.corr=4;
                if (op4.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+150;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break;
        }   
            case 28:{
                cuadroSeccion.setText("CULTURA GENERAL");
                cuadroValor.setText("200 puntos");
                cuadroPregunta.setText("¿Cómo se conoce a la capa superior de la piel?");
                op1.setText("Epirdemis");
                op2.setText("Hipodermis");
                op3.setText("Dermis");
                op4.setText("Dermatermaculitis");
                JuegoJava.corr=1;
                if (op1.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+200;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
        }
            case 29:{
                cuadroSeccion.setText("CULTURA GENERAL");
                cuadroValor.setText("300 puntos");
                cuadroPregunta.setText("¿Cuántos huesos tiene un cuerpo humano adulto?");
                op1.setText("206");
                op2.setText("207");
                op3.setText("163");
                op4.setText("86");
                JuegoJava.corr=2;
                if (op2.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+300;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
                }
            case 30:{
                cuadroSeccion.setText("CULTURA GENERAL");
                cuadroValor.setText("500 puntos");
                cuadroPregunta.setText("¿Cuál es el único organo que puede regenerarse?");
                op1.setText("Pulmones");
                op2.setText("Corazon");
                op3.setText("Cerebro");
                op4.setText("Higado");
                JuegoJava.corr=4;
                if (op4.isSelected()){
                    correcto = true;
                    JuegoJava.puntaje=JuegoJava.puntaje+500;
                    System.out.println(JuegoJava.puntaje);
                    this.setVisible(false);
                }
                else{
                    correcto = false;
                }
                break; 
                }
        }*/  
    }                  
    
    public pantallaJuego() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        modificarText();
        dispose();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        op1 = new javax.swing.JButton();
        op2 = new javax.swing.JButton();
        op3 = new javax.swing.JButton();
        op4 = new javax.swing.JButton();
        cuadroSeccion = new javax.swing.JLabel();
        cuadroValor = new javax.swing.JLabel();
        cuadroPregunta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(212, 232, 46));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visuales/SECCION.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visuales/VALOR.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visuales/PREGUNTA.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);

        op1.setBackground(new java.awt.Color(255, 157, 130));
        op1.setText("......");
        op1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setBackground(new java.awt.Color(255, 157, 130));
        op2.setText("......");
        op2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setBackground(new java.awt.Color(255, 157, 130));
        op3.setText(".........");
        op3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        op4.setBackground(new java.awt.Color(255, 157, 130));
        op4.setText(".......");
        op4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        cuadroSeccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuadroSeccion.setText(".........");
        cuadroSeccion.setOpaque(true);

        cuadroValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuadroValor.setText(".......");
        cuadroValor.setOpaque(true);

        cuadroPregunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cuadroPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuadroPregunta.setText(".........");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cuadroSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cuadroValor, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(op2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cuadroPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuadroValor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadroSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cuadroPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        if((JuegoJava.corr!=0)){
            //pantallaTablero p = new pantallaTablero();
            //p.setVisible(true);
            switch (JuegoJava.corr) {
                case 5:
                    JuegoJava.puntaje=JuegoJava.puntaje+300;
                    break;
//CODIGO PARA LLEVAR A LA PANTALLA DE GANADORES UNA VEZ SE TERMINA EL QUIZZ.
            /*if((activos[0][0]=false) && (activos[1][0]=false) && (activos[2][0]=false) && (activos[3][0]=false) && (activos[4][0]=false) && (activos[5][0]=false)){
            pantallaGanadores Obj1= new pantallaGanadores();
            Obj1.setVisible(true);
            this.setVisible(false);*/
                case 6:
                    JuegoJava.puntaje=JuegoJava.puntaje+500;
                    break;
                case 7:
                    JuegoJava.puntaje=JuegoJava.puntaje+50;
                    break;
                case 9:
                    JuegoJava.puntaje=JuegoJava.puntaje+150;
                    break;
                default:
                    break;
            }
                
            }
            System.out.println(JuegoJava.puntaje);
            this.setVisible(false);
            pantallaTablero ObjVolver = new pantallaTablero();
            ObjVolver.setVisible(true);
        
    }//GEN-LAST:event_op4ActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
       if((JuegoJava.corr!=0)){
            //pantallaTablero p = new pantallaTablero();
            //p.setVisible(true);
            if (JuegoJava.corr==4) {
                JuegoJava.puntaje=JuegoJava.puntaje+200;
            }
            else if(JuegoJava.corr==10){
                JuegoJava.puntaje=JuegoJava.puntaje+200;
            }
            System.out.println(JuegoJava.puntaje);
            this.setVisible(false);
            pantallaTablero ObjVolver = new pantallaTablero();
            ObjVolver.setVisible(true);
        }
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        if((JuegoJava.corr!=0)){
            //pantallaTablero p = new pantallaTablero();
            //p.setVisible(true);
            switch (JuegoJava.corr) {
                case 1:
                    JuegoJava.puntaje=JuegoJava.puntaje+50;
                    break;
                case 2:
                    JuegoJava.puntaje=JuegoJava.puntaje+100;
                    break;
                case 3:
                    JuegoJava.puntaje=JuegoJava.puntaje+150;
                    break;
                default:
                    break;
            }
            if(JuegoJava.corr==11){
                JuegoJava.puntaje=JuegoJava.puntaje+300;
            }
            System.out.println(JuegoJava.puntaje);
            this.setVisible(false);
            pantallaTablero ObjVolver = new pantallaTablero();
            ObjVolver.setVisible(true);
        }
        
        
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
            if((JuegoJava.corr!=0)){
            //pantallaTablero p = new pantallaTablero();
            //p.setVisible(true);
            if (JuegoJava.corr==8) {
                JuegoJava.puntaje=JuegoJava.puntaje+100;
            }
            else if (JuegoJava.corr==12){
                JuegoJava.puntaje=JuegoJava.puntaje+500;
            }
            }
            System.out.println(JuegoJava.puntaje);
            this.setVisible(false);
            pantallaTablero ObjVolver = new pantallaTablero();
            ObjVolver.setVisible(true);
        
    }//GEN-LAST:event_op3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaJuego().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuadroPregunta;
    public javax.swing.JLabel cuadroSeccion;
    private javax.swing.JLabel cuadroValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton op1;
    private javax.swing.JButton op2;
    private javax.swing.JButton op3;
    private javax.swing.JButton op4;
    // End of variables declaration//GEN-END:variables
}
