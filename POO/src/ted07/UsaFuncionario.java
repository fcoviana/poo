package ted07;


public class UsaFuncionario {
	public static void main(String[] args) {
		
//		Funcionario f1 = new Funcionario("Francisco", 400);
//		f1.aumentarSalario();
//		Funcionario.setValeRefeicao(55);
//		Funcionario.aumentarValeRefeicao();
		Funcionario f1 = new Funcionario();
		Mensagem.inputString("Digite o nome: ");
		Mensagem.exibirValores(f1);
	}
}
