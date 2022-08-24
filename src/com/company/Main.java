package com.company;

import java.util.Scanner;

public class Main {
    static String nome,rg,cpf;
    static int idade, unidade , curso;

    public static void main(String[] args) {
        boasVindas();
        cadastro();
        escolhaDeUnidade();
        relatorio();


    }
    static void boasVindas(){
        System.out.println("==========================================");
        System.out.println("**** Bem vindo ao Sistema Fiep. ****");
        System.out.println("===========================================");

    }
    static void cadastro(){
        System.out.println("Digite seu nome: ");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Digite seu RG: ");
        Scanner registroGeral = new Scanner(System.in);
        rg = registroGeral.nextLine();
        System.out.println("Digite seu CPF: ");
        Scanner numeroCpf = new Scanner(System.in);
        cpf = numeroCpf.nextLine();
        System.out.println("Parabéns " + nome + ", seu cadastro foi efetuado com sucesso.");
    }
    static void escolhaDeUnidade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============================================================");
        System.out.println("Qual unidade do senai você gostaria de realizar seus estudos? ");
        System.out.println("(1) Unidade Senai CIC.");
        System.out.println("(2) Unidade Senai Jardim Botânico.");
        System.out.println("(3) Unidade Senai Dr. Celso Charuri.");
        System.out.println("(4) Unidade Senai Boqueirão.");
        System.out.println("==============================================================");
        unidade = scanner.nextInt();
        if (unidade == 1){
            System.out.println("A unidade escolhida foi o Senai CIC.");
            escolhaDeCurso();
        }
        else if (unidade == 2){
            System.out.println("A unidade escolhida foi o Senai Jardim Botânico. .");
            escolhaDeCurso();
        }
        else if (unidade == 3){
            System.out.println("A unidade escolhida foi o Senai Dr. Celso Charuri.");
            escolhaDeCurso();
        }
        else if (unidade == 4){
            System.out.println("A unidade escolhida foi o Senai Boqueirão.");
            escolhaDeCurso();
        }else
        System.out.println("Essa unidade não existe, 'ERROR 404.'");

    }
        static void escolhaDeCurso(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("=================================================");
            System.out.println("Os cursos disponíveis nessa unidade é: ");
            System.out.println("(1)Desenvolvimento de Sistemas.");
            System.out.println("(2)Mecatrônica.");
            System.out.println("(3)Gastronomia.");
            System.out.println("(4)Administração.");
            System.out.println("=================================================");
            curso = scanner.nextInt();
            if (curso == 1) {
                System.out.println("Curso escolhido foi Desenvolvimento de Sistemas.");
            }
            if (curso == 1) {
                System.out.println("Curso escolhido foi Desenvolvimento de Sistemas.");
            }
            if (curso == 2){
                System.out.println("Curso escolhido foi Mecatrônica.");
            }
            if (curso == 3){
                System.out.println("Curso escolhido foi Gastronomia.");

            }
            if (curso == 4){
                System.out.println("Curso escolhido foi Administração.");

            }

    }

    static void relatorio(){
        System.out.println("=================================================");
        System.out.println("Relatório Final: ");
        System.out.println("Aluno: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("CPF: " + cpf + "   "+ "rg: "+ rg);
        System.out.println("ID da unidade: " + unidade);
        System.out.println("ID do curso:"+curso);
        System.out.println("=================================================");



    }




}
