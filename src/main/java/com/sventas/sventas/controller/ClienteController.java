package com.sventas.sventas.controller;


import com.sventas.sventas.model.Cliente;
import com.sventas.sventas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @PostMapping
    public Cliente create (@RequestBody Cliente cliente){
        return clienteService.create(cliente);
    }
    @PutMapping
    public Cliente update(@RequestBody Cliente cliente){
        return clienteService.update(cliente);
    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable("id") Integer idCliente) {
        return clienteService.findById(idCliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idCliente){
        clienteService.delete(idCliente);
    }
}
