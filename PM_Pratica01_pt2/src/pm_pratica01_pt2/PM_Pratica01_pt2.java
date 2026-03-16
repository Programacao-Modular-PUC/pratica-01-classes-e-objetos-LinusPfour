/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_pratica01_pt2;

import java.util.Scanner;

public class PM_Pratica01_pt2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome, sobrenome;
        int idade;
        double altura, peso, imc;
        String classificacao;

        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = entrada.nextLine();
        System.out.print("Idade: ");
        idade = entrada.nextInt();
        System.out.print("Altura: ");
        altura = entrada.nextDouble();
        System.out.print("Peso: ");
        peso = entrada.nextDouble();

        Pessoa p = new Pessoa(nome, sobrenome, idade, altura, peso);
        imc = p.calculaIMC();
        classificacao = p.informaObesidade();

        System.out.println("\nNome: " + p.getNome() + " " + p.getSobrenome());
        System.out.println("Idade: " + p.getIdade());
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao + "\n");
    }
}
