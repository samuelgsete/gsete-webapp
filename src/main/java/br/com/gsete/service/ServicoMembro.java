package br.com.gsete.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.gsete.models.Membro;

public class ServicoMembro {
	private List<Membro> membros;
	
	public ServicoMembro() {
		this.membros = new ArrayList<Membro>();
		try {
			povoarLista();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Membro> buscarTodos() {
		return this.membros;
	}
	
	public Membro getMembro(Integer id) {
		if(id > 0){
			for(Membro membro: membros){
				if(membro.getId().equals(id)) {
					return membro;
				}
			}
			return null;
		}
		return null;
	}
	
	public void removerMembro(Integer id) {
		this.membros.remove(this.getMembro(id));
	}
	
	private void povoarLista() throws ParseException  {
		Membro m0 = new Membro("Samuel de Souza Taveira", "20078888721", "607.839.003-17", "Músico", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("21/06/1995"), new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2009"), new Date());
		Membro m1 = new Membro("Aldenora Maia da Silva", "200500904149-6", "003.862.993-31", "Regente de Senhoras", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("01/12/1984"), new SimpleDateFormat("dd/MM/yyyy").parse("02/05/1999"), new Date());
		Membro m2 = new Membro("Alice Inácio do Nascimento Freire", "200500904149-6", "003.862.993-31", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("17/08/1981"), new SimpleDateFormat("dd/MM/yyyy").parse("05/06/1994"), new Date());
		Membro m3 = new Membro("Daniel de Souza Taveira", "123212354", "123.456.333-19", "Tisoureiro de Missões", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("21/04/1991"), new SimpleDateFormat("dd/MM/yyyy").parse("10/02/2006"), new Date());
		Membro m4 = new Membro("Debora Laís Lima de Oliveira", "2009097053451", "603.790.363-80", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("22/07/2001"), new SimpleDateFormat("dd/MM/yyyy").parse("12/03/2013"), new Date());
		Membro m5 = new Membro("Eliabe de Souza Amorim", "20088723003-2", "074.589.413-88", "Sonaplasta", "ATIVO",new SimpleDateFormat("dd/MM/yyyy").parse("07/11/1998"), new SimpleDateFormat("dd/MM/yyyy").parse("28/11/2009"), new Date());
		Membro m6 = new Membro("Francisca Viana da Silva", "2001002118830", "456.201.723-68", "Regente de Senhoras", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("05/06/1994"), new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2009"), new Date());
		Membro m7 = new Membro("Francisco de Assis Freitas da Silva", "98025050827", "416.871.753-49", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("14/07/1947"), new SimpleDateFormat("dd/MM/yyyy").parse("21/11/1992"), new Date());
		Membro m8 = new Membro("Francisco Lucas Vidal da Costa", "2007311007-2", "054.924.873-02", "Músico", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("29/09/1990"), new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2009"), new Date());
		Membro m9 = new Membro("Francisco Wanderson Henrique da Silva", "2007648948-0", "047.281.423-02", "Auxiliar do Trabalho", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("21/06/1995"), new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2009"), new Date());
		Membro m10 = new Membro("Gabrieli Marcelino de Freitas Silva", "2008533089-7", "613.944.463-22", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("31/07/2002"), new SimpleDateFormat("dd/MM/yyyy").parse("23/07/2016"), new Date());
		Membro m11 = new Membro("Geraldo da Silva Ferreira", "1120695", "189.467.633-53", "Diácono", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("1950/02/1950"), new SimpleDateFormat("dd/MM/yyyy").parse("19/05/1996"), new Date());
		Membro m12 = new Membro("Gerliane Alves de Lima", "2016100335", "623.874.813-30", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("26/06/2002"), new SimpleDateFormat("dd/MM/yyyy").parse("23/07/2016"), new Date());
		Membro m13 =new Membro("Izabel de Sousa Amorim", "960 230 554-34", "390.575.003-10", "Membro", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("04/06/1972"), new SimpleDateFormat("dd/MM/yyyy").parse("10/06/1986"), new Date());
		Membro m14 = new Membro("Joao Batista Pinheiro Taveira", "2007010281850", "903.897.273-34", "Músico", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("30/10/1973"), new SimpleDateFormat("dd/MM/yyyy").parse("05/06/1994"), new Date());
		Membro m15 = new Membro("Jonas Martins de Amorim", "2241630-92", "495.149.203-25", "Presibítero", "ATIVO", new SimpleDateFormat("dd/MM/yyyy").parse("25/03/1974"), new SimpleDateFormat("dd/MM/yyyy").parse("25/12/1987"), new Date());
		
		this.membros.add(m0);
		this.membros.add(m1);
		this.membros.add(m2);
		this.membros.add(m3);
		this.membros.add(m4);
		this.membros.add(m5);
		this.membros.add(m6);
		this.membros.add(m7);
		this.membros.add(m8);
		this.membros.add(m9);
		this.membros.add(m10);
		this.membros.add(m11);
		this.membros.add(m12);
		this.membros.add(m13);
		this.membros.add(m14);
		this.membros.add(m15);
	}
}
