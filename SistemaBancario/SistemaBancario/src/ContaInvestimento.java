public class ContaInvestimento {
  // Conta Investimento: Rendimento de 1,3% ao mês, cada saque custa 25 reais,
  // taxa mensal de manutenção de 10 reais.

  private double rendimento;
  private double valor;
  private double taxaMensal;
  private String nome;

  public ContaInvestimento(String nome, double valorInicial) {
    this.nome = nome;
    this.valor = valorInicial;
  }

  public void saque(double valor) {

    this.valor -= 25;

    if (this.valor < valor) {
      System.out.println("Não foi possível sacar essa quantia, pois o valor atual é de: " + this.valor);
    }
    if (valor <= 0) {
      System.out.println("Favor, Sacar um valor positivo!");
    } else {
      this.valor -= valor;
    }

  }

  public void deposito(double valor) {
    if (valor <= 0) {
      System.out.println("Favor, Depositar um valor positivo!");
    } else {
      this.valor += valor;
    }

  }
}
