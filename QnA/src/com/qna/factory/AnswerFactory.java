package com.qna.factory;

import com.qna.answer.Answer;
import com.qna.answer.Communityuser;
import com.qna.answer.Professor;
import com.qna.question.Question;

public class AnswerFactory extends AbstractFactory {

    @Override
    public Answer createAnswer(String answer, Answer.AnswerType type) {

        if (type == null) {
            return null;
        }

        switch (type) {
            case PROFESSOR:
                return new Professor(answer, type);
            case COMMUNITYUSER:
                return new Communityuser(answer, type);
            default:
                return null;
        }
    }

    @Override
    public Question createQuestion(Question.QuestionType type, String question, Answer answer) {
        return null;
    }
}
