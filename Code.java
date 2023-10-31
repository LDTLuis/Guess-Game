import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        Scanner read = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao Jogo de Adivinha! Tente adivinhar o número que nossa máquina gerou.");

        while (true) {
            System.out.println("Digite sua suposição: ");
            int suposicao = read.nextInt();

            if (suposicao < randomNumber) {
                System.out.println("Tente um número maior.");
            } else if (suposicao > randomNumber) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns, você acertou o número!");
                break;
            }
        }
    }
}
