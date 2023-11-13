package br.com.fiap.challegersprint4.controller;

import br.com.fiap.challegersprint4.model.entity.Bicicleta;
import br.com.fiap.challegersprint4.model.repository.BicicletaRepository;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("/sprint4/bicicleta")
public class BicicletaResource {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid Bicicleta bike) {
		Bicicleta resposta = BicicletaRepository.save(bike);
		ResponseBuilder response = null;
		if (resposta != null) {
			response = Response.created(null); // 201 - Created
		} else {
			response = Response.status(400); // 400 - Bad Request
		}
		response.entity(resposta);
		return response.build();
	}
	
}
