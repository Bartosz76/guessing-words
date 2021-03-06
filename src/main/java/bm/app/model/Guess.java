package bm.app.model;

import java.util.Optional;

public class Guess {

    private int id;
    private String word;
    private Integer number;

    public Guess() {
    }

    public Guess(String word, Integer number){
        this.word = word;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
