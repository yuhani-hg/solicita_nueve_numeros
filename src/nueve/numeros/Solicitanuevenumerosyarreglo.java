package nueve.numeros;
import java.util.Scanner;
public class Solicitanuevenumerosyarreglo {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int[] arreglo=new int [9];
        int con;
        for (con=0; con<=8; con++)
        {
            System.out.print ("Ingresa un numero: ");
            arreglo[con]=leer.nextInt();
        }
    }
    
}
