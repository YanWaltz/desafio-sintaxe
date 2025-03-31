import java.util.Locale; //Incluindo as bibliotecas
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: ");
            int numero = scanner.nextInt();
        System.out.println("Digite o número da sua Agência: ");
            String agencia = scanner.next();
        System.out.println("Digite o seu nome: ");
            String nomeCliente = scanner.next();
        System.out.println("Digite o valor do seu saldo: ");
            double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + "\ne seu saldo de " + saldo + " já está disponível para saque.\n");

    }
}