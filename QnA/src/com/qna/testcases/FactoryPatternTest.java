package com.qna.testcases;

import static org.junit.Assert.assertNotNull;


import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.qna.answer.Answer;
import com.qna.factory.AnswerFactory;
import com.qna.factory.QuestionFactory;
import com.qna.question.Hardware;
import com.qna.question.Question;
import com.qna.question.Software;

public class FactoryPatternTest {

	//Question Factory
	
	@Test
	public void test_null_questionFactory_createAnswer() {
		System.out.println("Testing Create Answer Method - QuestionFactory");
		QuestionFactory questionfactory = new QuestionFactory();
		assertNull(questionfactory.createAnswer("", Answer.AnswerType.PROFESSOR));
	}

	@Test
	public void test_null_questionFactory_createQuestion() {
		System.out.println("Testing Create Question Method for null - QuestionFactory");
		QuestionFactory questionfactory = new QuestionFactory();
		assertNull(questionfactory.createQuestion(null, null, null));
	}

	@Test
	   public void test_notNull_questionFactory_createQuestion() {
		 Software s = new Software(null, null);
	      System.out.println("Testing Create Question Method for not null - QuestionFactory");
	      QuestionFactory questionfactory = new QuestionFactory();
	      assertNotNull(questionfactory.createQuestion(Question.QuestionType.SOFTWARE, "Explain Singleton and Factory design patterns?", null));
}
	
	//Answer Factory 
	
	@Test
	public void test_null_answerFactory_createQuestion() {
		System.out.println("Testing Create Question Method - AnswerFactory");
		AnswerFactory answerfactory = new AnswerFactory();
		assertNull(answerfactory.createQuestion(Question.QuestionType.HARDWARE,null,null));
	}

	@Test
	public void test_null_answerFactory_createAnswer() {
		System.out.println("Testing Create Answer Method for null - AnswerFactory");
		AnswerFactory answerfactory = new AnswerFactory();
		assertNull(answerfactory.createAnswer(null, null));
	}

	@Test
	   public void test_notNull_answerFactory_createAnswer() {
	      System.out.println("Testing Create Answer Method for not null - AnswerFactory");
			AnswerFactory answerfactory = new AnswerFactory();
	      assertNotNull(answerfactory.createAnswer("Polymorphism in Java has two types they are Compile time polymorphism (static binding) and Runtime polymorphism (dynamic binding). Method overloading is an example of static polymorphism, while method overriding is an example of dynamic polymorphism. An important example of polymorphism is how a parent class refers to a child class object. In fact, any object that satisfies more than one IS-A relationship is polymorphic in nature.", Answer.AnswerType.COMMUNITYUSER));
}
}
