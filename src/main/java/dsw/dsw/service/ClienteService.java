package service;

import model.Cliente;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClienteRepository;
import repository.UserRepository;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    List<Cliente> getAll(){
        return repository.findAll();
    };
}
