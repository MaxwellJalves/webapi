package com.gerenciador.Service;

import com.gerenciador.model.Cliente;
import com.gerenciador.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    //buscar

    //buscarPorId
    public Cliente localizarPorId(Long id){
        return repo.getById(id);
    }

    public List<Cliente> findAll(){
        return repo.findAll();
    }
    //buscarPor nome
//    public Cliente localizarPorNome(String nome){
//       return repo.getByNome(nome);
//    }

    //salvar
    public Cliente salvar(Cliente cliente){
     Cliente cli =    repo.save(cliente);
     return cli;
    }
    //atualizar
    public Cliente atualizar(Cliente cliente){
        return repo.save(cliente);
    }
    //excluir
    public void Remover(Cliente cliente){

        repo.deleteById(cliente.getId());
    }


}
