package br.com.ideiasbits.api.services.impl;

import br.com.ideiasbits.api.domain.User;
import br.com.ideiasbits.api.repositories.UserRepository;
import br.com.ideiasbits.api.services.UserService;
import br.com.ideiasbits.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;
    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto Não encontrado"));
    }
}
