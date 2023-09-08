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
        while (opcao != 4){

        }

















    }
}