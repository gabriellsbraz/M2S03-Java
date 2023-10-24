package exercicio2;

public class Funcionario {

    private String nome;
    private Float salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentar(float aumento){
        if (aumento > 0) {
            salario += aumento;
        } else {
            System.out.println("O aumento deve ser um valor maior que zero.");
        }
    }

    public void aumentar(Float aumento, Float comissao) {
        if (aumento > 0 && comissao >= 0) {
            salario += (aumento + comissao);
        } else {
            System.out.println("O aumento e a comissão deve ser um valor positivo.");
        }
    }
}
