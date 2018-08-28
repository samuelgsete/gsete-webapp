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
	
	public boolean salvarCongregacao(Congregacao c) {
		if(c != null) {
			repositorio.save(c);
			return true;
		}
		return false;
	}
	
	public boolean atualizarCongregacao(Congregacao c) {
		System.out.println(c.getId());
		Congregacao atual = this.getCongregacao(c.getId());
		if(c.equals(atual)) {
			repositorio.update(c);
			return true;
		}
		return false;
	}
	
	public boolean deletarCongregacao(Long id) {
		if(id > 0) {
			if(repositorio.remove(id)){
				return true;
			}	
		}
		return false; 
	}
	
	public List<String> getMembrosPorCongregacao(Long id) {
		if(id > 0) {
			//return repositorio.getMembrosPorCongregacao(getCongregacao(id).getNome());
			String congregacao= getCongregacao(id).getNome();
			System.out.println(congregacao);
			return repositorio.getMembrosPorCongregacao(congregacao);
		}
		return null;
	}
		
	public Long totalElementos() { return repositorio.getTamanho(); }
}
