public class Pintinho extends GalinhaMae {
    public Pintinho(String nome, int idade, String raca) {
        super(nome, idade, raca, "Crescendo");
        setTipo("Pintinho");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu piu!");
    }

    @Override
    public void coletarProduto() {
        System.out.println(getNome() + " ainda não bota ovos.");
    }
}