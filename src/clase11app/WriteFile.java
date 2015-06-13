package clase11app;

import java.io.*;

public class WriteFile {

    public static void main(String[] args) {
        // Crea el archivo
        File file = new File(args[0]);

        try {
            // Crea un Reader en el búfer
            InputStreamReader isr
                    = new InputStreamReader(System.in);
            BufferedReader in
                    = new BufferedReader(isr);
            // Crea un Writer para enviar los datos al archivo.
            PrintWriter out
                    = new PrintWriter(new FileWriter(file));
            String s;
            System.out.print("Introduzca el texto del archivo. ");
            System.out.println("[Escriba ctrl-d para terminar.]");

            // Lee cada línea de entrada
            s = in.readLine();
            if (s != null) {
                out.println(s);
            }

            // Cierra el Reader del búfer
            in.close();
            out.close();

        } catch (IOException e) {
            // Captura cualquier otra excepción de ES.
            e.printStackTrace();
        }
    }
}
