import java.util.Scanner;

public class secao3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("qual seu nome");
        String nome = teclado.next();
        System.out.println("qual sua idade?");
        int idade = teclado.nextInt();
        System.out.println("qual seu salario");
        double salario = teclado.nextDouble();
        System.out.println("as proximas 7 entradas sao pra cumprir os requisitos da atividade escreva qualquer coisa");
        String s1 = teclado.next();
        String s2 = teclado.next();
        String s3 = teclado.next();
        String s4 = teclado.next();
        String s5 = teclado.next();
        String s6 = teclado.next();
        String s7 = teclado.next();

        teclado.close();

        int idade20anos = idade + 20;
        double dobrosalario = salario * 2;



        System.out.println("nome: " + nome);
        System.out.println("sua idade em 20 anos será: " + idade20anos);
        System.out.println("o dobro do seu salario é: " + dobrosalario);

        
    }
}
