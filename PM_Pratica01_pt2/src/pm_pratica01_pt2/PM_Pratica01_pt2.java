/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_pratica01_pt2;

import java.util.Scanner;

public class PM_Pratica01_pt2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pessoa[] cadastro = new Pessoa[10];
        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Cadastro " + (i + 1));

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = entrada.nextLine();

            System.out.print("Dia de nascimento: ");
            int dia = entrada.nextInt();

            System.out.print("Mes de nascimento: ");
            int mes = entrada.nextInt();

            System.out.print("Ano de nascimento: ");
            int ano = entrada.nextInt();

            System.out.print("Altura: ");
            double altura = entrada.nextDouble();

            System.out.print("Peso: ");
            double peso = entrada.nextDouble();
            entrada.nextLine();

            Data dataNascimento = new Data(dia, mes, ano);
            cadastro[i] = new Pessoa(nome, sobrenome, dataNascimento, altura, peso);
            total++;

            if (i > 0) {
                String nomeAtual = cadastro[i].getNome() + cadastro[i].getSobrenome();
                String nomeAnterior = cadastro[i - 1].getNome() + cadastro[i - 1].getSobrenome();

                if (nomeAtual.equalsIgnoreCase(nomeAnterior)) {
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < total; i++) {
            System.out.println("Cadastro " + (i + 1));
            System.out.println("Nome completo: " + cadastro[i].getNome() + " " + cadastro[i].getSobrenome());
            System.out.println("Nome de referencia: " + cadastro[i].getSobrenome() + ", " + cadastro[i].getNome().toUpperCase());
            System.out.println("Idade: " + cadastro[i].calculaIdade());
            System.out.println("Peso: " + cadastro[i].getPeso());
            System.out.println("Altura: " + cadastro[i].getAltura());
            System.out.printf("IMC: %.2f%n", cadastro[i].calculaIMC());
            System.out.println("Classificacao: " + cadastro[i].informaObesidade());
            System.out.println();
        }
    }
}
