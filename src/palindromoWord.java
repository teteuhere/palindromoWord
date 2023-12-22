import java.util.Scanner;

public class palindromoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("Digite uma palavra para verificar se é um palíndromo (ou 'sair' para encerrar): ");
            userInput = scanner.nextLine().toLowerCase();
            if (!userInput.equals("sair")) {
                String wordInvert = invertWord(userInput);
                if (userInput.equals(wordInvert)) {
                    System.out.println("A palavra é um palíndromo.");
                } else {
                    System.out.println("A palavra não é um palíndromo.");
                }
            }
        } while (!userInput.equals("sair"));
        System.out.println("Programa encerrado.");
        scanner.close();
    }

    private static String invertWord(String word) {
        StringBuilder invertedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            invertedWord.append(word.charAt(i));
        }
        return invertedWord.toString();
    }
}
