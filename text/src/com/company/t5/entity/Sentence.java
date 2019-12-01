package com.company.t5.entity;

import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> sentence;

    public Sentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public Sentence() {
        this.sentence = null;
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return Objects.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + sentence +
                '}';
    }

}
