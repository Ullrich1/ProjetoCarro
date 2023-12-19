import java.util.Scanner;


public class Main {
    public void fazerCarroAndar(Carro carro){
        carro.andar();
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Main m = new Main();
        m.fazerCarroAndar(new Carro());
        m.fazerCarroAndar(new Sedan());
        System.out.println("-*-*-*-*-*-*-*-*");
        System.out.println("Você encontrou uma calçada cheia de pedestres, o que vai fazer??");
        System.out.println(" ");
        String bater = ler.nextLine();

        if (bater.equals("acelera")){
            System.out.println("\uD83D\uDE97 \uD83D\uDCA8 \uD83D\uDCA8");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }

            System.out.println("\uD83D\uDE97 \uD83D\uDCA8 \uD83D\uDCA8 \uD83D\uDCA8  ");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }

            System.out.println("\uD83D\uDE97 \uD83D\uDCA8 \uD83D\uDCA8 \uD83D\uDCA8 \uD83D\uDCA8  ");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }

            System.out.println("O CARRO BATEU E 25 PESSOAS ESTÃO MORTAS A CULPA É TODA SUAAAAAAA");
        }
    }

}