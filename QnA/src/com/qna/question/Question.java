package com.qna.question;

import com.qna.answer.Answer;

public abstract class Question {

    public Question() {}

    public Question(String question, Answer answer) {
        this.question = question;
        this.answer = answer;
    }

    protected String question;
    protected Answer answer;

    public void display() {
        System.out.println("\n--- Question Info ---");
        System.out.println("Category:\t" + this.getClass().getSimpleName());
        System.out.println("Question:\t" + this.question);
        this.answer.display();
    };

    public enum QuestionType {
        SOFTWARE("Software"),
        HARDWARE("Hardware");

        private String txt;

        QuestionType(String txt) {
            this.txt = txt;
        }

        public String getText() {
            return txt;
        }
    }
}
