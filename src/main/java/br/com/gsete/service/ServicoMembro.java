package br.com.gsete.service;

import java.util.List;

import javax.inject.Inject;

import br.com.gsete.models.Membro;
import br.com.gsete.repository.RepositorioMembro;

public class ServicoMembro {
	@Inject
	private RepositorioMembro repositorio;
	
	public ServicoMembro() {
	}
		
	public List<Membro> buscarTodosPaginado(int inicio, int limite, String filtro) {
		List<Membro> todos = null;
		if(inicio == 0 && limite == 0) {
			todos = repositorio.findAll(); 
		}
		if(inicio >= 0 && limite >= 0) {
			todos = repositorio.buscaPaginada(inicio, limite, filtro);
		}
		return todos;		
	}
		
	public Membro getMembro(Long id) {
		return id > 0 ? repositorio.findBy(id) : null;
	}
	
	public String salvarMembro(Membro m) {
		if(m != null) {
			repositorio.save(m);
			return "Criado com sucesso!";
		}
		return null;
	}
	
	public String atualizarMembro(Membro m) {
		Membro atual = getMembro(m.getId());
		if(m.equals(atual)) {
			repositorio.update(m);
			return "Atualizado com sucesso.";
		}
		return null;
	}
	
	
	public String removerMembro(Long id) {
		if(id > 0) {
			if(repositorio.remove(id)) {
				return "Removido com sucesso.";
			}	
		}
		return null;
	}			
	
	public Long totalElementos() { return repositorio.getTamanho(); }
}
