import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Random rd = new Random();
    Scanner tl = new Scanner(System.in);

    int menu;
    String mao[] = { "PEDRA", "PAPEL", "TESOURA" };
    int j1, com = rd.nextInt(3);

    System.out.println("|----------------------------------|");
    System.out.println("|------BEM-VINDO-AO-JO-KEN-PO------|");
    System.out.println("|-------QUE-OS-JOGOS-COMEÇEM-------|");
    System.out.print("|----------------------------------|");

    System.out.println("\nDigite [1] para jogar ou [0] para não jogar");
    menu = tl.nextInt();

    if (menu != 1 && menu != 0) {
      do {
        System.out.println("NUMERO INVALIDO TENTE NOVAMENTE!!!");
        System.out.println("Digite [1] para jogar ou [0] para não jogar");
        menu = tl.nextInt();
      } while (menu != 1 && menu != 0);
    }

    while (menu == 1) {

      System.out.println("DIGITE O NUMERO DE ACORDO COM SUA ESCOLHA ^.^");
      System.out.println("[0]PEDRA [1]PAPEL [2]TESOURA");
      j1 = tl.nextInt();

      if (j1 != 0 && j1 != 1 && j1 != 2) {
        do {
          System.out.println("NUMERO INVALIDO TENTE NOVAMENTE!!!");
          System.out.println("DIGITE O NUMERO DE ACORDO COM SUA ESCOLHA ^.^");
          System.out.println("[0]PEDRA [1]PAPEL [2]TESOURA");
          j1 = tl.nextInt();
        } while (j1 != 0 && j1 != 1 && j1 != 2);
      }

      if (mao[j1] == mao[com]) {

        System.out.println("\n\n| Jogador | Maquina |");
        System.out.println("  " + mao[j1] + " X " + mao[com]);
        System.out.print("Empate entre jogador e maquina!!!");

      } else if (j1 == 0 && com == 2) {
        System.out.println("\n\n| Jogador | Maquina |");
        System.out.println("  " + mao[j1] + " X " + mao[com]);
        System.out.print("Parabens você ganhou!!!");

      } else if (j1 == 2 && com == 1) {
        System.out.println("\n\n| Jogador | Maquina |");
        System.out.println("  " + mao[j1] + " X " + mao[com]);
        System.out.print("Parabens você ganhou!!!");

      } else if (j1 == 1 && com == 0) {
        System.out.println("\n\n| Jogador | Maquina |");
        System.out.println("  " + mao[j1] + " X " + mao[com]);
        System.out.print("Parabens você ganhou!!!");

      } else {
        System.out.println("\n\n| Jogador | Maquina |");
        System.out.println("  " + mao[j1] + " X " + mao[com]);
        System.out.print("Que pena você perdeu :(");

      }

      System.out.println("\n\nDeseja continuar? [1] Sim ou [0] Não");
      menu = tl.nextInt();
      if (menu != 1 && menu != 0) {
        do {
          System.out.println("NUMERO INVALIDO TENTE NOVAMENTE!!!");
          System.out.println("Digite [1] Continuar ou [0] para Sair");
          menu = tl.nextInt();
        } while (menu != 1 && menu != 0);
      }
    }

    System.out.println("|----------------------------------|");
    System.out.println("|---------JOGO-FINALIZADO----------|");
    System.out.println("|--------OBRIGADO-POR-JOGAR--------|");
    System.out.println("|----------------------------------|");
  }

}
