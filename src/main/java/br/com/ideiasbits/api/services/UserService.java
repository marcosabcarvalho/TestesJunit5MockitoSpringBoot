package br.com.ideiasbits.api.services;

import br.com.ideiasbits.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
