/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uti;

/**
 *
 * @author Freddy
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AREA DE UN POLOIGONO REGULAR DE OCHO LADOS- OCTAGONO
     int area,perimetro,numlado,apotema,longitudlado;
        int cm;
        numlado=8;
        apotema=7;
        longitudlado=10;
        
                area=(numlado*apotema*longitudlado)/2;
                perimetro=numlado*longitudlado;
                if (numlado==8){
              System.out.println("El poligono de "+numlado+" Lados es un OCTAGONO"); 
              System.out.println("dado los  valores: ");
              System.out.println("apotema: "+apotema);
              System.out.println("numlado: "+numlado);
              System.out.println("longitudlado: "+longitudlado);
               System.out.println("Su area es "+area);
              System.out.println("Su Perimetro es "+perimetro);
    }
        
    }    
    
}

