package br.com.gsete.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.gsete.models.Congregacao;
import br.com.gsete.models.Departamento;
import br.com.gsete.models.Endereco;

public class RepositorioCongregacao {
	
	private Map<Long, Congregacao> congregacoes = DataBaseClass.getCongregacoes();
	private Integer tamanho = congregacoes.size();
	private SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	
	public RepositorioCongregacao() throws ParseException {
		Set<Departamento> departamentos1 = new HashSet<>();
		departamentos1.add(new Departamento("Jovens", "ISABEL DE SOUSA AMORIM", "ELIABE DE SOUZA AMORIM", "ELIABE DE SOUZA AMORIM", ""));
		departamentos1.add(new Departamento("Crianças", "OSAILA LIMA DE OLIVEIRA", "MARIA CELMA PEREIRA DE SOUZA", "", ""));
		departamentos1.add(new Departamento("Missões", "ISAAC ARAÚJO DE SOUSA", "", "", ""));
		departamentos1.add(new Departamento("Senhoras", "FRANCISCA VIANA DA SILVA", "ALDENOURO MAIA DA SILVA", "FRANCISCA VIANA DA SILVA", ""));
		departamentos1.add(new Departamento("Musical", "SAMUEL DE SOUZA TAVEIRA", "", "SAMUEL DE SOUZA TAVEIRA", ""));
		
		Set<Departamento> departamentos2 = new HashSet<>();
		departamentos2.add(new Departamento("Jovens", "FRANCISCO WANDERSON HENRIQUE DA SILVA", "", "", ""));
		departamentos2.add(new Departamento("Senhoras", "MARIA LUCILENE MAIA DIOGENES", "", "", ""));
		
		Set<Departamento> departamentos3 = new HashSet<>();
		departamentos3.add(new Departamento("Jovens", "JONAS MARTINS DE AMORIM", "ELIABE DE SOUZA AMORIM", "ELIABE DE SOUZA AMORIM", ""));
		departamentos3.add(new Departamento("Crianças", "ISABEL DE SOUSA AMORIM", "JONAS MARTINS DE AMORIM", "ISABEL DE SOUSA AMORIM", ""));
		
		Set<Departamento> departamentos4 = new HashSet<>();
		departamentos4.add(new Departamento("Senhoras", "OSAILA LIMA DE OLIVEIRA", "", "", ""));
		
		congregacoes.put(1L, new Congregacao(1, "Sede", "GERÔNCIO SOUSA SALES", departamentos1, new Endereco("RUA DO TRILHO", 14, "61890-000", "CE", "AGUA VERDE", "GUAIUBA", "", ""), f.parse("15/07/2018"), ""));
		congregacoes.put(2L, new Congregacao(2, "Tanques", "THIAGO RODIRGUES CARLOS", departamentos4, new Endereco("RUA DOS TANQUES", 101, "61892-100", "CE", "TANQUES", "ACARAPE", "", ""), f.parse("15/07/2018"), ""));
		congregacoes.put(3L, new Congregacao(3, "Riachão", "GERALDO DA SILVA FERREIRA", departamentos2, new Endereco("RUA DO RIACHO", 8, "62785-0000", "CE", "RIACHÃO DO NORTE", "ACARAPE", "", ""), f.parse("15/07/2018"), ""));
		congregacoes.put(4L, new Congregacao(4, "Bom Principio", "JONAS MARTINS DE AMORIM", departamentos3, new Endereco("RUA PEDRO BORGES", 31, "61945-000", "CE", "BOM PRINCIPIO", "GUAIUBA", "", ""), f.parse("15/07/2018"), ""));
	}
	
	public List<Congregacao> buscaPaginada(Integer inicio, Integer limite, String filtro) {
		List<Congregacao> lista = new ArrayList<Congregacao>(congregacoes.values());
		List<Congregacao> listaFiltrada = filtrarCongregacao(filtro, lista);
		tamanho = listaFiltrada.size();
		if(inicio + limite > listaFiltrada.size()) { 
			return listaFiltrada.subList(inicio, listaFiltrada.size()); 
		}
		return listaFiltrada.subList(inicio, inicio + limite);
	}
		
	private List<Congregacao> filtrarCongregacao(String filtro, List<Congregacao> congregacoes) {
		if(filtro == null || filtro == ""){
			return congregacoes;
		}
		List<Congregacao> listaFiltrada = new ArrayList<Congregacao>();
		for (Congregacao congregacao : congregacoes) {
			if(congregacao.getNome().toLowerCase().contains(filtro.toLowerCase())){
				listaFiltrada.add(congregacao);
			}
		}
		return listaFiltrada;
	}
	
	public List<String> buscarNomesMembrosPaginado(Integer inicio, Integer limite, String filtro) {
		List<String> listaNomes = null;
		try {
			listaNomes = new RepositorioMembro().buscarTodosNomesMembros();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<String> listaNomesFiltrada = filtrarNomeMembro(filtro, listaNomes);
		tamanho = listaNomesFiltrada.size();
		if(inicio + limite > listaNomesFiltrada.size()) {
			return listaNomesFiltrada.subList(inicio, listaNomesFiltrada.size());
		}
		return listaNomesFiltrada.subList(inicio, inicio + limite);
	}
	
	private List<String> filtrarNomeMembro(String filtro, List<String> nomes) {
		if(filtro == null || filtro == ""){
			return nomes;
		}
		List<String> listaFiltrada = new ArrayList<String>();
		for(String nome: nomes) {
			if(nome.toLowerCase().contains(filtro.toLowerCase())){
				listaFiltrada.add(nome);
			}
		}
		return listaFiltrada;
	}
	
	public Congregacao save(Congregacao c) {
		c.setId(congregacoes.size() + 1);
		congregacoes.put(new Long(c.getId()), c);
		return c;
	}
		
	public List<Congregacao> findAll() { return new ArrayList<Congregacao>(congregacoes.values()); }
	
	public Integer countAll() { return this.tamanho; }
}
