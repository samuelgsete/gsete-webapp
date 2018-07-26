package br.com.gsete.repository;

import java.util.HashMap;
import java.util.Map;

import br.com.gsete.models.Membro;

public class DataBaseClass {
	
	private static Map<Long, Membro> membros = new HashMap<>();
	
	public static Map<Long, Membro> getMembros() { return membros; }
}
