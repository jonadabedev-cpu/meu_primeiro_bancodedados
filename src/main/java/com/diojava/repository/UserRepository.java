package com.diojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.diojava.meu_primeiro_bancodedados.User;

public interface UserRepository extends JpaRepository <User, Integer> {
    
}
