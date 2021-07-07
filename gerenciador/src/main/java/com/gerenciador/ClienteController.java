package com.gerenciador;

import com.gerenciador.Service.ClienteService;
import com.gerenciador.enums.TipoAtendimento;
import com.gerenciador.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteService serv;
    @GetMapping
    public List<Cliente> listarTodos(){
        Cliente cli = new Cliente(null,"Maxwell", TipoAtendimento.PRESENCIAL);
        serv.salvar(cli);
        return serv.findAll() ;
    }

    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cli){
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
