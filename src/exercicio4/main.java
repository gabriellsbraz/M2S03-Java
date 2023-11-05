package exercicio4;

import exercicio3.Contador;

public class main {
    public static void main(String[] args) {

        String frase = "Frase de teste";

        Contador2 contarPalavras = new Contador2(frase);

        int numeroDePalavras = Contador.contarPalavras(frase);

        System.out.println("Número de palavras: " + numeroDePalavras);
    }
}
