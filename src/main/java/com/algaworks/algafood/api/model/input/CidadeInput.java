package com.algaworks.algafood.api.model.input;

import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CidadeInput {

	@NotBlank
	private String nome;
	
	@Valid
	@ManyToOne
	private EstadoIdInput estado;
}
