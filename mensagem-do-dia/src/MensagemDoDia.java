import java.util.Scanner;

public class  MensagemDoDia{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       System.out.println("Digite um numero de 1 a 10");
        int numero = scanner.nextInt();
    
        
       if (numero >= 1  && numero<= 5) {
          String mensagem = "Quem avisa amigo é";
          System.out.println(mensagem);
           
       } else if (numero >= 6 && numero <= 10){
           String mensagem = "Voce é o que voce come";
           System.out.println(mensagem);
           
       } else {
        String  mensagem = "Voce é um animal";
        System.out.println(mensagem);
       }


    }
}
