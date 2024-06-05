package lista02;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod,qtd;
        float total;

        System.out.println("Código do produto: ");
        cod = sc.nextInt();
        System.out.println("Quantidade: ");
        qtd = sc.nextInt();
        switch (cod){
            case 1:
                total = 10 * qtd;
                System.out.println("Produto: Cachorro Quente");
                System.out.printf("Valor total: R$ %.2f", total);
                break;
            case 2:
                total = 15 * qtd;
                System.out.println("Produto: X-Salada");
                System.out.printf("Valor total: R$ %.2f", total);
                break;
            case 3:
                total = 18 * qtd;
                System.out.println("Produto: X-Bacon");
                System.out.printf("Valor total: R$ %.2f", total);
                break;
            case 4:
                total = 12 * qtd;
                System.out.println("Produto: Bauru");
                System.out.printf("Valor total: R$ %.2f", total);
                break;
            case 5:
                total = 8 * qtd;
                System.out.println("Produto: Refrigerante");
                System.out.printf("Valor total: R$ %.2f", total);
                break;
            case 6:
                total = 13 * qtd;
                System.out.println("Produto: Suco de Laranja");
                System.out.printf("Valor total: R$ %.2f", total);
                break;

            default:
                System.out.println("Digite um número válido");
        }

        sc.close();
    }
}
