package exercicio3;

public class Contador {

    public static int contarPalavras(String frase) {
        if (frase == null || frase.isEmpty()) {
            return 0;
        }

        String[] palavras = frase.split("\\s+");
        return palavras.length;
    }
}
