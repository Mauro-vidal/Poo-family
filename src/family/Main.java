package family;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Mauro", 20, "Masculino", "09/06/2004");
        Pessoa mae = new Pessoa("Creuzili", 58, "Feminino", "16/06/1966");
        Pessoa pai = new Pessoa("Mauro", 59, "Masculino", "08/05/1965");


        System.out.println("========= Dados dos pai =========== ");

        System.out.println(pai.ObterInformacoePai());
        System.out.println("====================================");

        System.out.println("\n========= Dados da mãe =========== ");

        System.out.println(mae.ObterInformacoesMae());
        System.out.println("====================================");
        System.out.println("\n========= Dados do filho =========== ");

        System.out.println(pessoa.Obterinformacoes());
        System.out.println("====================================");

    }






}