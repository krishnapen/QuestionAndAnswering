package com.qna;

import com.qna.answer.Answer;
import com.qna.builder.QuestionAndAnswerBuilder;
import com.qna.decorator.OptionA;
import com.qna.decorator.OptionB;
import com.qna.facade.QuestionAndAnswerFacade;
import com.qna.factory.AbstractFactory;
import com.qna.question.Question;

public class Main {

    public static void main(String[] args) {
        
        AbstractFactory questionFactory = AbstractFactory.getFactory("QUESTION");
        AbstractFactory answerFactory = AbstractFactory.getFactory("ANSWER");

        assert answerFactory != null;
        assert questionFactory != null;

        // Answer Creation
        Answer communityUserAnswer = answerFactory.createAnswer("Electrical circuits, digital signal processors and microcontrollers can all be used to implement control systems. Control engineering has a wide range of applications from the flight and propulsion systems of commercial airliners to the cruise control present in many modern automobiles.", Answer.AnswerType.COMMUNITYUSER);
        Answer professorAnswer = answerFactory.createAnswer("Singleton: Singleton design pattern is a design pattern that restricts the instantiation of a class to one object, Factory design patterns: The purpose of the Factory method is to provide a new instance of the object whenever the Factory method is being called.", Answer.AnswerType.PROFESSOR);

        // Question Creation
        Question software = questionFactory.createQuestion(Question.QuestionType.SOFTWARE, "Explain Singleton and Factory design patterns?", professorAnswer);
        Question hardware = questionFactory.createQuestion(Question.QuestionType.HARDWARE, "What are application of Control Systems?", communityUserAnswer);

        // Adding options
        Question softwareWithOptions = new OptionA(new OptionB(questionFactory.createQuestion(Question.QuestionType.SOFTWARE, "Test", professorAnswer)));

        software.display();
        hardware.display();
        softwareWithOptions.display();

        // -------------------------------------------------------------------------------------

       
        QuestionAndAnswerFacade QnA = new QuestionAndAnswerFacade();

        // Question Creation
        Question soft = QnA.createSoftware("How do you implement encapsulation?", "Hiding Internals & Provide access with getters & setters", Answer.AnswerType.PROFESSOR);
        Question hard = QnA.createHardware("What is the power requirement for Raspberry Pi model B?", "The power requirement for Raspberry Pi model B is 700 mA", Answer.AnswerType.COMMUNITYUSER);

        // Display
        soft.display();
        hard.display();

        // Adding Options
        soft = QnA.addOptionB(soft);
        hard = QnA.addAllOptions(hard);

        soft.display();
        hard.display();
        
        
     // -------------------------------------------------------------------------------------
        
        QuestionAndAnswerBuilder builder = new QuestionAndAnswerBuilder();
        builder.buildSoftware();
        builder.buildHardware();
       
    }
}
