package com.qna.builder;

import com.qna.question.Question;
import com.qna.answer.Answer;

public class QuestionAndAnswerBuilder {

	public void buildSoftware() {
		Soft s = new Soft();
		
		QuestionBuilder qb = new QuestionBuilder();
		   // Question Creation
        Question soft = qb.buildSoftware(s.question(), s.answer(), Answer.AnswerType.PROFESSOR);

        // Display
        soft.display();

	}
	public void buildHardware() {
		Hard s = new Hard();
		
		QuestionBuilder qb = new QuestionBuilder();
		   // Question Creation
        Question soft = qb.buildSoftware(s.question(), s.answer(), Answer.AnswerType.PROFESSOR);

        // Display
        soft.display();

	}
}
