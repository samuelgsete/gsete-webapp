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
	private Integer tamanho = membros.size();
	
	public RepositorioMembro() throws ParseException {
		membros.put(1L, new Membro(1, "SAMUEL DE SOUZA TAVEIRA", "20078888721", "607.839.003-17", "Solteiro(a)", "Masculino", f.parse("21/06/1995"), "(85)98971-1010", "(85)93376-2133", "samuelgsete@gmail.com", new Endereco("RUA PAULO HENRIQUE CAVALCANTE", 95, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "REDENÇÃO", "ANTONIO TAVEIRA", "MARIA MADALENA DE SOUZA TAVEIRA", f.parse("13/04/2009"), new Date(), "MÚSICO", "AÇUDE DO SR. NAZÁRO", "SEDE", "JOVENS", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(2L, new Membro(2, "ALDENOURA MAIA DA SILVA", "280915194", "003.713.703-45", "Casado(a)", "Feminino", f.parse("01/12/1974"), "(85)98926-7719", "(85)93376-2193", "matheusmaia@live.com", new Endereco("RUA BEIRA RIO", 105, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "PACATUBA", "JOSÉ ALVES DA SILVA", "ALDAIR MARTINS MAIA DA SILVA", f.parse("02/05/1999"), new Date(), "REGENTE DE SENHORAS", "SEDE ACARAPE", "SEDE", "SENHORAS", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(3L, new Membro(3, "MARIA LUCILENE MAIA DIOGENES", "96023055337", "902.429.123.20", "Casado(a)", "Feminino", f.parse("19/12/1977"), "(85)98861-1839", "(85)93376-2144", "", new Endereco("JOÃO BANDEIRA TORRES", 37, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "FORTALEZA", "JOSÉ OLAVIO MAIA", "MARIA DAS GRACAS ALVES MAIA", f.parse("24/01/2015"), new Date(), "MÚSICO", "AÇUDE DO SR. NAZÁRO", "SEDE", "JOVENS", new Date(), "NOVO CONVERTIDA", "ATIVO"));
		membros.put(4L, new Membro(4, "ANTÔNIO TAVEIRA", "29220584", "539.892.013-87", "CASADO(A)", "MASCULINO", f.parse("13/10/1964"), "(85)98818-0673", "(85)93376-2135", "samuelgsete@gmail.com", new Endereco("RUA PAULO HENRIQUE CAVALCANTE", 95, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "PACATUBA", "FRANCISCO TAVEIRA FILHO", "MARIA PINHEIRO TAVEIRA", f.parse("19/05/1996"), new Date(), "AUXILIAR", "SEDE ACARAPE", "SEDE", "OBREIROS", new Date(), "", "ATIVO"));
		membros.put(5L, new Membro(5, "ELIABE DE SOUZA AMORIM", "200887230032", "074.589.413-88", "Solteiro(a)", "Masculino", f.parse("08/11/1998"), "(85)98611-6244", "(85)93376-2132", "eliabebass@gmail.com", new Endereco("RUA BEIRA RIO", 131, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "REDENÇÃO", "JONAS MARTINS DE AMORIM", "IZABEL DE SOUSA AMORIM", f.parse("28/11/2009"), new Date(), "SONOPLASTA", "AÇUDE DO SR. NAZÁRO", "SEDE", "JOVENS", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(6L, new Membro(6, "FRANCISCA VIANA DA SILVA", "2001002118830", "456.201.723-68", "Casado(a))", "Feminino", f.parse("28/06/1955"), "(85)98814-1234", "(85)93376-2533", "", new Endereco("RUA JOSE BEM VINDO", 12, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "PACATUBA", "JOÃO VIANA DOS SANTOS", "RAIMUNDA CHAGAS VIANA", f.parse("05/06/1994"), new Date(), "REGENTE DE SENHORAS", "SEDE ACARAPE", "SEDE", "SENHORAS", new Date(), "", "ATIVO"));
		membros.put(7L, new Membro(7, "FRANCISCO DE ASSIS FREITAS DA SILVA", "90025050827", "416.871.752-49", "Casado(a)", "Masculino", f.parse("14/07/1947"), "(85)98863-6013", "(85)93463-2133", "", new Endereco("RUA BEIRA RIO", 673, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "REDENÇÃO", "FRANCISCO MARTINS DA SILVA FILHO", "RAIMUNDA DE FREITAS SILVA", f.parse("21/11/1992"), new Date(), "MEMBRO", "SEDE ACARAPE", "SEDE", "", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(8L, new Membro(8, "FRANCISCO LUCAS VIDAL DA COSTA", "200773110072", "054.924.873-02", "Solteiro(a)", "Masculino", f.parse("30/08/1993"), "(85)98924-7092", "(85)93316-2139", "lucas.vidal@gmail.com", new Endereco("RUA CAPITÃO TEIXEIRA", 201, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "MILHÂ", "JOSÉ GILBERTO VIDAL DA COSTA", "FRANCISCA CANDIDO DA SILVA", f.parse("24/09/2011"), new Date(), "MÚSICO", "AÇUDE DO SR. NAZÁRO", "SEDE", "JOVENS", new Date(), "CONVERTIDO", "ATIVO"));
		membros.put(9L, new Membro(9, "FRANCISCO WANDERSON HENRIQUE DA SILVA", "200776489480", "047.281.423-02", "Solteiro(a)", "Masculino", f.parse("29/09/1990"), "(85)98641-9331", "(85)93376-2133", "wanderenrique@hotmail.com", new Endereco("RUA PAULO BENTO", 114, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "REDENÇÃO", "FRANCISCO JOSÉ MAIA OLIVEIRA", "ROSÂNGELA JOSÉ MAIA OLIVEIRA", f.parse("18/07/2009"), new Date(), "MEMBRO", "AÇUDE DO SR. NAZÁRO", "SEDE", "MEMBRO", new Date(), "", "ATIVO"));
		membros.put(10L, new Membro(10, "GERALDO DA SILVA FERREIRA", "1120695", "184.467.633-53", "Casado(a)", "Masculino", f.parse("17/02/1950"), "(85)98970-4433", "(85)93376-2103", "", new Endereco("RUA MONOEL MOREIRA", 228, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "GUAIUBA", "FRANCISCO VIANA FERREIRA", "MARIA DA SILVA FERREIRA", f.parse("19/05/1996"), new Date(), "DIÁCONO", "TANQUES ACARAPE", "SEDE", "JOVENS", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(11L, new Membro(11, "GILIARD ALVES DE LIMA", "20073915852", "609.301.296-13", "Casado(a)", "Masculino", f.parse("04/02/1998"), "(85)98920-7842", "(85)93376-2135", "giliardalves@gmail.com", new Endereco("RUA DA CAGECE", 114, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "REDENÇÃO", "FRANCION ALVES DE SOUSA", "MARIA CLEIDE LEANDRO DE LIMA", f.parse("24/09/2011"), new Date(), "MEMBRO", "AÇUDE DO SR. NAZÁRO", "SEDE", "JOVENS", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(12L, new Membro(12, "ISAAC ARAÚJO DE SOUSA", "81467184", "356.299.243-20", "Casado(a)", "Masculino", f.parse("07/09/1965"), "(85)98686-4360", "(85)93376-2133", "isaacsousa45@hotmail.com", new Endereco("RUA BEIRA RIO", 208, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "AGUA VERDE", "JOSÉ INÁCIO DE SOUSA", "MARIA CIRILINO DE SOUSA", f.parse("11/01/1981"), new Date(), "AUXILIAR", "ACARAPE", "SEDE", "OBREIROS", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(13L, new Membro(13, "ISABEL DE SOUSA AMORIM", "96023055434", "390.575.003-10", "Casado(a)", "Feminino", f.parse("04/06/1972"), "(85)98823-0946", "(85)93376-2131", "izabel.amorim@gmail.com", new Endereco("RUA BEIRA RIO", 113, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "GUAIUBA", "JOSÉ INÁCIO DE SOUSA", "MARIA CIRILINO DE SOUSA", f.parse("10/06/1986"), new Date(), "MEMBRO", "SEDE ACARAPE", "SEDE", "SENHORAS", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(14L, new Membro(14, "JOÃO BATISTA PINHEIRO TAVEIRA", "2007010281850", "903.897.273-34", "Solteiro(a)", "Masculino", f.parse("30/10/1973"), "(85)98896-2745", "(85)3376-2133", "", new Endereco("RUA PAULO HENRIQUE CAVALCANTE", 96, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "GUAIUBA", "FRANCISCO TAVEIRA FILHO", "MARIA PINHEIRO TAVEIRA", f.parse("05/06/1994"), new Date(), "MÚSICO", "SEDE ACARAPE", "SEDE", "MUSICAL", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(15L, new Membro(15, "JOÃO NASCIMENTO PEREIRA", "96023074919", "447.501.533-20", "Casado(a)", "Masculino", f.parse("25/09/1971"), "(85)98671-1369", "(85)93376-2131", "", new Endereco("RUA PEDRO RIBEIRO", 195, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "GUAIUBA", "JOSÉ MARIA PEREIRA", "RAIMUNDA NASCIMENTO PEREIRA", f.parse("16/02/2006"), new Date(), "AUXILIAR", "AÇUDE DO SR. NAZÁRO", "SEDE", "OBREIROS", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(16L, new Membro(16, "OSAILA LIMA DE OLIVEIRA", "2009097052960", "294.183.303-00", "Casado(a)", "Feminino", f.parse("11/09/1970"), "(85)98929-3661", "(85)93376-2133", "osaila.jesus@hotmail.com", new Endereco("RUA MONICA HONORATO", 163, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "PACATUBA", "ANTONIO CARNEIRO LIMA", "OSAIRA MOREIRA LIMA", f.parse("06/08/1995"), new Date(), "SECRETÁRIA", "LONDRINA-PR", "SEDE", "SENHORAS", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(17L, new Membro(17, "JONAS MARTINS DE AMORIM", "224163092", "495.149.203-25", "Casado(a)", "Masculino", f.parse("25/03/1964"), "(85)98536-9295", "(85)93376-2013", "", new Endereco("RUA BEIRA RIO", 113, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "GUAIUBA", "RAIMUNDO MARTINS DE AMORIM", "INÊS LUCIANO DE AMORIM", f.parse("25/12/1987"), new Date(), "PRESBÍTERO", "SEDE GUAIUBA", "SEDE", "OBREIROS", new Date(), "NACIDO NA FÉ", "ATIVO"));
		membros.put(18L, new Membro(18, "MARIA CELMA PEREIRA DE SOUZA", "117396986", "434.737.683-91", "Casado(a)", "Feminino", f.parse("29/03/1968"), "(85)98676-4360", "", "celmapereira15@outlook.com", new Endereco("RUA BEIRA RIO", 208, "61895-000", "CE", "AGUA VERDE", "GUAIÚBA", "BRASILEIRO", "CASA"), "PACATUBA", "PEDRO VENTURA DE SOUZA", "MARIA DE LOURDES PEREIRA DE SOUZA", f.parse("11/01/1981"), new Date(), "MEMBRO", "ACARAPE", "SEDE", "SENHORAS", new Date(), "NACIDO NA FÉ", "ATIVO"));

	}
	
	public List<Membro> buscaPaginada(Integer inicio, Integer limite, String filtro) {
		List<Membro> lista = new ArrayList<Membro>(membros.values());
		List<Membro> listaFiltrada = filtrarMembro(filtro, lista);
		tamanho = listaFiltrada.size();
		if(inicio + limite > listaFiltrada.size()) { 
			return listaFiltrada.subList(inicio, listaFiltrada.size()); 
		}
		return listaFiltrada.subList(inicio, inicio + limite);
	}
	
	private List<Membro> filtrarMembro(String filtro, List<Membro> membros) {
		if(filtro == null || filtro == ""){
			return membros;
		}
		List<Membro> listaFiltrada = new ArrayList<Membro>();
		for (Membro membro : membros) {
			if(membro.getNome().toLowerCase().contains(filtro.toLowerCase())){
				listaFiltrada.add(membro);
			}
		}
		return listaFiltrada;
	}
	
	public List<Membro> fildAll() { return new ArrayList<Membro>(membros.values()); }
	
	public List<String> buscarTodosNomesMembros() {
		List<String> nomes = new ArrayList<String>();
		for (Membro m : membros.values()) {
			nomes.add(m.getNome());
		}
		return nomes;
	}
	
	public List<String> buscarTodosMembros() {
		List<String> nomes = new ArrayList<String>();
		for (Membro m : membros.values()) {
			nomes.add(m.getNome());
		}
		return nomes;
	}
	
	public Membro findBy(Long id) { return membros.get(id); }
	
	public Membro update(Membro m) {
		membros.put(new Long(m.getId()), m);
		return m;
	}
	public Membro save(Membro m){ 
		m.setId(membros.size() + 1);
		membros.put(new Long(m.getId()), m);
		return m;
	}
		
	public Membro remove(Long id) { return membros.remove(id); }
	
	public Integer countAll() { return this.tamanho; }	
}
