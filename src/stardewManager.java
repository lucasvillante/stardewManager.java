import java.util.Scanner;

public class stardewManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Curral curral = new Curral();

        int opcao = 0;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("--------------------------------------------------");

            System.out.println("1. Ver animais do curral");
            System.out.println("2. Adicionar animal ao curral");
            System.out.println("3. Coletar produtos");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    boolean rodandoCurral = true;

                    do {
                        System.out.println("--------------------------------------------------");
                        System.out.println("ANIMAIS NO CURRAL:");
                        System.out.println("--------------------------------------------------");

                        if (curral.estaVazio()) {
                            System.out.println("O curral está vazio!");
                        } else {
                            curral.listarAnimais();
                        }
                        System.out.println("--------------------------------------------------");

                        System.out.println("1. Vender animal");
                        System.out.println("2. Voltar ao Menu Principal");
                        System.out.print("Escolha uma opção: ");

                        int opcaoCurral = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoCurral) {
                            case 1:
                                if (curral.estaVazio()) {
                                    System.out.println("Não há animais para vender!");
                                } else {
                                    System.out.print("Digite o ID do animal para vender: ");
                                    int idRemover = scanner.nextInt();
                                    scanner.nextLine();

                                    boolean vendido = curral.venderAnimal(idRemover);

                                    if (vendido) {
                                        System.out.println("Animal vendido com sucesso!");
                                    } else {
                                        System.out.println("Nenhum animal encontrado com o ID " + idRemover + ".");
                                    }
                                }
                                break;

                            case 2:
                                rodandoCurral = false;
                                System.out.println("Voltando ao menu principal...");
                                break;

                            default:
                                System.out.println("Opção Inválida! Por favor, digite uma opção válida (1 a 2)");
                                break;
                        }
                    } while (rodandoCurral);
                    break;

                case 2:
                    System.out.println("--------------------------------------------------");
                    System.out.println("ADICIONAR ANIMAL");
                    System.out.println("--------------------------------------------------");

                    System.out.println("Qual animal você deseja adicionar?");
                    System.out.println("1. Vaca      | 2. Bezerro");
                    System.out.println("3. Galinha   | 4. Pintinho");
                    System.out.println("5. Ovelha    | 6. Cordeiro");

                    System.out.print("Escolha uma opcao: ");

                    int escolhaAnimal = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do animal: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a idade do animal: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite a raça do animal: ");
                    String raca = scanner.nextLine();

                    System.out.print("Digite o status do animal (ex: Normal, Pastando, Botando ovos): ");
                    String status = scanner.nextLine();

                    switch (escolhaAnimal) {
                        case 1:
                            curral.adicionarAnimal(new VacaMae(nome, idade, raca, status));
                            System.out.println(nome + " foi adicionada ao curral!");
                            break;

                        case 2:
                            curral.adicionarAnimal(new Bezerro(nome, idade, raca));
                            System.out.println(nome + " foi adicionado ao curral!");
                            break;

                        case 3:
                            curral.adicionarAnimal(new GalinhaMae(nome, idade, raca, status));
                            System.out.println(nome + " foi adicionada ao curral!");
                            break;

                        case 4:
                            curral.adicionarAnimal(new Pintinho(nome, idade, raca));
                            System.out.println(nome + " foi adicionado ao curral!");
                            break;

                        case 5:
                            curral.adicionarAnimal(new OvelhaMae(nome, idade, raca, status));
                            System.out.println(nome + " foi adicionada ao curral!");
                            break;

                        case 6:
                            curral.adicionarAnimal(new Cordeiro(nome, idade, raca));
                            System.out.println(nome + " foi adicionado ao curral!");
                            break;

                        default:
                            System.out.println("Opção Inválida! Por favor, digite uma opção válida (1 a 6)");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("--------------------------------------------------");
                    System.out.println("COLETANDO PRODUTOS");
                    System.out.println("--------------------------------------------------");

                    if (curral.estaVazio()) {
                        System.out.println("Não há animais para coletar produtos.");
                    } else {
                        curral.coletarProdutos();
                    }
                    break;

                case 4:
                    System.out.println("Saindo do jogo...");
                    break;

                default:
                    System.out.println("Opção Inválida! Por favor, digite uma opção válida (1 a 4)");
                    break;
            }

        } while (opcao != 4);

        scanner.close();
    }
}