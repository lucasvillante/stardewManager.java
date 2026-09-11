public abstract class AnimalFazenda implements Animal {
    private static int contadorId = 100;

    private int id;
    private String nome;
    private int idade;
    private String raca;
    private String tipo;
    private String status;

    public AnimalFazenda(String nome, int idade, String raca, String tipo, String status) {
        this.id = contadorId++;
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.tipo = tipo;
        this.status = status;
    }

    @Override
    public void exibirStatus() {
        System.out.println("[ID: " + id + "] " + nome + " (" + tipo + ")");
        System.out.println(" - Raça: " + raca);
        System.out.println(" - Idade: " + idade + (idade == 1 ? " ano" : " anos") + " | Status: " + status);
        System.out.print(" - Som: ");
        emitirSom();
        System.out.println();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}