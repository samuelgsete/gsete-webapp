package br.com.gsete.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.gsete.models.Membro;
import br.com.gsete.service.ServicoMembro;

@Path("/membros")
public class RecursoMembro {
	
	ServicoMembro servico;
	
	public RecursoMembro() { servico = new ServicoMembro(); }
		
	@GET
	@Produces("application/json")
	public Response todosOsMembros() {
		return Response.ok(servico.buscarTodos()).build();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getMembro( @PathParam("id") Integer id) {
		Membro membro = servico.getMembro(id);
		if(membro == null){
			return Response.noContent().build();
		}
		return Response.ok(membro).build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes("application/json")
	public Response deletarMembro( @PathParam("id") Integer id) {
		servico.removerMembro(id);
		return Response.noContent().build();
	}
}
