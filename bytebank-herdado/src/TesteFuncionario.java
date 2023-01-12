
public class TesteFuncionario {

	public static void main(String[] args) {
		FuncionarioTeste nico = new FuncionarioTeste();
		
		nico.setNome("nico Steppat");
		nico.setCpf("111.222.333-44");
		nico.setSalario(2590.80);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
