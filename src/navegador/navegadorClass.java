package navegador;

public class navegadorClass implements navegadorInterface {

	

	@Override
	public void exibirPagina() {
		System.out.println("Pagina exibida");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova pagina Exibida");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina ");
		
	}

}
