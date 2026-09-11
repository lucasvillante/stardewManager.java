import java.util.ArrayList;
import java.util.List;

public class Curral {
    private List<Animal> animais;

    public Curral() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public boolean estaVazio() {
        return animais.isEmpty();
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            animal.exibirStatus();
        }
    }

    public boolean venderAnimal(int idRemover) {
        Animal animalVendido = null;

        for (Animal animal : animais) {
            if (animal.getId() == idRemover) {
                animalVendido = animal;
                break;
            }
        }

        if (animalVendido != null) {
            animais.remove(animalVendido);
            return true;
        }
        return false;
    }

    public void coletarProdutos() {
        for (Animal animal : animais) {
            animal.coletarProduto();
        }
    }
}