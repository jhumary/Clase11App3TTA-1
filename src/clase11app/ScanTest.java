/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11app;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author JUAN CARLOS
 */
public class ScanTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String param = s.next();
        System.out.println("parámetro 1" + param);
        int value = s.nextInt();
        System.out.println("segundo parámetro" + value);
        s.close();
    }

}
