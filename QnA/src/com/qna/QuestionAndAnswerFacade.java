package com.qna;

import com.qna.answer.Answer;
import com.qna.decorator.OptionA;
import com.qna.decorator.OptionB;
import com.qna.factory.AbstractFactory;
import com.qna.factory.AnswerFactory;
import com.qna.factory.QuestionFactory;
import com.qna.question.Question;

public class QuestionAndAnswerFacade {

    private final AbstractFactory questionFactory;
    private final AbstractFactory answerFactory;

    public QuestionAndAnswerFacade() {
        this.questionFactory = new QuestionFactory();
        this.answerFactory = new AnswerFactory();
    }

    public Question createAutomobile(String question, String answer, Answer.AnswerType type) {
        Answer answe = this.answerFactory.createAnswer(answer, type);
        Question software = this.answerFactory.createQuestion(Question.QuestionType.SOFTWARE, question, answe);

        return software;
    }

    public Question createScooter(String question, String answer, Answer.AnswerType type) {
        Answer answe = this.answerFactory.createAnswer(answer, type);
        Question hardware = this.questionFactory.createQuestion(Question.QuestionType.HARDWARE, question, answe);

        return hardware;
    }

    public Question addOptionA(Question question) {
        return (new OptionA(question));
    }

    public Question addOptionB(Question question) {
        return (new OptionB(question));
    }

    public Question addAllOptions(Question question) {
        return (addOptionB(addOptionA(question)));
    }
}
