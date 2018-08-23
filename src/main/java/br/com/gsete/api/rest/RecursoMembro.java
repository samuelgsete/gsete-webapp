package br.com.gsete.api.rest;

import javax.inject.Inject;
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
	
	@Inject
	private ServicoMembro servico;
	
	public RecursoMembro() { }
		
	@GET
	@Produces("application/json")
	public Response todosOsMembros(@QueryParam("inicio") int inicio, @QueryParam("limite") int limite, @QueryParam("filtro") String filtro) {		
		return Response
				.status(200)
				.entity(servico.buscarTodosPaginado(inicio, limite, filtro))
				.header("Content-Range", format("%d-%d/%d", inicio, limite, servico.totalElementos()))
				.build();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getMembro( @PathParam("id") Long id) {
		Membro m = servico.getMembro(id);
		return m != null ? Response.ok(m).build() : Response.noContent().build();
	}
	
	@POST
	@Consumes("application/json")
	public Response salvarMembro(Membro m) {
		String mensagem = servico.salvarMembro(m);
		return mensagem != null ? Response.ok(mensagem).build() : Response.noContent().build();
	}
	
	@PUT
	@Consumes("application/json")
	public Response atualizarMembro(Membro m) {
		String mensagem = servico.atualizarMembro(m);
		return mensagem != null ? Response.ok(mensagem).build() : Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes("application/json")
	public Response deletarMembro( @PathParam("id") Long id) {
		servico.removerMembro(id);
		return Response.noContent().entity("Removido com sucesso!").build();
	}
}
