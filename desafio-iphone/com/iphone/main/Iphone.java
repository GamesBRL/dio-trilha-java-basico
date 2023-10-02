package com.iphone.main;

import com.iphone.exceptions.contato.ContatoDuplicadoException;
import com.iphone.exceptions.musica.*;
import com.iphone.ligacao.AgendaContatos;
import com.iphone.musica.ReprodutorMusical;
import com.iphone.navegador.Navegador;

public class Iphone {
	
	public static void main(String[] args) {
		ReprodutorMusical repMusical = new ReprodutorMusical();
		AgendaContatos contatos = new AgendaContatos();
		Navegador navegador = new Navegador();
		
		try {
			repMusical.adicionarMusica("Psychosocial", "Slipknot");
			repMusical.adicionarMusica("Coming Home", "Avenged Sevenfold");
			repMusical.adicionarMusica("Coming Home", "Kevin Sherwood");
			repMusical.adicionarMusica("Numb", "Linkin Park");
			//repMusical.adicionarMusica("Numb", "Linkin Park");
			
			//repMusical.selecionarMusica("Numb", "Linkin Park");
			//repMusical.tocarMusicaSelecionada();
			//repMusical.pausarMusicaSelecionada();
			//repMusical.exibirListaMusicas();
			//repMusical.removerMusicaSelecionada();
			//System.out.println("\n");
			//repMusical.mostrarListaMusicas();
			
			contatos.adicionarContato("Mae", 68999292871L);
			contatos.adicionarContato("Professor A", 68999294820L);
			contatos.adicionarContato("Pai", 68999462958L);
			contatos.adicionarContato("Maria Joaquina", 68999372917L);
			contatos.adicionarContato("Maria Eduarda", 68999375493L);
			//contatos.exibirContatos();
			//contatos.pesquisarPorNome("Maria");
			//contatos.atualizarContato("Pai", 68993748284L);
			//contatos.exibirContatos();
			//contatos.ligarParaSiMesmoEXEMPLO();
			//contatos.atenderEXEMPLO();
			//contatos.iniciarCorreioDeVozEXEMPLO();
			
			navegador.adicionarNovaAba("Youtube", "https://www.youtube.com");
			navegador.adicionarNovaAba("Twitch", "https://www.twitch.tv");
			navegador.adicionarNovaAba("Twitter", "https://www.twitter.com");
			navegador.selecionarPagina(0);
			//navegador.exibirPagina();
			//navegador.atualizarPagina();
		}catch(MusicaDuplicadaException e) {
			e.printStackTrace();
		} catch (ContatoDuplicadoException e) {
			e.printStackTrace();
		}
	}
	
}
