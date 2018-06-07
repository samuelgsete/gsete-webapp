package br.com.gsete.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuarios")
public class UsuarioRecurso {

	public UsuarioRecurso() { }
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Bem vindo ao servico de usuarios do gsete!";
	}
}
