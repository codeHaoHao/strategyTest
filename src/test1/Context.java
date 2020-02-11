package test1;

public class Context {
	public static String algorithm(Class<? extends Strategy> c, String content) {
		Strategy strategy = null;
		try {
			strategy = c.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return strategy.algorithm(content);
	}
}