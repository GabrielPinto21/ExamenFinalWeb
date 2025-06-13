package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.ClienteController;
import com.example.demo.entity.Cliente;

@Service
public class ClienteService {

    @Autowired
    private ClienteController clienteController;

    public Object findAllClientes() {
        return clienteController.findAll();
    }

    public Object findClienteById(Long id) {
        return clienteController.findById(id);
    }

    public Object saveCliente(Cliente cliente) {
        return clienteController.save(cliente);
    }

    public void deleteCliente(Long id) {
        clienteController.delete(id);
    }
}
