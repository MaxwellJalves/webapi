package com.gerenciador.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciador.dto.ClienteRequest;
import com.gerenciador.dto.ClienteResponse;
import com.gerenciador.model.Cliente;
import com.gerenciador.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;
    


    //buscarPorId
    public Cliente localizarPorId(Long id){
        return repo.getById(id);
    }

    public List<Cliente> findAll(){
        return repo.findAll();
    }

    //salvar
    public ClienteResponse salvar(ClienteRequest cliente){
     Cliente cli =    repo.save(ClienteRequest.toEntity(cliente));
     return ClienteResponse.toDto(cli);
    }
    

    //atualizar
    public Cliente atualizar(Cliente cliente){
        return repo.save(cliente);
    }
    //excluir
    public void Remover(Cliente cliente){


    }


}
