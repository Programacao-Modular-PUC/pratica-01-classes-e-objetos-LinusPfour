/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_pratica01_ex01;

import java.util.Scanner;

public class PM_Pratica01_ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        TrianguloRetangulo t = new TrianguloRetangulo();

        System.out.print("Cateto 1: ");
        t.setC1(entrada.nextDouble());
        System.out.print("Cateto 2: ");
        t.setC2(entrada.nextDouble());

        System.out.print("\nHipotenusa: " + t.CalculaHipotenusa());
        System.out.print("\nArea: " + t.CalculaArea() + "\n\n");
    }
}
