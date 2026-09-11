public class VacaMae extends AnimalFazenda {
    public VacaMae(String nome, int idade, String raca, String status) {
        super(nome, idade, raca, "Vaca", status);
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuu!");
    }

    @Override
    public void coletarProduto() {
        System.out.println("Você coletou um balde de leite da " + getNome() + "!");
    }
}