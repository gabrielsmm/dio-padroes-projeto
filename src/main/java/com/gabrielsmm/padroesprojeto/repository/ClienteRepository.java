package com.gabrielsmm.padroesprojeto.repository;

import com.gabrielsmm.padroesprojeto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
