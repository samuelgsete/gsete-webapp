package br.com.gsete.repository;

import java.util.List;
import br.com.gsete.models.Membro;

public class RepositorioMembro extends GenericRepository<Membro> {
		
	public RepositorioMembro() { super(Membro.class); }
	
	public List<Membro> buscaPaginada(Integer inicio, Integer limite, String filtro) {
		return filtro != null ? findWithName(filtro,inicio,limite) : findWithName("",inicio,limite);
	}
		
	public Long getTamanho() { return this.size; }
}
