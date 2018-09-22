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
import br.com.gsete.models.Remessa;
import br.com.gsete.service.ServicoRemessa;
import static java.lang.String.format;


@Path("remessas")
public class RecursoRemessa {
	
	@Inject
	private ServicoRemessa servico;
	
	public RecursoRemessa() {}
	
	@GET
	@Produces("application/json")
	public Response listarPaginado(@QueryParam("inicio") int inicio, @QueryParam("limite") int limite, @QueryParam("filtro") String filtro) {
		return Response
				.ok()
				.entity(servico.buscarPaginado(inicio, limite, filtro))
				.header("Content-Range", format("%d-%d/%d", inicio, inicio + limite, servico.totalElementos()))
				.build();
				
	}
		
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getRemessa(@PathParam("id") Long id) {
		Remessa r = servico.getRemessa(id);
		return r != null ? Response.ok(r).build() : Response.noContent().build();
	}
		
	@POST
	@Consumes("application/json")
	public Response salvarRemessa(Remessa r) {
		return servico.criarRemessa(r) ? Response.status(201).build() : Response.noContent().build();
	}
	
	@PUT
	@Consumes("application/json")
	public Response atualizarRemessa(Remessa r) {
		return servico.atualizarRemessa(r) ? Response.status(201).build() : Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes("application/json")
	public Response removerRemessa(@PathParam("id") Long id) {
		return servico.removerRemessa(id) ? Response.ok().build() : Response.noContent().build();
	}
}
