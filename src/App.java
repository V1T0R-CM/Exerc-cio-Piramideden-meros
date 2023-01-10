import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Você deseja que sua piramide tenha quantas camadas:\n");
        Scanner entrada = new Scanner(System.in);

        final int quantCamadas = entrada.nextInt();

        for (int i = 1; i <= quantCamadas; i++) {
            String camada = "";
            for (int j = 0; j < i; j++) {
                camada += i;
            }
            System.out.println(camada);
        }
    }
}
