public class GalinhaMae extends AnimalFazenda {
    public GalinhaMae(String nome, int idade, String raca, String status) {
        super(nome, idade, raca, "Galinha", status);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cocoricó!");
    }

    @Override
    public void coletarProduto() {
        System.out.println("Você coletou um ovo da " + getNome() + "!");
    }
}