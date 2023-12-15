package org.example.JWT.Practice1.repository;

import org.example.JWT.Practice1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

   Optional<User> getByuserEmail(String username);
}
