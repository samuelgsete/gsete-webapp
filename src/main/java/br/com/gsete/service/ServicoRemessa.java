package br.com.gsete.service;

import java.util.List;

import javax.inject.Inject;

import br.com.gsete.models.Remessa;
import br.com.gsete.repository.RepositorioRemessa;

public class ServicoRemessa {
	
	@Inject
	private RepositorioRemessa repositorio;
	
	public ServicoRemessa() { }
	
	public List<Remessa> buscarPaginado(Integer inicio, Integer limite, String filtro) {
		if(inicio == 0 && limite == 0) {
			return repositorio.findAll();
		}
		if(inicio >=0 && limite >=0 ) {
			return repositorio.buscaPaginada(inicio, limite, filtro);
		}
		return null;
	}
	
	public boolean criarRemessa(Remessa r) {
		return r != null ? repositorio.save(r) : false;
	}
	
	public boolean atualizarRemessa(Remessa r) {
		Remessa atual = getRemessa(r.getId());
		if(r.equals(atual)) {	
			return repositorio.update(r);
		}
		return false;
	}
	
	public boolean removerRemessa(Long id) {
		if(id > 0 && repositorio.remove(id)) {
			return true;
		}
		return false;
	}
	
	public Remessa getRemessa(Long id) { return id > 0 ? repositorio.findBy(id) : null; }
	
	public Long totalElementos() { return repositorio.getTamanho(); }

}
