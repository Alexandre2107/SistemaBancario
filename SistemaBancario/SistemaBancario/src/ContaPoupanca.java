public class ContaPoupanca extends ContaGeral {
  // Conta Poupança: Rendimento de 0,7% ao mês, saques ilimitados, sem taxa mensal
  // de manutenção.

  public ContaPoupanca(String nome, double valor) {
    super(nome, valor);
  }

  @Override
  public void passouMes() {

    this.valor += valor * 0.007;
  }

}
