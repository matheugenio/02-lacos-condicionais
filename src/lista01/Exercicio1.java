package lista01;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numa,numb,numc,soma;
        System.out.println("Digite o numero A:");
        numa = sc.nextInt();
        System.out.println("Digite o numero B: ");
        numb = sc.nextInt();
        System.out.println("Digite o numero C:");
        numc = sc.nextInt();
        soma = numa+numb;
        if (soma > numc){
            System.out.println(numa+" + "+numb+" = "+soma+" > "+numc);
            System.out.println("A soma de A + B é maior que C");
        }else if (soma < numc) {
            System.out.println(numa+" + "+numb+" = "+soma+" < "+numc);
            System.out.println("A soma de A + B é menor que C");
        } else {
            System.out.println(numa+" + "+numb+" = "+soma+" = "+numc);
            System.out.println("A soma de A + B é igual a C");
        }
        sc.close();
    }
}
