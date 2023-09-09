import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("\n******************************************");
        System.out.println("Dados do Cliente: \n");
        String nome = "Benjamim Leal\n";
        String cpf = "611.900.800-10\n";
        String tipoConta = "Conta correte\n";
        double saldo = 5000.00;
        System.out.println("Nome do cliente: " + nome);
        System.out.println("CPF do cliente: " + cpf);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo atual: %.2f \n", saldo);
        System.out.println("******************************************");

    // menu de opções:
        String menu = """
                ** Digite sua opção: **
                1- Consultar Saldo;
                2- Transferência;
                3- Receber valor
                4- Sair            
                """;
        int opcao = 0;
        while (opcao != 4  ) {
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.printf("Saldo atual: %.2f \n", saldo);
                } else if (opcao == 2) {
                    System.out.println("Qual valor você quer transferir? ");
                    double valorTransferencia = sc.nextDouble();
                    if (valorTransferencia > saldo) {
                        System.out.println("Saldo insuficiente, verifique seu saldo atual. ");
                    }else {
                        saldo -= valorTransferencia;
                        System.out.println("O valor de " + valorTransferencia + " Foi transferido com sucesso!\n");
                    }
                } else if (opcao == 3) {
                    System.out.println("Qual é o valor recebido? \n");
                    double valorRecebido = sc.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("Novo saldo:%.2f \n", saldo);
                }


        }







    }
}