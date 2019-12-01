package com.company.t5.view;

import com.company.t5.entity.Sentence;
import com.company.t5.entity.Text;
import com.company.t5.entity.Word;

import java.util.List;

public class Print {

    public static void printTitle(Text text) {
        Sentence title = text.getTitle();
        for (Word word:
             title.getSentence()) {
            System.out.println(" " + word.getWord());
        }

    }

    public static void printText(Text text) {
        for (Sentence sentence: text.getText()) {
            for (Word word:
                    sentence.getSentence()) {
                System.out.println(" " + word.getWord());
            }
        }
    }


}
