import java.util.Scanner;

public class Game {
    public void initGame() {
        Scanner scanner = new Scanner(System.in);


        int tentativa;
        int aleatorio;
        boolean isActive = true;

        while(isActive){
            tentativa = 0;
            aleatorio = (int) (Math.random() * 10);

            while (tentativa != aleatorio){
                System.out.println("Escolha de 0 a 9");
                tentativa = scanner.nextInt();

                if(tentativa > aleatorio){
                    System.out.println("Alto demais!");
                }else if(tentativa < aleatorio){
                    System.out.println("Baixo demais!");
                }
                if(tentativa == aleatorio){
                    System.out.println("acertou o numero: " + aleatorio );
                    isActive = false;
                }
            }

        }

    }
}
