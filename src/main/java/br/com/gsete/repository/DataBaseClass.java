package br.com.gsete.repository;

import java.util.HashMap;
import java.util.Map;

import br.com.gsete.models.Congregacao;
import br.com.gsete.models.Membro;

public class DataBaseClass {
	
	private static Map<Long, Membro> membros = new HashMap<>();
	private static Map<Long, Congregacao> congregacoes = new HashMap<>();
	
	public static Map<Long, Membro> getMembros() { return membros; }
	
	public static Map<Long, Congregacao> getCongregacoes() { return congregacoes; }
}
