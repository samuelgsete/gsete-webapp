package br.com.gsete.service;

import java.util.List;

import javax.inject.Inject;

import br.com.gsete.models.Carteirinha;
import br.com.gsete.repository.RepositorioCarteirinha;

public class ServicoCarteirinha {

	@Inject
	private RepositorioCarteirinha repositorio;
	
	public ServicoCarteirinha() { }
	
	public List<Carteirinha> listarPaginado(Integer inicio, Integer limite, String filtro, String congregacao) {
		if(inicio == 0 && limite == 0) {
			return repositorio.findAll();
		}
		if(inicio >=0 && limite >=0 ) {
			return repositorio.listarPaginado(inicio, limite, filtro, congregacao);
		}
		return null;
	}
	
	public List<Carteirinha> buscarCarteirinhasPaginado(Long id, Integer inicio, Integer limite) {
		if(inicio >=0 && limite >=0 ) {
			return repositorio.buscarCarteirinhasPaginado(id, inicio, limite);
		}
		return null;
	}
	
	public List<String> buscarNomesMembros(Long id) { return id > 0 ? repositorio.buscarNomesMembros(id) : null; }
	
	public Boolean criarCarteirinha(Carteirinha c) {
		if(c != null) {
			c.getMembro().setTemCarteirinha(true);
			return repositorio.save(c);
		}
		return c != null ? repositorio.save(c): false;
	}
	
	public Boolean atualizarCarteirinha(Carteirinha c) {
		Carteirinha atual = getCarteirinha(c.getId());
		if(c.equals(atual)) {
			return repositorio.update(c);
		}
		return false;
	}
	
	public Boolean removerCarteirinha(Long id) {
		return id > 0 && repositorio.remove(id) ? true: false;
	}
	
	public Carteirinha getCarteirinha(Long id) {
		return id >= 1 ? repositorio.findBy(id) : null;
	}
	
	public Long getTotalElmentos() { return repositorio.getSize(); }
}
