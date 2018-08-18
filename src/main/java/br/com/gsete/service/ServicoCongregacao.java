package br.com.gsete.service;

import java.text.ParseException;
import java.util.List;

import br.com.gsete.models.Congregacao;
import br.com.gsete.repository.RepositorioCongregacao;

public class ServicoCongregacao {
	
	private RepositorioCongregacao repositorio;
	
	public ServicoCongregacao() {
		try {
			repositorio = new RepositorioCongregacao();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public List<Congregacao> listarPaginado(Integer inicio, Integer limite, String filtro) {
		if(inicio == 0 && limite == 0) {
			return buscarTodos();
		}
		if(inicio >= 0 && limite >= 0) {
			return repositorio.buscaPaginada(inicio, limite, filtro);
		}
		return null;
	}
	
	public List<String> listarNomesMembrosPaginado(Integer inicio, Integer limite, String filtro) {
		if(inicio >= 0 && limite >= 0) {
			return repositorio.buscarNomesMembrosPaginado(inicio, limite, filtro);
		}
		return null;
	}
	
	public Congregacao salvarCongregacao(Congregacao c) {
		if(c != null) {
			return repositorio.save(c);
		}
		return null;
	}
		
	private List<Congregacao> buscarTodos() { return repositorio.findAll(); }
	
	public Integer totalDeRegistros() { return repositorio.countAll(); }

}
