package br.com.gsete.service;

import java.util.List;
import javax.inject.Inject;
import br.com.gsete.models.Congregacao;
import br.com.gsete.repository.RepositorioCongregacao;

public class ServicoCongregacao {
	@Inject
	private RepositorioCongregacao repositorio;
	
	public ServicoCongregacao() { }
	
	public List<Congregacao> listarPaginado(Integer inicio, Integer limite, String filtro) {
		List<Congregacao> todos = null;
		if(inicio == 0 && limite == 0) {
			todos =  repositorio.findAll();
		}
		if(inicio >= 0 && limite >= 0) {
			todos = repositorio.buscaPaginada(inicio, limite, filtro);
		}
		return todos;
	}
	
	public List<String> getNomesMembrosFiltrado(String filtro) {
		return filtro != null ? repositorio.getNomesMembros(filtro) : null;
	}
	
	public Congregacao getCongregacao(Long id) {
		return id > 0 ? repositorio.findBy(id) : null;
	}
	
	public String salvarCongregacao(Congregacao c) {
		if(c != null) {
			repositorio.save(c);
			return "Criado com sucesso!";
		}
		return null;
	}
	
	public String atualizarCongregacao(Congregacao c) {
		Congregacao atual = this.getCongregacao(c.getId());
		System.out.println(c.equals(atual));
		if(c.equals(atual)) {
			repositorio.update(c);
			return "Atualizado com sucesso!";
		}
		return null;
	}
	
	public String deletarCongregacao(Long id) {
		if(id > 0) {
			if(repositorio.remove(id)){
				return "Removido com sucesso!";
			}	
		}
		return null; 
	}
		
	public Long totalElementos() { return repositorio.getTamanho(); }
}
