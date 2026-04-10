package org.example;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
     //Atividades – Funções Matemáticas em Java
        System.out.print(" 1. Potência\n" +
                "      Crie um programa que:\n" +
                "      - Leia dois números inteiros.\n" +
                "      - Mostre o valor de a^b usando Math.pow().");
        Scanner sc= new Scanner(System.in);
        System.out.print("Atv01.potência: \nInsira o primeiro numero:");
        int potenciacao1 = sc.nextInt();
        System.out.print("Insira o segundo numero:");
        int potencia2 = sc.nextInt();
        int potenciaResposta =(int)Math.pow(potenciacao1,potencia2);
        System.out.println("Resultado:"+potenciaResposta);

        System.out.print("2. Raiz quadrada\n" +
                "Faça um programa que:\n" +
                "- Leia um número positivo.\n" +
                "- Mostre sua raiz quadrada com Math.sqrt().\n");
        System.out.print("Atv02.Raiz quadrada:\nInsira o numero:");
        double raiz1 =sc.nextDouble();
        double raizResposta =Math.sqrt(raiz1);
        System.out.println("Resultado:"+raizResposta);

        System.out.println("3. Valor absoluto\n" +
                "Escreva um programa que:\n" +
                "- Leia um número (positivo ou negativo).\n" +
                "- Mostre seu valor absoluto usando Math.abs().\n");
        System.out.print("Atv03.absoluto\nInsira o numero:");
        int abs = sc.nextInt();
        int absResultado= Math.abs(abs);
        System.out.println("Resultado:"+absResultado);

        System.out.print("4. Arredondamento\n" +
                "Crie um programa que:\n" +
                "- Leia um número decimal.\n" +
                "- Mostre:\n" +
                "- Arredondado para cima (Math.ceil())\n" +
                "- Arredondado para baixo (Math.floor())\n" +
                "- Arredondado normalmente (Math.round())\n");
        System.out.print("Atv04.Arredondamento:\nInsira o numero:");
        double arredondamento = sc.nextDouble();
        double resultadoArredondamentoMaior  = Math.ceil(arredondamento);
        double resultadoArredondamentoMenor  = Math.floor(arredondamento);
        double resultadoArredondamentoNormal = Math.round(arredondamento);
        System.out.println("Resultado Maior:"+resultadoArredondamentoMaior+"\nResultado Menor:"+resultadoArredondamentoMenor+"\nResultado Normal:"+resultadoArredondamentoNormal);

        System.out.print("5. Número aleatório\n" +
                "Faça um programa que:\n" +
                "- Gere um número inteiro aleatório entre 0 e 20 usando Math.random().\n" +
                "- Mostre o número na tela.\n");
        System.out.print("Atv05.Random" +
                "\nFiz != no código pósso colocar um valor limite que quiser" +
                "\nInsira o numero:");
        int rd =sc.nextInt();
        int resultadoRd =(int)(Math.random()*rd);
        System.out.println("Resultado:"+resultadoRd);

        System.out.print("6. Máximo e mínimo\n" +
                "Crie um programa que:\n" +
                "- Leia dois números.\n" +
                "- Mostre o maior e o menor usando Math.max() e Math.min().\n");
        System.out.print("Atv06.Max/Min\nInsira o primeiro numero");
        int maxMin1 = sc.nextInt();
        System.out.print("Insira o segundo numero:");
        int maxMin2 = sc.nextInt();
        System.out.print("Resposta Max:"+ Math.max(maxMin1,maxMin2)+"\nResposta Min:"+ Math.min(maxMin1,maxMin2));
        sc.close();
    }
}