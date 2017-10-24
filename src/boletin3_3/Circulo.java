
package boletin3_3;

/**
 *
 * @author David
 */
public class Circulo {
    private double radio;
    public final double numPi=3.14;
    
    //CONSTRUCTORES
    public Circulo(){
        
    }
    public Circulo(double ra){
        radio=ra;
    }
    
    //METODOS DE ACCESO
    public void setRadio(double ra){
        radio=ra;
    }
    public double getRadio(){
        return radio;
    }
    
    public double calcularArea(){
         double area=numPi*Math.pow(radio, 2);
         return area;
    }
    public double calcularLonxitud(){
         double lonxitud=2*numPi*radio;
         return lonxitud;
    }
    
    
}
