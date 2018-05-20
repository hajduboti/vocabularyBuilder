package project.springangular.Entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WordPair {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String word;
    private String meaning;
    private String language;
    private String category;
    private String creator;

    public WordPair(){

    }

    public WordPair(String word, String meaning, String language, String category, String creator) {
        this.word = word;
        this.meaning = meaning;
        this.language = language;
        this.category = category;
        this.creator = creator;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
