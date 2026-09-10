public class GalinhaMae implements Animal {
        private String nome;
        private int idade;
        private String raca;

        public GalinhaMae(String nome, int idade, String raca) {
            this.nome = nome;
            this.idade = idade;
            this.raca = raca;
        }

        @Override
        public void emitirSom() {
            System.out.println("Cocoricó!");
        }

        @Override
        public void coletarProduto() {
            System.out.println("Você coletou um ovo de galinha!");
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

