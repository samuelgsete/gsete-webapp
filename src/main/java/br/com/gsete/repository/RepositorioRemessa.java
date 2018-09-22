package br.com.gsete.repository;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import br.com.gsete.models.Remessa;

public class RepositorioRemessa extends GenericRepository<Remessa> {
	
	public RepositorioRemessa() { super(Remessa.class); }
	
	public List<Remessa> buscaPaginada(Integer inicio, Integer limite, String filtro) {
		return filtro != null ? buscarPorDescricao(inicio, limite, filtro) : buscarPorDescricao(inicio, limite, "");
	}
	
	private List<Remessa> buscarPorDescricao(Integer inicio, Integer limite, String filtro) {
		size = getQuantidadeRegistros(filtro);
		TypedQuery<Remessa> query  = em.createQuery("SELECT r FROM Remessa r WHERE lower(r.descricao) LIKE '" + filtro.toLowerCase() + "%' order by descricao", Remessa.class);
		query.setFirstResult(inicio);
		query.setMaxResults(limite);
		return query.getResultList();
	}
		
	private Long getQuantidadeRegistros(String filtro) {
		Query query = em.createQuery("SELECT COUNT(r) FROM Remessa r WHERE lower(r.descricao) LIKE '" + filtro.toLowerCase() + "%'");
		return (Long) query.getSingleResult();
	}
	
	public List<Remessa> findAll() {
		TypedQuery<Remessa> query  = em.createQuery("SELECT r FROM Remessa r order by descricao", Remessa.class);
		List<Remessa> registros = query.getResultList();
		size = (long) registros.size();
		return registros;
	}
		
	public long getTamanho() { return this.size; }

}
