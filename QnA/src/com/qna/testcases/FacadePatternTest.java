package com.qna.testcases;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.qna.answer.Answer;
import com.qna.facade.QuestionAndAnswerFacade;

class FacadePatternTest {
	@Test
	public void test_null_createsoftware() {
		System.out.println("Testing Create Software Method for null");
		QuestionAndAnswerFacade questionAndAnswerFacade = new QuestionAndAnswerFacade();
		assertNull(questionAndAnswerFacade.createSoftware(null, null, null));
	}

	@Test
	public void test_notNull_createsoftware() {
		System.out.println("Testing Create Software Method for not null");
		QuestionAndAnswerFacade questionAndAnswerFacade = new QuestionAndAnswerFacade();
		assertNotNull(questionAndAnswerFacade.createSoftware("Tesla CyberTruck", "", Answer.AnswerType.PROFESSOR));
	}

	@Test
	public void test_null_createhardware() {
		System.out.println("Testing Create Hardware Method for null");
		QuestionAndAnswerFacade questionAndAnswerFacade = new QuestionAndAnswerFacade();
		assertNull(questionAndAnswerFacade.createHardware(null, null, null));
	}

	@Test
	public void test_notNull_createhardware() {
		System.out.println("Testing Create Hardware Method for not null");
		QuestionAndAnswerFacade questionAndAnswerFacade = new QuestionAndAnswerFacade();
		assertNotNull(questionAndAnswerFacade.createHardware("Kymco Agility", "", Answer.AnswerType.PROFESSOR));
	}

	@Test
	public void test_notNull_addOptionA() {
		System.out.println("Testing Create Question Method for not null - QuestionFactory");
		QuestionAndAnswerFacade questionAndAnswerFacade = new QuestionAndAnswerFacade();
		assertNotNull(questionAndAnswerFacade.addOptionA(null));
	}

}
