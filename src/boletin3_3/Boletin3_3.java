
package boletin3_3;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo cir1=new Circulo();
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Agregar radio :");
        cir1.setRadio(sc.nextDouble());
        
        System.out.println(cir1.calcularArea());

        System.out.println(cir1.calcularLonxitud());
    }
    
}
