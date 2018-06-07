package br.com.gsete.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.gsete.models.Membro;

@Path("/membros")
public class MembrosRecurso {
	
	public MembrosRecurso() { }
	
	@GET
	@Path("/boasvindas")
	@Produces(MediaType.TEXT_HTML)
	public String Hello() {
		return "<h4>Bem vindo ao recurso de membros do gsete!!<h4>";
	}
	
	@GET
	@Path("/get/{nome}")
	@Produces("application/json")
	public Membro getMembro(@PathParam("nome") String nome) {
		Membro m = new Membro(nome, "00000", "11111", "PIANISTA");
		return m;
	}
}
