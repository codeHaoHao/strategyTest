package test1;

public class ConcreteStrategyA implements Strategy{

	@Override
	public String algorithm(String content) {
		
		return "this is ConcreteStrategyA";
	}
	
}
