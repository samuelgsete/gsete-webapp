package br.com.gsete.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import br.com.gsete.models.Endereco;
import br.com.gsete.models.Membro;

public class RepositorioMembro {
	
	private Map<Long, Membro> membros = DataBaseClass.getMembros();
	private SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	
	public RepositorioMembro() throws ParseException {
		membros.put(1L, new Membro(1, "Samuel de Souza Taveira", "20078888721", "607.839.003-17", "Solteiro(a)", "Masculino", f.parse("21/06/1995"), "(85)98971-1010", "(85)3376-2133", "samuelgsete@gmail.com", new Endereco("Rua Paulo Henrique Cavalcante", 95, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Redenção", "Antonio Taveira", "Maria Madalena de Souza Taveira", f.parse("13/04/2009"), new Date(), "Músico", "Açude do SR. Nazáro", "Sede", "Jovens", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(2L, new Membro(2, "Aldenouro Maia da Silva", "2809151/94", "003.713.703-45", "Casado(a)", "Feminino", f.parse("01/12/1974"), "(85)98926-7719", "(85)3376-2193", "matheusmaia@live.com", new Endereco("RUA BEIRA RIO", 105, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Pacatuba", "José Alves da Silva", "Aldair Martins Maia da Silva", f.parse("02/05/1999"), new Date(), "Regente de Senhoras", "Sede Acarape", "SEDE", "Senhoras", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(3L, new Membro(3, "Maria Lucilene Maia Diogenes", "96023055337", "902.429.123.20", "Casado(a)", "Feminino", f.parse("19/12/1977"), "(85)98861-1839", "(85)3376-2144", "", new Endereco("João Bandeira Torres", 37, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Fortaleza", "José Olavio Maia", "Maria das Gracas Alves Maia", f.parse("24/01/2015"), new Date(), "MÚSICO", "Açude do SR. Nazáro", "Sede", "Jovens", new Date(), "Novo Convertida", "ATIVO"));
		membros.put(4L, new Membro(4, "Antônio Taveira", "292205-84", "539.892.013-87", "Casado(a)", "Masculino", f.parse("13/10/1964"), "(85)98818-0673", "(85)3376-2135", "samuelgsete@gmail.com", new Endereco("Rua Paulo Henrique Cavalcante", 95, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Pacatuba", "Francisco Taveira Filho", "Maria Pinheiro Taveira", f.parse("19/05/1996"), new Date(), "Auxiliar", "Sede Acarape", "Sede", "Obreiros", new Date(), "", "ATIVO"));
		membros.put(5L, new Membro(5, "Eliabe de Souza Amorim", "20088723003-2", "074.589.413-88", "Solteiro(a)", "Masculino", f.parse("08/11/1998"), "(85)98611-6244", "(85)3376-2132", "eliabebass@gmail.com", new Endereco("RUA BEIRA RIO", 131, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Redenção", "Jonas Martins de Amorim", "Izabel de Sousa Amorim", f.parse("28/11/2009"), new Date(), "Sonoplasta", "Açude do SR. Nazáro", "Sede", "Jovens", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(6L, new Membro(6, "Francisca Viana da Silva", "2001002118830", "456.201.723-68", "Casado(a)", "Feminino", f.parse("28/06/1955"), "(85)98814-1234", "(85)3376-2533", "", new Endereco("Rua Jose Bem Vindo", 12, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Pacatuba", "João Viana dos Santos", "Raimunda Chagas Viana", f.parse("05/06/1994"), new Date(), "Regente de Senhoras", "Sede Acarape", "SEDE", "Senhoras", new Date(), "", "ATIVO"));
		membros.put(7L, new Membro(7, "Francisco de Assis Freitas da Silva", "90025050827", "416.871.752-49", "Casado(a)", "Masculino", f.parse("14/07/1947"), "(85)98863-6013", "(85)3463-2133", "", new Endereco("Rua Beira Rio", 673, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Redenção", "Francisco Martins da Silva Filho", "Raimunda de Freitas Silva", f.parse("21/11/1992"), new Date(), "Membro", "Sede Acarape", "Sede", "", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(8L, new Membro(8, "Francisco Lucas Vidal da Costa", "200773110072", "054.924.873-02", "Solteiro(a)", "Masculino", f.parse("30/08/1993"), "(85)98924-7092", "(85)3316-2139", "lucas.vidal@gmail.com", new Endereco("Rua Capitão Teixeira", 201, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Milhâ", "José Gilberto Vidal da Costa", "Francisca Candido da Silva", f.parse("24/09/2011"), new Date(), "Músico", "Açude do SR. Nazáro", "Sede", "Jovens", new Date(), "Convertido", "ATIVO"));
		membros.put(9L, new Membro(9, "Francisco Wanderson Henrique da Silva", "20077648948-0", "047.281.423-02", "Solteiro(a)", "Masculino", f.parse("29/09/1990"), "(85)98641-9331", "(85)3376-2133", "wanderenrique@hotmail.com", new Endereco("Rua Paulo Bento", 114, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Redenção", "Francisco José Maia Oliveira", "Rosângela José Maia Oliveira", f.parse("18/07/2009"), new Date(), "Membro", "Açude do SR. Nazáro", "Sede", "Membro", new Date(), "", "ATIVO"));
		membros.put(10L, new Membro(10, "Geraldo da Silva Ferreira", "1.120.695", "184.467.633-53", "Casado(a)", "Masculino", f.parse("17/02/1950"), "(85)98970-4433", "(85)3376-2103", "", new Endereco("Rua Monoel Moreira", 228, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Guaiuba", "Francisco Viana Ferreira", "Maria da Silva Ferreira", f.parse("19/05/1996"), new Date(), "Diácono", "Tanques Acarape", "Sede", "Jovens", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(11L, new Membro(11, "Giliard", "20073915852", "609.301.296-13", "Casado(a)", "Masculino", f.parse("04/02/1998"), "(85)98920-7842", "(85)3376-2135", "giliardalves@gmail.com", new Endereco("Rua da Cagece", 114, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Redenção", "Francion Alves de Sousa", "Maria Cleide Leandro de Lima", f.parse("24/09/2011"), new Date(), "Membro", "Açude do SR. Nazáro", "Sede", "Jovens", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(12L, new Membro(12, "Isaac Araújo de Sousa", "814671-84", "356.299.243-20", "Casado(a)", "Masculino", f.parse("07/09/1965"), "(85)98686-4360", "(85)3376-2133", "isaacsousa45@hotmail.com", new Endereco("Rua Beira Rio", 208, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Agua Verde", "José Inácio de Sousa", "Maria Cirilino de Sousa", f.parse("11/01/1981"), new Date(), "Auxiliar", "Acarape", "Sede", "Obreiros", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(13L, new Membro(13, "Isabel de Sousa Amorim", "96023055434", "390.575.003-10", "Casada(a)", "Feminino", f.parse("04/06/1972"), "(85)98823-0946", "(85)3376-2131", "izabel.amorim@gmail.com", new Endereco("Rua Beira Rio", 113, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Guaiuba", "José Inácio de Sousa", "Maria Cirilino de Sousa", f.parse("10/06/1986"), new Date(), "Membro", "Sede Acarape", "Sede", "Senhoras", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(14L, new Membro(14, "João Batista Pinheiro Taveira", "2007010281850", "903.897.273-34", "Solteiro(a)", "Masculino", f.parse("30/10/1973"), "(85)98896-2745", "(85)3376-2133", "", new Endereco("RUA PAULO HENRIQUE CAVALCANTE", 96, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Guaiuba", "Francisco Taveira Filho", "Maria Pinheiro Taveira", f.parse("05/06/1994"), new Date(), "Músico", "Sede Acarape", "Sede", "Musical", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(15L, new Membro(15, "João Nascimento Pereira", "96023074919", "447.501.533-20", "Casado(a)", "Masculino", f.parse("25/09/1971"), "(85)98671-1369", "(85)3376-2131", "", new Endereco("Rua PedroRibeiro", 195, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Guaiuba", "José Maria Pereira", "Raimunda Nascimento Pereira", f.parse("16/02/2006"), new Date(), "Auxiliar", "Açude do SR. Nazáro", "Sede", "Obreiros", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(16L, new Membro(16, "Osaila Lima de Oliveira", "2009097052960", "294.183.303-00", "Casado(a)", "Feminino", f.parse("11/09/1970"), "(85)98929-3661", "(85)3376-2133", "osaila.jesus@hotmail.com", new Endereco("Rua Monica Honorato", 163, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Pacatuba", "Antonio Carneiro Lima", "Osaira Moreira Lima", f.parse("06/08/1995"), new Date(), "Secretária", "Londrina-PR", "Sede", "Senhoras", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(17L, new Membro(17, "Jonas Martins de Amorim", "2241630-92", "495.149.203-25", "Casado(a)", "Masculino", f.parse("25/03/1964"), "(85)98536-9295", "(85)3376-2013", "", new Endereco("Rua Beira Rio", 113, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Guaiuba", "Raimundo Martins de Amorim", "Inês Luciano de Amorim", f.parse("25/12/1987"), new Date(), "Presbítero", "Sede Guaiuba", "Sede", "Obreiros", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(18L, new Membro(18, "Maria Celma Pereira de Souza", "1173969-86", "434.737.683-91", "Casado(a)", "Feminino", f.parse("29/03/1968"), "(85)98676-4360", "", "celmapereira15@outlook.com", new Endereco("Rua Beira Rio", 208, "61895-000", "CE", "Agua Verde", "Guaiúba", "Brasileiro", "Casa"), "Pacatuba", "Pedro Ventura de Souza", "Maria de Lourdes Pereira de Souza", f.parse("11/01/1981"), new Date(), "Membro", "Acarape", "Sede", "Senhoras", new Date(), "NACIDO NA FÉ", "ATIVO"));
	}
	
	public List<Membro> buscaPaginada(Integer inicio, Integer limite) {
		List<Membro> lista = new ArrayList<Membro>(membros.values());
		if(inicio + limite > lista.size()) { 
			return lista.subList(inicio, lista.size()); 
		}
		return lista.subList(inicio, inicio + limite);
	}
	
	public List<Membro> fildAll() { return new ArrayList<Membro>(membros.values()); }
	
	public Membro findBy(Long id) { return membros.get(id); }
	
	public void save(Membro m){ }
		
	public Membro remove(Long id) { return membros.remove(id); }
	
	
}
