package br.com.gsete.api.rest;

import static java.lang.String.format;
import java.util.List;

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
import br.com.gsete.models.Congregacao;
import br.com.gsete.service.ServicoCongregacao;

@Path("/congregacoes")
public class RecursoCongregacao {
	@Inject
	private ServicoCongregacao servico;
	
	public RecursoCongregacao() {  }
	
	@GET
	@Produces("application/json")
	public Response todasAsCongregacoes(@QueryParam("inicio") int inicio, @QueryParam("limite") int limite, @QueryParam("filtro") String filtro) {
		List<Congregacao> congregacoes = servico.listarPaginado(inicio, limite, filtro);
		return Response
				.status(200)
				.entity(congregacoes)
				.header("Content-Range", format("%d-%d/%d", inicio, limite, servico.totalElementos()))
				.build();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getCongregacao(@PathParam("id") Long id) {
		Congregacao c = servico.getCongregacao(id);
		return c != null ? Response.ok(c).build() : Response.noContent().build();
	}
	
	@GET
	@Path("/nomes-membros")
	@Produces("application/json")
	public Response getNomesMembrosFiltrados(@QueryParam("filtro") String filtro) {
		List<String> nomes = servico.getNomesMembrosFiltrado(filtro);
		return nomes != null ? Response.status(200).entity(nomes).build() : Response.noContent().build();
	}
	
	@GET
	@Path("/{id}/membros")
	@Produces("application/json")
	public Response getMembrosPorCongregacao(@PathParam("id") Long id) {
		List<String> membros = servico.getMembrosPorCongregacao(id);
		return membros != null ? Response.ok(membros).build() : Response.noContent().build();
	}
		
	@POST
	@Consumes("application/json")
	public Response salvarCongregacao(Congregacao c) {
		return servico.salvarCongregacao(c) ? Response.ok().build() : Response.noContent().build();
	}
	
	@PUT
	@Consumes("application/json")
	public Response atualizarCongregacao(Congregacao c) {
		return servico.atualizarCongregacao(c) ? Response.ok().build() : Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes("application/json")
	public Response removerCongregacao(@PathParam("id") Long id) {
		return servico.deletarCongregacao(id) ? Response.ok().build() : Response.noContent().build();
	}
}
