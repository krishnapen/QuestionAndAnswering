package com.qna.builder;

public class Soft extends Ans {
	@Override
	public String question() {
		return "How do you implement polymorphism?";
	}

	@Override
	public String answer() {
		return "Polymorphism in Java has two types they are Compile time polymorphism (static binding) and Runtime polymorphism (dynamic binding). Method overloading is an example of static polymorphism, while method overriding is an example of dynamic polymorphism. An important example of polymorphism is how a parent class refers to a child class object. In fact, any object that satisfies more than one IS-A relationship is polymorphic in nature.";
	}
}