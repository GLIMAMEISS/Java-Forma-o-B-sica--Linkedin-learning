import java.util.Scanner;

public class EstudanteApp {7,5
    public static void main(String[] args) {
     int idade = 28;
      char inicialDoNome= 'G';
      char inicialDoSobrenome= 'M';
      double media=10.0;
      boolean aprovado=true;
      String nome= "Gabriela";
      String sobrenome= "Meiss";
System.out.println(idade);
System.out.println(inicialDoNome);
System.out.println(inicialDoSobrenome);
System.out.println(media);
System.out.println(aprovado);
System.out.println(nome + " " + sobrenome);
System.out.println(inicialDoNome + "." + inicialDoSobrenome);
System.out.println(nome.charAt(0));
System.out.println(nome.charAt(7));
System.out.println (nome.length());
System.out.println(nome.equals(sobrenome));
Scanner scanner = new Scanner(System.in);
media = scanner.nextDouble();
System.out.println(media);
    }
}
