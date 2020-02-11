package test1;

public class Main {
	public static void main(String[] args) {
		String content = Context.algorithm(ConcreteStrategyA.class, "haha");
		System.out.println(content);
	}
}
