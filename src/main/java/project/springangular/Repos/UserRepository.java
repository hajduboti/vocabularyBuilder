package project.springangular.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.springangular.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
