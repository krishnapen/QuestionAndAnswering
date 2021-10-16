package com.qna.answer;

public abstract class Answer {

    public enum AnswerType {
        PROFESSOR("Professor"),
        COMMUNITYUSER("Communityuser");

        private String txt;

        AnswerType(String txt) {
            this.txt = txt;
        }

        public String getText() {
            return txt;
        }
    }

    protected String answer;
    protected AnswerType type;

    public Answer(String answer, AnswerType type) {
        this.answer = answer;
        this.type = type;
    }

    public void display() {
        System.out.println("Answer ------");
        System.out.println("Answer By:\t" + this.type.getText());
        System.out.println("Answer:\t" + this.answer);
    }
}
