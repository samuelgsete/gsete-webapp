package br.com.gsete.api.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import br.com.gsete.api.rest.MembrosRecurso;
import br.com.gsete.api.rest.UsuarioRecurso;

public class ApplicationConfig extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public ApplicationConfig() {
		singletons.add(new UsuarioRecurso());
		singletons.add(new MembrosRecurso());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
