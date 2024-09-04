package family;

public class Pessoa extends Mauro implements Informacoes {
    private String genero;
    private String dataNascimento;


    public Pessoa(String nome, Integer idade, String genero, String dataNascimento) {
        super(nome, idade);
        this.genero = genero;
        this.dataNascimento = dataNascimento;
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

    @Override
    public String Obterinformacoes() {

        return "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Gênero: " + getGenero() + "\n" +
                "Data de Nascimento: " + getDataNascimento();

    }

    @Override
    public String ObterInformacoesMae() {
        return "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Gênero: " + getGenero() + "\n" +
                "Data de Nascimento: " + getDataNascimento();

    }

    @Override
    public String ObterInformacoePai() {
        return "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Gênero: " + getGenero() + "\n" +
                "Data de Nascimento: " + getDataNascimento();

    }


}
