import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Principal {
    public static void main(String[] args) {

        //Escritura en el fichero datos.txt
        System.out.println("\nESCRITURA EN DATOS.TXT: ");
        PrintWriter ficheroEscritura = null;
        try {
            ficheroEscritura = new PrintWriter(new FileWriter("datos.txt"));
            for (int i = 1; i <= 10; i++) {
                System.out.println("Escribiendo número: " + i);
                ficheroEscritura.println(i); //Escribimos los numeros del 1 al 10 por linea en cada iteraccion el fichero datos.txt
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ficheroEscritura != null) ficheroEscritura.close(); //Cerramos el fichero
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //Lectura en el fichero datos.txt
        System.out.println("\nLECTURA DE DATOS.TXT: ");
        BufferedReader ficheroLectura = null;

        try {
            ficheroLectura = new BufferedReader(new FileReader("datos.txt"));
            String linea = ficheroLectura.readLine();

            while (linea != null) {
                System.out.println("Leído número: " + linea);
                linea = ficheroLectura.readLine(); //Leemos las lineas que hemos escrito anteriormente
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (ficheroLectura != null) ficheroLectura.close(); //Cerramos el fichero al finalizar
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
