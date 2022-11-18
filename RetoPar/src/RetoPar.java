
import java.util.Random;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class RetoPar {

    public static void main(String[] args) {
        System.out.println("Desea separar la lista entre par e impar \n Par= 1 \n Impar = 2");
        Scanner consola = new Scanner(System.in);
        int numeros = consola.nextInt();
        Random r = new Random();
        int valor1 = r.nextInt();
        int valor2 = r.nextInt();
        int valor3 = r.nextInt();
        int valor4 = r.nextInt();
        int valor5 = r.nextInt();
        int valor6 = r.nextInt();
        int valor7 = r.nextInt();
        int valor8 = r.nextInt();
        int valor9 = r.nextInt();
        int valor10 = r.nextInt();
        int valor11 = r.nextInt();
        int valor12 = r.nextInt();
        int valor13 = r.nextInt();
        int valor14 = r.nextInt();
        int valor15 = r.nextInt();
        int valor16 = r.nextInt();
        int valor17 = r.nextInt();
        int valor18 = r.nextInt();
        int valor19 = r.nextInt();
        int valor20 = r.nextInt();
        if (numeros == 1) {
            int par[] = new int[20];
            par[0] = valor1;
            par[1] = valor2;
            par[2] = valor3;
            par[3] = valor4;
            par[4] = valor5;
            par[5] = valor6;
            par[6] = valor7;
            par[7] = valor8;
            par[8] = valor9;
            par[9] = valor10;
            par[10] = valor11;
            par[11] = valor12;
            par[12] = valor13;
            par[13] = valor14;
            par[14] = valor15;
            par[15] = valor16;
            par[16] = valor17;
            par[17] = valor18;
            par[18] = valor19;
            par[19] = valor20;
            for (int i = 0; i < par.length; i++) {
                if (par[i] % 2 == 0) {
                    System.out.println(par[i]);
                }
            }
        } else if (numeros == 2) {
            int par[] = new int[20];
            par[0] = valor1;
            par[1] = valor2;
            par[2] = valor3;
            par[3] = valor4;
            par[4] = valor5;
            par[5] = valor6;
            par[6] = valor7;
            par[7] = valor8;
            par[8] = valor9;
            par[9] = valor10;
            par[10] = valor11;
            par[11] = valor12;
            par[12] = valor13;
            par[13] = valor14;
            par[14] = valor15;
            par[15] = valor16;
            par[16] = valor17;
            par[17] = valor18;
            par[18] = valor19;
            par[19] = valor20;

            for (int i = 0; i < par.length; i++) {
                if (par[i] % 2 != 0) {
                    System.out.println(par[i]);
                }
            }
        }

    }
}
