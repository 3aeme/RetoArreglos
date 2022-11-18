
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class RetoArreglos {

    public static void main(String[] args) {
        System.out.println("Si desea guardar un numero ingrese 1");
        Scanner consola = new Scanner(System.in);
        int menu = consola.nextInt();
        int lista[] = new int[5];
        if (menu == 1) {
            do {
                System.out.println("Ingrese el numero del lugar de la casilla del 1 al 5");
                int numero = consola.nextInt();
                switch (numero) {
                    case 1:
                        System.out.println("Ingrese el numero que desea guardar");
                        int guardar = consola.nextInt();
                        lista[0] = guardar;
                        System.out.println("Si quiere guardar otro numero ingrese 1");
                        menu = consola.nextInt();
                        break;
                    case 2:
                        System.out.println("Ingrese el numero que desea guardar");
                        guardar = consola.nextInt();
                        lista[1] = guardar;
                        System.out.println("Si quiere guardar otro numero ingrese 1");
                        menu = consola.nextInt();
                        break;
                    case 3:
                        System.out.println("Ingrese el numero que desea guardar");
                        guardar = consola.nextInt();
                        lista[2] = guardar;
                        System.out.println("Si quiere guardar otro numero ingrese 1");
                        menu = consola.nextInt();
                        break;
                    case 4:
                        System.out.println("Ingrese el numero que desea guardar");
                        guardar = consola.nextInt();
                        lista[3] = guardar;
                        System.out.println("Si quiere guardar otro numero ingrese 1");
                        menu = consola.nextInt();
                        break;
                    case 5:
                        System.out.println("Ingrese el numero que desea guardar");
                        guardar = consola.nextInt();
                        lista[4] = guardar;
                        System.out.println("Si quiere guardar otro numero ingrese 1");
                        menu = consola.nextInt();
                        break;

                }
            } while (menu ==1);
        }
        System.out.println("Desea consultar los numero guardados? \n 1 = si");
        int numguardado = consola.nextInt();

        if (numguardado == 1) {
            for (int i = 0; i < lista.length; i++) {
                System.out.println("Numeros guardados " + ("[" + i +"]") + " = " + lista[i]);
            }
        }
    }
}
