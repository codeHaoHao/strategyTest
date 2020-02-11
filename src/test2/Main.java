package test2;

public class Main {
	public static void main(String[] args) {
		String content = Context.algorithm(ConcreteStrategyA.class, "haha");
		System.out.println(content);
		System.out.println(Context.algorithm(ConcreteStrategyA.class, "haha"));
	}
}
