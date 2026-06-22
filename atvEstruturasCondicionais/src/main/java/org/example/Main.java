package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-----atv01");
        System.out.print("Verificar se você pode votar\n"+"Insira sua idade:");
        Scanner sc= new Scanner(System.in);
        int idade = sc.nextInt();
       if (idade<16){
           System.out.println("Não pode votar");
       }
       else if (idade<18 ||idade>70 ) {
           System.out.println("voto facultativo");
       }
       else{
           System.out.println("Voto obrigatório");
       }
        System.out.println("-----atv02");
        System.out.print("Verificar numero se é positivo, negativo ou zero\nInsira um numero:");
        int numeroPNZ = sc.nextInt();
        if (numeroPNZ > 0) {
            System.out.println("Positivo");
        } else if (numeroPNZ < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("O valor é zero");
        }
        System.out.println("----atv03");
        System.out.println("Classificar dia da semana\nInsira um numero de 1 a 7:");
        int diaSem = sc.nextInt();
        String dia;
        switch (diaSem){
            case 1:
                dia="domingo";
                break;
            case 2:
                dia="segunda";
                break;
            case 3:
                dia="terça";
                break;
            case 4:
                dia="quarta";
                break;
            case 5:
                dia="quinta";
                break;
            case 6:
                dia="sexta";
                break;
            case 7:
                dia="sabado";
                break;
            default:
                dia="numero invalido";
                break;
        }
        System.out.println("O dia da semana é "+dia);
        System.out.println("--------atv04");
        System.out.print("Calculadora simples\nInsira o primeiro numero:");
        double calc1 = sc.nextDouble();
        System.out.print("Insira a operação(+,-,*,/):");
        String equacao = sc.next();
        System.out.println("Insira o segundo numero:");
        double calc2 = sc.nextDouble();
        double resultado;
        switch (equacao){
            case "+":
                resultado=calc1 +calc2;
                System.out.printf("Resultado:%.2f", resultado);
                break;
            case "-":
                resultado=calc1-calc2;
                System.out.printf("Resultado:%.2f", resultado);
            case "*":
                resultado=calc1*calc2;
                System.out.printf("Resultado:%.2f", resultado);
                break;
                case "/":
                    resultado=calc1/calc2;
                    System.out.printf("Resultado:%.2f", resultado);
                    break;
            default:
                System.out.println("Operação invalida");
                break;

        }



        sc.close();
    }

}