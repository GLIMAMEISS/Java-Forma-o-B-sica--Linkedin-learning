import java.util.Scanner;

public class RepeticaoMusica {
    public static void main(String[] args)  {
        Boolean Repeat = true;
         while (Repeat ==true) {
            System.out.println("Tocar a música");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Deseja repetir a música? (true/faflse)");
             Repeat = scanner.nextBoolean();
             
         }
         System.out.println("Fim da execução");

    }
}
