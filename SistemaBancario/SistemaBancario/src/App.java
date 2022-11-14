import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        double saldoT = 0;

        ContaPoupanca Alex = new ContaPoupanca("Alex Poupança", 1000);
        ContaCorrente Alex1 = new ContaCorrente("Alex Corrente", 5000);
        ContaInvestimento Alex2 = new ContaInvestimento("Alex Investimento", 5000);

        ArrayList<ContaGeral> contas = new ArrayList<>();

        contas.add(Alex);
        contas.add(Alex1);
        contas.add(Alex2);

        for (ContaGeral conta : contas) {
            System.out.println("--------------------------------------------");
            System.out.println("Nome da conta: " + conta.getNome());
            System.out.println("valor em conta " + conta.getValor());
            System.out.println("--------------------------------------------");

        }

        Alex.deposito(30.00);
        Alex1.saque(400.00);
        Alex2.saque(6000.00);

        for (ContaGeral conta : contas) {
            System.out.println("--------------------------------------------");
            System.out.println("Nome da conta: " + conta.getNome());
            System.out.printf("valor em conta: R$ %.2f\n ", conta.getValor());
            System.out.println("--------------------------------------------");

        }

        System.out.println(" °°°°°°°°°°°°°°°°°°°° Passou o mês: °°°°°°°°°°°°°°°°°°°°");
        for (ContaGeral conta : contas) {
            conta.passouMes();
        }
        for (ContaGeral conta : contas) {
            System.out.println("--------------------------------------------");
            System.out.println("Nome da conta: " + conta.getNome());
            System.out.printf("valor em conta: R$  %.2f\n", conta.getValor());
            System.out.println("--------------------------------------------");
        }

        System.out.println(" °°°°°°°°°°°°°°°°°°°° Valor Total do Saldo Investido: °°°°°°°°°°°°°°°°°°°° ");

        for (ContaGeral conta : contas) {
            saldoT += conta.getValor();
        }

        System.out.printf("R$ %.2f", saldoT);

    }
}
