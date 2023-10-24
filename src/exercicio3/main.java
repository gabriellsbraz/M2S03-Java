package exercicio3;

public class main {
    public static void main(String[] args) {

        String frase = "Toc toc! Quem é? Dem, Dem quem? Demorou pra contar as palavras e eu esqueci a piada!";

        int numeroDePalavras = Contador.contarPalavras(frase);

        System.out.println("Número de palavras: " + numeroDePalavras);
    }
}
