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
		assertNotNull(questionAndAnswerFacade.createSoftware("How do you implement polymorphism?", "Polymorphism in Java has two types they are Compile time polymorphism (static binding) and Runtime polymorphism (dynamic binding). Method overloading is an example of static polymorphism, while method overriding is an example of dynamic polymorphism. An important example of polymorphism is how a parent class refers to a child class object. In fact, any object that satisfies more than one IS-A relationship is polymorphic in nature.", Answer.AnswerType.PROFESSOR));
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
		assertNotNull(questionAndAnswerFacade.createHardware("what is Suitable motor for robot?", "I'm planning on building my first robot using an Arduino. It's going to be a small obstacle avoiding robot powered with a 9V battery. What should the voltage of the DC motor used in the robot be? Also, if you you've done this before please give some tips", Answer.AnswerType.PROFESSOR));
	}

	@Test
	public void test_notNull_addOptionA() {
		System.out.println("Testing Create Question Method for not null - QuestionFactory");
		QuestionAndAnswerFacade questionAndAnswerFacade = new QuestionAndAnswerFacade();
		assertNotNull(questionAndAnswerFacade.addOptionA(null));
	}

}
