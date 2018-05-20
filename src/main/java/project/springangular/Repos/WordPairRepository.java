package project.springangular.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.springangular.Entities.WordPair;


@Repository
public interface WordPairRepository extends JpaRepository<WordPair, Long> {
    }
