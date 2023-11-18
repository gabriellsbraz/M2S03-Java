package exercicio5;

import javax.swing.text.DateFormatter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {

        List<Concurso> lista = new ArrayList<>();

        Path arquivo = Paths.get("src","exercicio5","megasena.txt");
        if(Files.notExists((arquivo))){
            System.out.println("Arquivo nao encontrado!");
        }

        List<String> linhas = Files.readAllLines(arquivo);

        for(String linha : linhas) {
            String[] split = linha.split(",");
            int numero = Integer.parseInt(split[0]);
            String dataStr = split[1];

            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(dataStr, formatador);

            int[] sorteado = new int[6];
            for(int i=0; i <= 5; i++){
                String n = split[i+2];
                sorteado[i] = Integer.parseInt(n);
            }

            Concurso concurso = new Concurso(numero, data, sorteado);
            lista.add(concurso);
        }

        lista.forEach(c -> System.out.println(c));

    }
}



//        e) Crie uma classe 'Principal' com método 'main'. Neste método, implemente a leitura do arquivo em anexo contendo o resultados de sorteios
//        da mega-sena, e para cada linha, instancie um objeto de 'Concurso' e armazene eles em um ArrayList para manipulação posterior.
//        f) Imprima esta lista de concursos carregadas a partir do arquivo no console.
//
//        Dicas:
//
//        Como é um arquivo csv, usar o método split() para separar os itens, e depois instanciar um objeto concurso para cada linha do arquivo,
//        carregando os atributos com os valores.
//
//        Para imprimir os itens de um array, pode-se usar o método utilitário 'Arrays.toString()'.