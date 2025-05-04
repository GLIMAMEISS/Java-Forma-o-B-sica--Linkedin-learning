import java.util.Scanner;

public class Quiz {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        // Pergunta 1
        System.out.println("1) Qual das alternativas responde corretamente à pergunta \"How are you?\"");
        System.out.println("A) I am Brazilian.");
        System.out.println("B) I am fine, thank you.");
        System.out.println("C) I am a teacher.");
        System.out.print("Digite a letra da alternativa correta: ");
        String resposta1 = scanner.nextLine();

        if (resposta1.equalsIgnoreCase("B")) {
            System.out.println("✅ Resposta correta!\n");
            pontuacao++;
        } else {
            System.out.println("❌ Resposta incorreta. A resposta certa é a letra B.\n");
        }

        // Pergunta 2
        System.out.println("2) Como se pergunta 'Qual é o seu nome?' em inglês?");
        System.out.println("A) How are you?");
        System.out.println("B) Where do you live?");
        System.out.println("C) What's your name?");
        System.out.print("Digite a letra da alternativa correta: ");
        String resposta2 = scanner.nextLine();

        if (resposta2.equalsIgnoreCase("C")) {
            System.out.println("✅ Correto!\n");
            pontuacao++;
        } else {
            System.out.println("❌ Errado. A resposta correta é: C) What's your name?\n");
        }

        // Pergunta 3
        System.out.println("3) A palavra \"actually\" significa:");
        System.out.println("A) Na verdade");
        System.out.println("B) De fato");
        System.out.println("C) Na realidade");
        System.out.print("Digite a letra da alternativa correta: ");
        String resposta3 = scanner.nextLine();

        if (resposta3.equalsIgnoreCase("A")) {
            System.out.println("✅ Correto!\n");
            pontuacao++;
        } else {
            System.out.println("❌ Errado. A resposta correta é: A) Na verdade\n");
        }

        // Resultado final
        System.out.println("🎉 Quiz finalizado! Parabéns!");
        System.out.println("Você acertou " + pontuacao + " de 3 perguntas.");

        if (pontuacao == 3) {
            System.out.println("🏆 Você é um expert em inglês!");
        } else if (pontuacao == 2) {
            System.out.println("👍 Bom trabalho! Continue praticando.");
        } else {
            System.out.println("📘 Não desista! Continue estudando.");
        }

        scanner.close();
    }
}
// O código acima é um exemplo de um quiz simples em Java. Ele faz três perguntas sobre inglês e calcula a pontuação do usuário com base nas respostas corretas. O resultado final é exibido com uma mensagem personalizada dependendo da pontuação obtida. 	