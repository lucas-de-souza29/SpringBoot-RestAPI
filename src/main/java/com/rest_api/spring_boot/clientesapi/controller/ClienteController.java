package com.rest_api.spring_boot.clientesapi.controller;

import com.rest_api.spring_boot.clientesapi.domain.Cliente;
import com.rest_api.spring_boot.clientesapi.exception.InvalidRequestException;
import com.rest_api.spring_boot.clientesapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
        return cliente;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable("id") Integer id, @RequestBody Cliente cliente) {
        if(clienteRepository.findById(id).isEmpty()) {
            throw new InvalidRequestException("Oops! ID Not Found. Please try again.");
        }
        cliente.setId(id);
        clienteRepository.save(cliente);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente obterPorId(@PathVariable("id") Integer id) {
        return clienteRepository.findById(id).orElseThrow( () -> new InvalidRequestException("Client with ID " + id + " not found."));
    }

    @GetMapping("/nome")
    @ResponseStatus(HttpStatus.OK)
    public List <Cliente> getByNome(@RequestParam("nome") String nome) {
        return clienteRepository.findByNome(nome);
    }

    @GetMapping("/email")
    @ResponseStatus(HttpStatus.OK)
    public List <Cliente> getByEmail(@RequestParam("email") String email) {
        return clienteRepository.findByEmail(email);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") Integer id) {
        if(clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        } else {
            throw new InvalidRequestException("Client with ID " + id + " not found.");
        }
    }
}
