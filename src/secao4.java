import java.util.Random;
import java.util.Scanner;

public class secao4 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        //tarefa 1 parte 1
        System.out.println("tarefa 1 parte 1");
        System.out.println("temperatura em farenheit");
        double farenheit = teclado.nextDouble();
        double celsius = (farenheit - 32) / 1.8;

        System.out.println("temperatura em celsius " + celsius);


        //tarefa 1 parte 2
        System.out.println("tarefa 1 parte 2");
        System.out.println("lado A");
        Double ladoA = teclado.nextDouble();
        System.out.println("lado B");
        double ladoB = teclado.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));

        System.out.println("a hipotenusa é " + hipotenusa);

        //tarefa 1 parte 3
        System.out.println("tarefa 1 parte 3");

        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int soma = dado1 + dado2;
        System.out.println("Resultado do lançamento dos dados: " + soma);


        //tarefa 2
        System.out.println("tarefa 2");

        System.out.println("Digite o nome completo: ");
        String nomeCompleto = teclado.next();

        String partesNome[] = nomeCompleto.split(" ");

        String primeiroNome = partesNome[0];
        String ultimoNome = partesNome[partesNome.length - 1];

        String primeiraInicial = String.valueOf(primeiroNome.charAt(0));

        System.out.println(ultimoNome + ", " + primeiraInicial);

        teclado.close();


        
    }
}
