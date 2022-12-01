import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua conta:");
        String conta = scanner.next();

        System.out.println("Digite sua agencia:");
        int agencia = scanner.nextInt();

        System.out.println("Digete seu saldo Inicial.");
        double saldo = scanner.nextDouble();

        //Impressao dos dados recebidos

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo inicial é " + saldo + " já está disponível para saque.");

    }
    
}
