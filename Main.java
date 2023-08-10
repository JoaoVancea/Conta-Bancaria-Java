import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Bem vindo ao aplicativo do Banco! \n Digite o seu nome: ");
        String nome = sc.next();
        System.out.print("Digite o tipo de conta: ");
        String tipoConta = sc.next();
        System.out.println("Bem vindo " + nome);
        double saldo = 4000;

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Consultar saldo \n 2 - Transferir valor \n 3 - Receber valor \n 4 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O seu saldo atual é de R$" + saldo + "!\n");
                    break;
                case 2:
                    System.out.print("Para que conta deseja transferir? ");
                    String nomeTransferir = sc.next();
                    System.out.print("Quanto deseja transferir? (Seu saldo atual é de R$" + saldo + "!): ");
                    double valorTransferir = sc.nextDouble();
                    if (valorTransferir > saldo) {
                        System.out.println("Você não possui esse valor em sua conta! \n");
                    } else {
                        saldo = saldo - valorTransferir;
                        System.out.println("Você transferiu R$" + valorTransferir + " para a conta: " + nomeTransferir + ". Seu novo saldo é de R$" + saldo + "!\n");
                    }
                    break;
                case 3:
                    System.out.print("Para quem você quer perdir valor? ");
                    String nomeReceber = sc.next();
                    System.out.print("Quanto deseja receber? ");
                    double valorReceber = sc.nextDouble();
                    System.out.println("Enviamos um pedido de valor para " + nomeReceber + " no valor de R$" + valorReceber + "!\n");
                    break;
                case 4:
                    break;
            }
        }
        System.out.println("Você saiu da conta!");
    }
}