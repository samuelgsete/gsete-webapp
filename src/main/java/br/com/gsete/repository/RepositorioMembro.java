package br.com.gsete.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import br.com.gsete.models.Membro;

public class RepositorioMembro {
	
	private Map<Long, Membro> membros = DataBaseClass.getMembros();
	
	public RepositorioMembro() throws ParseException {
		membros.put(1L, new Membro(1, "Samuel de Souza Taveira", "20078888721", "607.839.003-17", "Músico", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("21/06/1995"), new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2009"), new Date()));
		membros.put(2L, new Membro(2, "Aldenora Maia da Silva", "200500904149-6", "003.862.993-31", "Regente de Senhoras", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("01/12/1984"), new SimpleDateFormat("dd/MM/yyyy").parse("02/05/1999"), new Date()));
		membros.put(3L, new Membro(3, "Alice Inácio do Nascimento Freire", "200500904149-6", "003.862.993-31", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("17/08/1981"), new SimpleDateFormat("dd/MM/yyyy").parse("05/06/1994"), new Date()));
		membros.put(4L, new Membro(4, "Daniel de Souza Taveira", "123212354", "123.456.333-19", "Tisoureiro de Missões", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("21/04/1991"), new SimpleDateFormat("dd/MM/yyyy").parse("10/02/2006"), new Date()));
		membros.put(5L, new Membro(5, "Debora Laís Lima de Oliveira", "2009097053451", "603.790.363-80", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("22/07/2001"), new SimpleDateFormat("dd/MM/yyyy").parse("12/03/2013"), new Date()));
		membros.put(6L, new Membro(6, "Eliabe de Souza Amorim", "20088723003-2", "074.589.413-88", "Sonaplasta", "ATIVO",new SimpleDateFormat("dd/MM/yyyy").parse("07/11/1998"), new SimpleDateFormat("dd/MM/yyyy").parse("28/11/2009"), new Date()));
		membros.put(7L, new Membro(7, "Francisca Viana da Silva", "2001002118830", "456.201.723-68", "Regente de Senhoras", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("05/06/1994"), new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2009"), new Date()));
		membros.put(8L, new Membro(8, "Francisco de Assis Freitas da Silva", "98025050827", "416.871.753-49", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("14/07/1947"), new SimpleDateFormat("dd/MM/yyyy").parse("21/11/1992"), new Date()));
		membros.put(9L, new Membro(9, "Francisco Lucas Vidal da Costa", "2007311007-2", "054.924.873-02", "Músico", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("29/09/1990"), new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2009"), new Date()));
		membros.put(10L, new Membro(10, "Francisco Wanderson Henrique da Silva", "2007648948-0", "047.281.423-02", "Auxiliar do Trabalho", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("21/06/1995"), new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2009"), new Date()));
		membros.put(11L, new Membro(11, "Gabrieli Marcelino de Freitas Silva", "2008533089-7", "613.944.463-22", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("31/07/2002"), new SimpleDateFormat("dd/MM/yyyy").parse("23/07/2016"), new Date()));
		membros.put(12L, new Membro(12, "Geraldo da Silva Ferreira", "1120695", "189.467.633-53", "Diácono", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("1950/02/1950"), new SimpleDateFormat("dd/MM/yyyy").parse("19/05/1996"), new Date()));
		membros.put(13L, new Membro(13, "Gerliane Alves de Lima", "2016100335", "623.874.813-30", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("26/06/2002"), new SimpleDateFormat("dd/MM/yyyy").parse("23/07/2016"), new Date()));
		membros.put(14L, new Membro(14, "Izabel de Sousa Amorim", "960 230 554-34", "390.575.003-10", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("04/06/1972"), new SimpleDateFormat("dd/MM/yyyy").parse("10/06/1986"), new Date()));
		membros.put(15L, new Membro(15, "Joao Batista Pinheiro Taveira", "2007010281850", "903.897.273-34", "Músico", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("30/10/1973"), new SimpleDateFormat("dd/MM/yyyy").parse("05/06/1994"), new Date()));
		membros.put(16L, new Membro(16, "Jonas Martins de Amorim", "2241630-92", "495.149.203-25", "Presibítero", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("25/03/1974"), new SimpleDateFormat("dd/MM/yyyy").parse("25/12/1987"), new Date()));
	}
	
	public List<Membro> buscaPaginada(Integer inicio, Integer limite) {
		List<Membro> lista = new ArrayList<Membro>(membros.values());
		if(inicio + limite > lista.size()) { 
			return new ArrayList<Membro>(); 
		}
		return lista.subList(inicio, inicio + limite);
	}
	
	public List<Membro> fildAll() { return new ArrayList<Membro>(membros.values()); }
	
	public Membro findBy(Long id) { return membros.get(id); }
	
	public void save(Membro m){ }
		
	public Membro remove(Long id) { return membros.remove(id); }
	
	
}
