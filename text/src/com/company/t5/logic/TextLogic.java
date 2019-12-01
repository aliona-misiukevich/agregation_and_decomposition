package com.company.t5.logic;
//1. Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

import com.company.t5.entity.Sentence;
import com.company.t5.entity.Text;

public class TextLogic {

    public static Text addText(Text text, Sentence sentence){
        text.getText().add(sentence);
        return text;
    }
}
