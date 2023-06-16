import java.util.Scanner;

public class secao6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        //tarefa 1
        System.out.println("tarefa 1");

        System.out.println("escreva o PIN bancario");
        int PINdigitado = teclado.nextInt();

        int PINcorreto = 6666;

        while(PINdigitado != PINcorreto ){
            System.out.println("PIN errado escreva novamente");
            PINdigitado = teclado.nextInt();
        }
        System.out.println("Acesso liberado");

        System.out.println(" ");

        //tarefa 2 
        System.out.println("tarefa 2");

        System.out.println("escreva o número que você deseja saber os múltiplos");
        int numero = teclado.nextInt();

        teclado.close();

        for(int i = 1; i<=12; i++){
            System.out.print( " \n " + numero + " x " + i + " = " + i*numero );
        }

    }
}
