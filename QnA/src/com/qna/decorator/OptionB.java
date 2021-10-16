package com.qna.decorator;

import com.qna.question.Question;

public class OptionB extends QuestionDecorator {

    public OptionB(Question decoratedQuestion) {
        super(decoratedQuestion);
        //addOption("Option B");
    }

    @Override
    public void display() {
        super.display();
        addOption("Option B");
    }

    @Override
    public void addOption(String option) {
        super.addOption(option);
    }
}
