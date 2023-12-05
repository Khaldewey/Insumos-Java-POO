import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente; 
        Float saldo = 237.48f;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o número da conta");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next(); 
        System.out.println("Digite o seu nome");
        nomeCliente = scanner.next();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
