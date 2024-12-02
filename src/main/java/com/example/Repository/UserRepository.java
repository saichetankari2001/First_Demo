package com.example.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.entity.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findAll();

	User save(User user);

    Optional<User> findById(Long id);

	void deleteById(Long id);

	

}
