package family;

public class Mauro {

    private String nome;
    private Integer idade;

    public Mauro(String nome, Integer idade) {

        this.nome = nome;
        this.idade = idade;
    }

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

    public void exibirNome() {

        System.out.println("Meu nome é: " + getNome());
    }

    public void exibirIdade(){
        System.out.println("Idade: "+getIdade());
    }
}
