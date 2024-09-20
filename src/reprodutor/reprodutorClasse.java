package reprodutor;

public class reprodutorClasse implements reprodutorInterface{


	
	public void tocar() {
		System.out.println("Tocando musica");
		
	}

	
	public void pausar() {
		System.out.println("Musica pausada");
		
	}

	public int selecionarMusica(int opc) {
		System.out.println("Musica selecionada" + opc);
		return opc;
		
	}


	

}
