package br.com.gsete.api.rest;

import static java.lang.String.format;

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

import br.com.gsete.models.Carteirinha;
import br.com.gsete.service.ServicoCarteirinha;

@Path("carteirinhas")
public class RercursoCarteirinha {
	
	@Inject
	private ServicoCarteirinha servico;
	
	public RercursoCarteirinha() { }
	
	@GET
	@Produces("application/json")
	public Response listarPaginado( @QueryParam("inicio") int inicio, 
									@QueryParam("limite") int limite, 
									@QueryParam("filtro") String filtro, 
									@QueryParam("congregacao") String congregacao
								  ) {
		return Response
				.ok()
				.entity(servico.listarPaginado(inicio, limite, filtro, congregacao))
				.header("Content-Range", format("%d-%d/%d", inicio, inicio + limite, servico.getTotalElmentos()))
				.build();
				
	}
	
	@GET
	@Path("nomes-membros/{id}")
	@Produces("application/json")
	public Response getNomesMembros(@PathParam("id") Long id) {
		return Response
				.ok()
				.entity(servico.buscarNomesMembros(id))
				.build();
	}
	
	@GET
	@Path("remessa/{id}")
	@Produces("application/json")
	public Response listarCarteirinhasPaginado(@PathParam("id") Long id, @QueryParam("inicio") Integer inicio, @QueryParam("limite") Integer limite) {
		return Response
				.ok()
				.entity(servico.buscarCarteirinhasPaginado(id, inicio, limite))
				.header("Content-Range", format("%d-%d/%d", inicio, inicio + limite, servico.getTotalElmentos()))
				.build();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getCarteirinha(@PathParam("id") Long id){
		Carteirinha c = servico.getCarteirinha(id);
		return c != null ? Response.ok(c).build() : Response.noContent().build();
	}
	
	@POST
	@Consumes("application/json")
	public Response criarCarteirinha(Carteirinha c) {
		return servico.criarCarteirinha(c) ? Response.status(201).build() : Response.noContent().build();
	}
	
	@PUT
	@Consumes("application/json")
	public Response atualizarCarteirinha(Carteirinha c) {
		return servico.atualizarCarteirinha(c) ? Response.status(201).build() : Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes("application/json")
	public Response removerCarteirinha(@PathParam("id") Long id) {
		return servico.removerCarteirinha(id) ? Response.ok().build() : Response.noContent().build();
	}
}
