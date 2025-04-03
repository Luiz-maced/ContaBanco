import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
            Scanner Agencia = new Scanner(System.in);
            System.out.println("Por favor, digite a Agência !");
            String GetAgencia = Agencia.nextLine();
            
            Scanner ContaBancaria = new Scanner(System.in);
            System.out.println("Por favor, digite o número da Conta !");
            int GetConta = ContaBancaria.nextInt();

           Scanner NomeCliente = new Scanner(System.in);
           System.out.println("Digite o nome do Cliente! ");
           String GetNome = NomeCliente.nextLine(); 

           Scanner VrSaldo = new Scanner(System.in);
           System.out.println("Digite seu saldo inicial! ");
           Double GetSaldo = VrSaldo.nextDouble();

           System.out.println("Olá Sr " + GetNome + "Sua conta bancária é a "+ GetConta + ", sua agencia é: " + GetAgencia + " e seu saldo atual é de R$" + GetSaldo);
    }
}
