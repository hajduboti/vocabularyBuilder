package project.springangular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import project.springangular.Entities.Role;
import project.springangular.Entities.User;
import project.springangular.Repos.UserRepository;

import java.util.Arrays;

@SpringBootApplication
@EnableJpaAuditing
public class SpringangularApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringangularApplication.class, args);
    }

    }
