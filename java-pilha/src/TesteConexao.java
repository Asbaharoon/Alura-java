
public class TesteConexao {

	public static void main(String[] args) {

		//implementaçao a apartir do 1.7
		//try with resources
		
		//nova forma de implementar o bloco try
		//fechando qualquer conexao ou algo do tipo
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException e) {
			System.out.println("Deu erro na conexao");
		}
		
		
		//---------------------------------
		
		//Codigo legado
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conexao");
//		} finally { // bloco opcional que sera sempre executado
//			System.out.println("finnaly");
//			if(con != null) {
//				con.close();				
//			}
//		}
	}
}
