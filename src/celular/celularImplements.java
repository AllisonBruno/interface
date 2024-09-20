package celular;

import aparelhoTelefonico.aparelhoInterface;
import navegador.navegadorInterface;
import reprodutor.reprodutorInterface;

public class celularImplements implements reprodutorInterface, navegadorInterface, aparelhoInterface  {

	@Override
	public void tocar() {
		System.out.println("Celular implements tocando");
		
	}

	@Override
	public void pausar() {
		System.out.println("Celular implements pausando");
		
	}

	@Override
	public int selecionarMusica(int opc) {
		System.out.println("Celular implements selecionando"+opc);
		return 0;
	}

	@Override
	public void exibirPagina() {
		System.out.println("Celular implements exibindo a pagina");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Celular implements adicionando uma nova pagina");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Celular implements atualizando a pagina");
		
	}

	@Override
	public void ligar() {
		System.out.println("Celular implements ligando");
		
	}

	@Override
	public void antender() {
		System.out.println("Celular implements atendendo");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Celular implements iniciando o correio de voz");
		
	}

}
