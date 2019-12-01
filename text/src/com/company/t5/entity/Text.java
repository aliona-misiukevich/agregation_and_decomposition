package com.company.t5.entity;

import java.util.List;
import java.util.Objects;

public class Text {
    private Sentence title;
    private List<Sentence> text;

    public Text() {
        this.text = null;
        this.title = null;
    }
    public Text(Sentence title, List<Sentence> text){
        this.title = title;
        this.text = text;
    }

    public Sentence getTitle() {
        return title;
    }



    public void setTitle(Sentence title) {
        this.title = title;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(title, text1.title) &&
                Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text);
    }

    @Override
    public String toString() {
        return "Text{" +
                "title=" + title +
                ", text=" + text +
                '}';
    }
}
