package com.gerenciador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciador.Service.ClienteService;
import com.gerenciador.dto.ClienteRequest;
import com.gerenciador.dto.ClienteResponse;
import com.gerenciador.model.Cliente;
@CrossOrigin("*")
@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteService serv;

  
    @GetMapping
    public List<Cliente> listarTodos(){
        return serv.findAll() ;
    }

    
    @PostMapping
    public ClienteResponse adicionar(@RequestBody ClienteRequest cli){
        return serv.salvar(cli);
    }


    @DeleteMapping
    public void remover(@RequestBody Cliente clienteId){
        serv.Remover(clienteId);
    }


    @PutMapping
    public Cliente atualizar(@RequestBody Cliente cli){
       return  serv.atualizar(cli);
    }
}
