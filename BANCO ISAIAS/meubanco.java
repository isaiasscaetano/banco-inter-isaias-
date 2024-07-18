import java.util.Scanner;

public class meubanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean vamos = true;

        while (vamos) {
            System.out.println("bem-Vindo Ao Banco Inter Isaias");
            System.out.println("1 Entrar");
            System.out.println("2 Sair");
            System.out.println("Escolha uma opçao: ");

            int opcao;
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro o ler a opção. Apenas Numeros ou palavras permitidos ");
                scanner.nextLine(); // limpar o scanner
                continue;
            }

            switch (opcao) {
                case 1:
                    boolean subemenu = true;
                while (subemenu){
                    System.out.println("Menu Principal Abaixo:");
                    System.out.println("1 DEPOSITAR");
                    System.out.println("2 SACAR");
                    System.out.println("3 CONSULTAR SALDO");
                    System.out.println("4 voltar");
                    System.out.println("ESCOLHA UMA OPÇÂO: ");

                    int subOpcao;
                    try {
                        subOpcao = scanner.nextInt();
                    }catch (Exception e){
                        System.out.println("ERRO AO LER A OPCAO. APENAS NUMEROS PERMITDOS 1 A 4");
                        scanner.nextLine(); // limpar o scanner
                        continue;
                    }

                    switch (subOpcao){
                        case 1:
                            System.out.print("Digite o valor para depositar: ");
                            double deposito;
                            try {
                                deposito = scanner.nextDouble();
                                if (deposito > 0) {
                                    saldo += deposito;
                                    System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
                                } else {
                                      System.out.println("Valor de depósito inválido.");
                                }
                            } catch (Exception e) {
                                System.out.println("Entrada inválida.");
                                scanner.nextLine(); // Limpar o buffer do scanner
                            }
                            break;

                        case 2:
                            System.out.println("digite o valor a sacar: ");
                            double saque;
                            try{
                                saque = scanner.nextDouble();
                                if(saque > 0 && saque <= saldo){
                                    saldo -= saque;
                                    System.out.println("saque de: " +saque + " realizado com sucesso: ");
                                    System.out.println("saldo atual: " +saldo);
                                } else if (saque > saldo) {
                                    System.out.println("saldo insuficiente.");
                                }else{
                                    System.out.println("valor do saque invalido");
                                }
                            }catch (Exception e ){
                                System.out.println("Entrada  invalido.");
                            }
                            break;

                        case 3:
                            System.out.println("saldo atual é: " + saldo);
                            break;

                        case 4:
                            subemenu = false;
                            break;

                        default:
                            System.out.println("opção invalida. tente novamente.");

                    }
                }
                break;

                case 2:
                    vamos = false;
                    System.out.println("obrigado, espero que volte.");
                    break;

                default:
                    System.out.println("opçao invalida. tente nvamente,");

            }
        }
        scanner.close();

    }
}