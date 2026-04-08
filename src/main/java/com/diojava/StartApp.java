package com.diojava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.diojava.meu_primeiro_bancodedados.User;
import com.diojava.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Jonadabe");
        user.setUsername("jonas");
        user.setPassword("dio123");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
    
}
