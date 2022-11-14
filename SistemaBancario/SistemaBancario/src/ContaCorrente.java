public class ContaCorrente extends ContaGeral {
  // Conta corrente: Não tem nenhum rendimento, saques ilimitados, taxa mensal de
  // manutenção de 5 reais.

  public ContaCorrente(String nome, double valor) {
    super(nome, valor);
  }

  @Override
  public void passouMes() {
    this.valor -= 5;
  }

}
