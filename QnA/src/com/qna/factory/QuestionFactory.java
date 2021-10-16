package com.qna.factory;

import com.qna.answer.Answer;
import com.qna.question.Hardware;
import com.qna.question.Question;
import com.qna.question.Software;

public class QuestionFactory extends AbstractFactory {

    @Override
    public Question createQuestion(Question.QuestionType type, String question, Answer answer) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case SOFTWARE:
                return (new Software(question, answer));
            case HARDWARE:
                return (new Hardware(question, answer));
            default:
                return null;
        }
    }

    @Override
    public Answer createAnswer(String answer, Answer.AnswerType type) {
        return null;
    }
}
