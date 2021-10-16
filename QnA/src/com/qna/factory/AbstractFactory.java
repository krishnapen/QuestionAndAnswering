package com.qna.factory;

import com.qna.answer.Answer;
import com.qna.question.Question;

public abstract class AbstractFactory {

    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("QUESTION")) {
            return (new QuestionFactory());
        }
        else if (choice.equalsIgnoreCase("ANSWER")) {
            return (new AnswerFactory());
        }
        else {
            return (null);
        }
    }

    public abstract Answer createAnswer(String answer, Answer.AnswerType type);
    public abstract Question createQuestion(Question.QuestionType type, String question, Answer answer);
}
