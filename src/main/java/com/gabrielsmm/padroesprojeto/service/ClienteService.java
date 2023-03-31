package com.gabrielsmm.padroesprojeto.service;

import com.gabrielsmm.padroesprojeto.model.Cliente;

/**
 * Interface que define o padrão Strategy
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    Cliente inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
