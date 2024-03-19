package com.oumayma.vediocallapp;

import com.oumayma.vediocallapp.user.User;
import com.oumayma.vediocallapp.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VedioCallAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(VedioCallAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserService service) {
        return args -> {
            service.register(User.builder()
                    .username("oumayma")
                    .email("oumayma@gmail.com")
                    .password("oumayma")
                    .build());

            service.register(User.builder()
                    .username("wafae")
                    .email("wafae@gmail.com")
                    .password("0000")
                    .build());
        };
    }
}
