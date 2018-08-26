package br.com.gsete.repository;

import java.util.List;
import javax.persistence.Query;

import br.com.gsete.models.Congregacao;

public class RepositorioCongregacao extends GenericRepository<Congregacao> {
		
	public RepositorioCongregacao() { super(Congregacao.class); }
		
	public List<Congregacao> buscaPaginada(Integer inicio, Integer limite, String filtro) {	
		return filtro != null ? findWithName(filtro,inicio,limite) : findWithName("",inicio,limite);
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getNomesMembros(String filtro) {
		Query query = getConnection().createQuery("SELECT m.nome FROM Membro m WHERE lower(m.nome) LIKE '" + filtro.toLowerCase() + "%'");
		return (List<String>) query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getMembrosPorCongregacao(String congregacao) {
		return em.createQuery("SELECT m.nome FROM Membro m WHERE lower(m.congregacao) = '" + congregacao.toLowerCase() + "'").getResultList();
	}
				
	public Long getTamanho() { return this.size; }
}
