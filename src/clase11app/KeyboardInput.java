package clase11app;

import java.io.*;

public class KeyboardInput {

    public static void main(String[] args) {
        String s;
        // Crear un Reader en búfer para leer
        // cada línea procedente del teclado.
        InputStreamReader ir
                = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.println("Unix: Escriba ctrl-d para salir."
                + "\nWindows: Escriba ctrl-z para salir.");

        try {
            // Leer cada línea de entrada y reproducirla
            s = in.readLine();
            while (s != null) {
                System.out.println("Leer: " + s);
                s = in.readLine();
            }
            // Cerrar el Reader del búfer.
            in.close();
        } catch (IOException e) { // Capturar cualquier excepción.
            e.printStackTrace();
        }
    }
}
