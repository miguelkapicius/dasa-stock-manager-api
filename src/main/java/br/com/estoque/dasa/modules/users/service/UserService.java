package br.com.estoque.dasa.modules.users.service;

import br.com.estoque.dasa.modules.users.entity.User;
import br.com.estoque.dasa.modules.users.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> listAll() {
        return this.repository.findAll();
    }

    public User create (User user){
        return this.repository.save(user);
    }
}
