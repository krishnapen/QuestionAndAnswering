package com.qna.decorator;

import com.qna.question.Question;

public abstract class QuestionDecorator extends Question {

    protected Question decoratedQuestion;
    //protected ArrayList<String> options;

    public QuestionDecorator(Question decoratedQuestion) {
        this.decoratedQuestion = decoratedQuestion;
        //this.options = new ArrayList<>();
    }

    @Override
    public void display() {
    	decoratedQuestion.display();
    }

    public void addOption(String option) {
        System.out.println(option);
    }
}
