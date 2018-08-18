package br.com.gsete.api.rest;

import static java.lang.String.format;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import br.com.gsete.models.Congregacao;
import br.com.gsete.service.ServicoCongregacao;

@Path("/congregacoes")
public class RecursoCongregacao {
	
	private ServicoCongregacao servico;
	
	public RecursoCongregacao() { servico = new ServicoCongregacao(); }
	
	@GET
	@Produces("application/json")
	public Response todasAsCongregacoes(@QueryParam("inicio") int inicio, @QueryParam("limite") int limite, @QueryParam("filtro") String filtro) {
		return Response
				.status(200)
				.entity(servico.listarPaginado(inicio, limite, filtro))
				.header("Content-Range", format("%d-%d/%d", inicio, limite, servico.totalDeRegistros()))
				.build();
	}
	
	@GET
	@Path("/membros/nomes")
	@Produces("application/json")
	public Response todosOsMembros(@QueryParam("inicio") int inicio, @QueryParam("limite") int limite, @QueryParam("filtro") String filtro) {
		return Response
				.status(200)
				.entity(servico.listarNomesMembrosPaginado(inicio, limite, filtro))
				.header("Content-Range", format("%d-%d/%d", inicio, limite, servico.totalDeRegistros()))
				.build();
	}
	
	@POST
	@Consumes("application/json")
	public Response salvarCongregacao(Congregacao c) {
		return servico.salvarCongregacao(c) == null ? Response.status(203).build() : Response.status(201).build();
	}
}
