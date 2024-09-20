package main;

import aparelhoTelefonico.aparelhoClass;
import aparelhoTelefonico.aparelhoInterface;
import celular.celularImplements;
import navegador.navegadorClass;
import navegador.navegadorInterface;
import reprodutor.reprodutorClasse;
import reprodutor.reprodutorInterface;

public class principal {

	public static void main(String[] args) {
		celularImplements rep = new celularImplements();
		aparelhoInterface ap = new aparelhoClass();
		navegadorInterface nav = new navegadorClass();

		rep.tocar();
		rep.pausar();
		rep.selecionarMusica(1);
		
		
		
		rep.adicionarNovaAba();
		rep.atualizarPagina();
		rep.exibirPagina();
		
		
		
		rep.antender();
		rep.iniciarCorreioDeVoz();
		rep.ligar();
		
		
	}

}
