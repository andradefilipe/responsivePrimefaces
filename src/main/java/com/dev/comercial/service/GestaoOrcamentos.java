package com.dev.comercial.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.dev.comercial.model.Orcamento;
import com.dev.comercial.repository.OrcamentosRepository;
import com.dev.comercial.util.Transacional;

public class GestaoOrcamentos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private OrcamentosRepository orcamentos;
	
	@Transacional
	public void salvar(Orcamento orcamento) {
		orcamentos.guardar(orcamento);
	}
	
}