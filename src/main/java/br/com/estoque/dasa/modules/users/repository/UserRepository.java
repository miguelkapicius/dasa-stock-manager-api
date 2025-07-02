package br.com.estoque.dasa.modules.users.repository;

import br.com.estoque.dasa.modules.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
