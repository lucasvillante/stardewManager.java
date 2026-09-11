public class OvelhaMae extends AnimalFazenda {
    public OvelhaMae(String nome, int idade, String raca, String status) {
        super(nome, idade, raca, "Ovelha", status);
    }

    @Override
    public void emitirSom() {
        System.out.println("Mééé!");
    }

    @Override
    public void coletarProduto() {
        System.out.println("Você coletou lã da " + getNome() + "!");
    }
}