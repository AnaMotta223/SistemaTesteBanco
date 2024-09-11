import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1500.;
        double saque = 0.;
        double deposito = 0.;
        int opcao = 0;
        //menu de opções do "banco"
        String menu = """
                ** Digite uma opção: **
                
                1 - Consulta de saldo
                2 - Saque de valor
                3 - Depósito de valor
                4 - Sair 
                
                """;
        Scanner leitura = new Scanner(System.in);

        do{
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saldo atual: " + saldo + "\n");
                    break;
                case 2:
                    System.out.println("Digite o valor para saque: ");
                    saque = leitura.nextDouble();
                    if (saque > saldo || saque <= 0){
                        System.out.println("Valor inválido!" + "\n");
                    }
                    else {
                        saldo -= saque;
                        System.out.println("Você sacou " + saque + " reais. \nSaldo atual: " + saldo + "\n");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor para depósito: ");
                    deposito = leitura.nextDouble();
                    if (deposito <= 0){
                        System.out.println("Valor inválido!" + "\n");
                    }
                    else {
                        saldo += deposito;
                        System.out.println("Você depositou " + deposito + " reais. \nSaldo atual: " + saldo + "\n");
                    }
                    break;
            }
            
        } while(opcao != 4);

    }

}
