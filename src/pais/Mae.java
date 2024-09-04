package pais;

import java.util.PrimitiveIterator;

public class Mae {

    public Mae(String nome, Integer idade, String Genero, String dataNascimento) {
        this.nome = nome;
        this.idade = idade;
    }

    private String nome;
    private Integer idade;
    private String genero;
    private String dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public void exibirNome() {

        System.out.println("Meu nome é: " + getNome());
    }

    public void exibirIdade(){
        System.out.println("Idade: "+getIdade());
    }

    public void exibirGenero() {

        System.out.println("Gênero: " + getGenero());
    }

    public void exibirDataNascimento() {

        System.out.println("Data de nascimento: " + getDataNascimento());
    }
}
