package exercicio4;

public class Contador2 {
    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public int contarPalavras(String frase) {
        if(frase == null || frase.isEmpty()){
            return 0;
        }
        String[] palavras = frase.split(" ");
        return palavras.length;
    }
}
