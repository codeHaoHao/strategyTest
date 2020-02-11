package test1;

public class Main {
	public static void main(String[] args) {
		String content = Context.algorithm(ConcreteStrategyA.class, "haha");
		System.out.println(content);
	}
	
	public static void main2() {
		String content = Context.algorithm2("test1.ConcreteStrategyB", "haha");
		System.out.println(content);
	}
}
