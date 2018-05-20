package project.springangular.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.springangular.Entities.WordPair;
import project.springangular.Repos.WordPairRepository;
import project.springangular.exceptions.ResourceNotFoundException;

import javax.validation.Valid;
import java.util.List;


@RestController

public class WordPairController {

    @Autowired
    WordPairRepository wordPairRepository;

    @CrossOrigin(origins = "http://localhost:4200")

    @GetMapping("/words")
    public List<WordPair> retrieveAllWords(){
        return wordPairRepository.findAll();
    }

    @GetMapping("/words/{id}")
    public WordPair getWordPair(@PathVariable(value = "id") Long id) {
        return wordPairRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Wordpair", "id", id));

    }

    @DeleteMapping("/words/{id}")
    public ResponseEntity<?> deleteWordPair(@PathVariable(value = "id") Long id) {
        WordPair wordPair = wordPairRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Wordpair", "id", id));

        wordPairRepository.delete(wordPair);

        return ResponseEntity.ok().build();
    }
    @PostMapping("/words")
    public WordPair createWordPair(@Valid @RequestBody WordPair wordPair) {
        return wordPairRepository.save(wordPair);
    }


}
