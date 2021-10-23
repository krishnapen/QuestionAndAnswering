//package com.qna.builder;
//
//public class QuestionAndAnswerBuilder {
//	
//	
//	
//	public static class Builder {
//		
//		
//		
//		
//	
//	}
//	
//	
//
////    private final AbstractFactory questionFactory;
////    private final AbstractFactory answerFactory;
////
////    public QuestionAndAnswerFacade() {
////        this.questionFactory = new QuestionFactory();
////        this.answerFactory = new AnswerFactory();
////    }
////
////    public Question createSoftware(String question, String answer, Answer.AnswerType type) {
////        Answer ans = this.answerFactory.createAnswer(answer, type);
////        Question ques = this.questionFactory.createQuestion(Question.QuestionType.SOFTWARE, question, ans);
////
////        return ques;
////    }
////
////    public Question createHardware(String question, String answer, Answer.AnswerType type) {
////        Answer ans = this.answerFactory.createAnswer(answer, type);
////        Question ques = this.questionFactory.createQuestion(Question.QuestionType.HARDWARE, question, ans);
////
////        return ques;
////    }
////
////    public Question addOptionA(Question question) {
////        return (new OptionA(question));
////    }
////
////    public Question addOptionB(Question question) {
////        return (new OptionB(question));
////    }
////
////    public Question addAllOptions(Question question) {
////        return (addOptionB(addOptionA(question)));
////    }
//	
//}
