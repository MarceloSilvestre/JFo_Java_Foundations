package secao8;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        
        Equipe barcelona = new Equipe();
        Equipe realmadrid = new Equipe();
        Equipe valladolid = new Equipe();
        Equipe valencia = new Equipe();

        barcelona.setNome("Barcelona");
        realmadrid.setNome("Real Madrid");
        valladolid.setNome("Valladolid");
        valencia.setNome("Valencia");

        LigaFutebol liga = new LigaFutebol();

        Scanner teclado = new Scanner(System.in);

        double temperatura;
        int p1, p2;
        
        do {

            System.out.println("Digite a temperatura da semana");
            temperatura = teclado.nextDouble();
            System.out.println("Digite o placar do time 1");
            p1 = teclado.nextInt();
            System.out.println("Digite o placar do time 2");
            p2 = teclado.nextInt();

            jogo jogoSemana = new jogo();

            jogoSemana.setPlacarTime1(p1);
            jogoSemana.setPlacarTime2(p2);
            jogoSemana.setTemperatura(temperatura);

            jogoSemana.setTime1(barcelona);
            jogoSemana.setTime2(realmadrid);

            liga.tabelaDeJogos.add(jogoSemana);

            System.out.println(jogoSemana.getTime1().getNome()
            +" "+          jogoSemana.getPlacarTime1() +"x"+ jogoSemana.getPlacarTime2()
            +" "+          jogoSemana.getTime2().getNome());
            
        } while (temperatura > 0);

        jogo jogoDeAbertura = new jogo();

        jogoDeAbertura.setTemperatura(30);
        jogoDeAbertura.setTime1(barcelona);
        jogoDeAbertura.setTime2(realmadrid);
        jogoDeAbertura.setPlacarTime1(5);
        jogoDeAbertura.setPlacarTime2(0);
        
        liga.tabelaDeJogos.add(jogoDeAbertura);

        System.out.println(jogoDeAbertura.getTime1().getNome()
            +" "+          jogoDeAbertura.getPlacarTime1() +"x"+ jogoDeAbertura.getPlacarTime2()
            +" "+          jogoDeAbertura.getTime2().getNome());
        
    }
}
