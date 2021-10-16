package com.qna.decorator;

import com.qna.question.Question;

public class OptionA extends QuestionDecorator {

    public OptionA(Question decoratedQuestion) {
        super(decoratedQuestion);
        //addOption("Option A");
    }

    @Override
    public void display() {
        super.display();
        addOption("Option A");
    }

    @Override
    public void addOption(String option) {
        super.addOption(option);
    }
}
