package br.com.gsete.repository;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.gsete.models.Carteirinha;

public class RepositorioCarteirinha extends GenericRepository<Carteirinha> {

	public RepositorioCarteirinha() {
		super(Carteirinha.class);
	}
	
	public List<Carteirinha> listarPaginado(Integer inicio, Integer limite, String filtro, String congregacao) {
		size = contador("SELECT COUNT(c) FROM Carteirinha c, Membro m WHERE c.membro.id = m.id and lower(m.nome) LIKE '%" + filtro.toLowerCase() + "%' and lower(m.congregacao) LIKE '%" + congregacao.toLowerCase() + "%'");
		TypedQuery<Carteirinha> query = em.createQuery("SELECT c FROM Carteirinha c, Membro m WHERE c.membro.id = m.id and lower(m.nome) LIKE '%" + filtro.toLowerCase() + "%' and lower(m.congregacao) LIKE '%" + congregacao.toLowerCase() + "%'", Carteirinha.class);
		query.setFirstResult(inicio);
		query.setMaxResults(limite);
		return query.getResultList();
	}
	
	public List<Carteirinha> buscarCarteirinhasPaginado(Long id, Integer inicio, Integer limite) {
		Query q = em.createQuery("SELECT COUNT(c) FROM Carteirinha c WHERE remessa_id = '" + id + "'");
		size = (Long) q.getSingleResult();
		System.out.println("Tamanho: " + size);
		TypedQuery<Carteirinha> query = em.createQuery("SELECT c FROM Carteirinha c WHERE remessa_id = '" + id + "'", Carteirinha.class);
		query.setFirstResult(inicio);
		query.setMaxResults(limite);
		return query.getResultList();
	}
	
	public List<String> buscarNomesMembros(Long id) {
		TypedQuery<String> query = em.createQuery("SELECT c.membro.nome FROM Carteirinha c WHERE c.remessa.id = '" + id + "'", String.class);
		List<String> membros = query.getResultList();
		return membros;
	}
	
	private Long contador(String query) { return (Long) em.createQuery(query).getSingleResult(); }
	
	public Long getSize() { return this.size; }
}
