package com.company.t5.main;

import com.company.t5.entity.Sentence;
import com.company.t5.entity.Text;
import com.company.t5.entity.Word;
import com.company.t5.logic.TextLogic;
import com.company.t5.view.Print;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Word> sentence1 = new ArrayList<Word>();
        List<Word> title1 = new ArrayList<Word>();
        sentence1.add(new Word("Hello "));
        sentence1.add(new Word("my "));
        sentence1.add(new Word("beautifull "));
        sentence1.add(new Word("friends "));

        title1.add(new Word("title12345"));
        Sentence title = new Sentence(title1);
        Sentence sentenceOne = new Sentence(sentence1);

        List<Sentence> sen1 = new ArrayList<Sentence>();
        sen1.add(sentenceOne);
        Text text = new Text(title, sen1);

        TextLogic.addText(text, title);

        Print.printText(text);
    }
}
