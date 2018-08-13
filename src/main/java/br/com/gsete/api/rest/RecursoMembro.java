package br.com.gsete.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import static java.lang.String.format;

import br.com.gsete.models.Membro;
import br.com.gsete.service.ServicoMembro;

@Path("/membros")
public class RecursoMembro {
	
	private ServicoMembro servico;
	
	public RecursoMembro() { servico = new ServicoMembro(); }
		
	@GET
	@Produces("application/json")
	public Response todosOsMembros(@QueryParam("inicio") int inicio, @QueryParam("limite") int limite) {
		Integer total = servico.totalElementos();
		return Response
				.status(200)
				.entity(servico.buscarTodosPaginado(inicio, limite))
				.header("Content-Range", total == 0 ? "0-0/0": format("%d-%d/%d", inicio, limite, total))
				.build();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getMembro( @PathParam("id") Long id) {
		Membro membro = servico.getMembro(id);
		if(membro == null){ 
			return Response.noContent().build(); 
		}
		return Response.ok(membro).build();
	}
	
	@POST
	@Consumes("application/json")
	public Response salvarMembro(Membro m) {
		return servico.salvarMembro(m) == null ? Response.status(203).build() : Response.status(201).build();
	}
	
	@PUT
	@Consumes("application/json")
	public Response atualizarMembro(Membro m) {
		return servico.atualizarMembro(m) == null ? Response.status(203).build() : Response.status(201).build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes("application/json")
	public Response deletarMembro( @PathParam("id") Long id) {
		return Response.noContent().entity(servico.removerMembro(id)).build();
	}
}
