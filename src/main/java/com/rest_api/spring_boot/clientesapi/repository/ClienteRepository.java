package com.rest_api.spring_boot.clientesapi.repository;
import com.rest_api.spring_boot.clientesapi.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    List<Cliente> findByNome(String nome);
    List<Cliente> findByEmail(String email);
}
