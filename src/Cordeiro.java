public class Cordeiro extends OvelhaMae {
    public Cordeiro(String nome, int idade, String raca) {
        super(nome, idade, raca, "Crescendo");
        setTipo("Cordeiro");
    }

    @Override
    public void emitirSom() {
        System.out.println("Mééé! (baixinho)");
    }

    @Override
    public void coletarProduto() {
        System.out.println("Ainda não é possivel coletar a lã de "+ getNome());
    }
}