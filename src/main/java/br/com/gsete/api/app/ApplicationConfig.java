package br.com.gsete.api.app;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

import br.com.gsete.api.rest.*;

@ApplicationPath("")
public class ApplicationConfig extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public ApplicationConfig() {
		singletons.add(new RecursoMembro());
		singletons.add(new RecursoCongregacao());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
