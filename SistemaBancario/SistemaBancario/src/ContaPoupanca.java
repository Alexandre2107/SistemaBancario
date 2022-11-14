public class ContaPoupanca {
  // Conta Poupança: Rendimento de 0,7% ao mês, saques ilimitados, sem taxa mensal
  // de manutenção.

  private double valor;
  private String nome;

  public ContaPoupanca(String nome, double valorInicial) {
    this.nome = nome;
    this.valor = valorInicial;
  }

  public void saque(double valor) {

    if (valor <= 0) {
      System.out.println("Favor, Sacar um valor positivo!");
    }
    if (this.valor < valor) {
      System.out.println("Não foi possível sacar essa quantia, pois o valor atual é de: " + this.valor);
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

  public void passouMes() {

    this.valor = valor * 0.007;
  }

  public void PrintPoupanca() {
    System.out.println("O valor da sua conta poupança é: " + valor);
    
  }
}
