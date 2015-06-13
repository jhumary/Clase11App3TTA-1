package clase11app;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) {
        // Crea el archivo
        File file = new File(args[0]);

        try {
            // Crea un Reader en búfer
            // para leer cada línea del archivo.
            BufferedReader in
                    = new BufferedReader(new FileReader(file));
            String s;

            try {
                // Lee cada línea del archivo
                s = in.readLine();
                while (s != null) {
                    System.out.println("Lectura: " + s);
                    s = in.readLine();
                }
            } finally {
                // Cierra el Reader del búfer
                in.close();
            }

        } catch (FileNotFoundException e1) {
            // Si el archivo no existe
            System.err.println("Archivo no encontrado: " + file);

        } catch (IOException e2) {
            // Captura cualquier otra excepción de ES.
            e2.printStackTrace();
        }

    }
}
