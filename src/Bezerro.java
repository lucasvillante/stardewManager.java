public class Bezerro extends VacaMae {
    public Bezerro(String nome, int idade, String raca) {
        super(nome, idade, raca, "Crescendo");
        setTipo("Bezerro");
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuu!");
    }

    @Override
    public void coletarProduto() {
        System.out.println(getNome() + " ainda não produz leite.");
    }
}