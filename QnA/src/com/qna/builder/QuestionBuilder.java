package com.qna.builder;

import com.qna.answer.Answer;
import com.qna.factory.AbstractFactory;
import com.qna.factory.AnswerFactory;
import com.qna.factory.QuestionFactory;
import com.qna.question.Question;

public class QuestionBuilder {

	private final AbstractFactory questionFactory;
	private final AbstractFactory answerFactory;

	public QuestionBuilder() {
		this.questionFactory = new QuestionFactory();
		this.answerFactory = new AnswerFactory();
	}

	public Question buildSoftware(String question, String answer, Answer.AnswerType type) {
		Answer ans = this.answerFactory.createAnswer(answer, type);
		Question ques = this.questionFactory.createQuestion(Question.QuestionType.SOFTWARE, question, ans);

		return ques;
	}

	public Question buildHardware(String question, String answer, Answer.AnswerType type) {
		Answer ans = this.answerFactory.createAnswer(answer, type);
		Question ques = this.questionFactory.createQuestion(Question.QuestionType.HARDWARE, question, ans);

		return ques;
	}
}