package br.com.gsete.service;

import java.text.ParseException;
import java.util.List;

import br.com.gsete.models.Membro;
import br.com.gsete.repository.RepositorioMembro;

public class ServicoMembro {
	
	private RepositorioMembro repositorio;
	
	public ServicoMembro() {
		try { repositorio = new RepositorioMembro(); }
		catch (ParseException e1) { e1.printStackTrace(); }
	}
	
	private List<Membro> buscarTodos() {
		return repositorio.fildAll();
	}
	
	public List<Membro> buscarTodosPaginado(int inicio, int limite) {
		if(inicio == 0 && limite == 0) {
			return buscarTodos();
		}
		if(inicio >= 0 && limite >= 0) {
			return repositorio.buscaPaginada(inicio, limite);
		}
		return null;		
	}
	
	public Membro getMembro(Long id) {
		if(id > 0){
			return repositorio.findBy(id);
		}
		return null;
	}
	
	public Membro removerMembro(Long id) {
		if(id > 0) {
			return repositorio.remove(id);
		}
		return null;
	}			
}
