package test3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Context {
	
	private static Map<String, Strategy> map = new ConcurrentHashMap<String, Strategy>();
	
	public static String algorithm(Class<? extends Strategy> c, String content) {
		Strategy strategy = null;
		try {
			if (map.get(c.getName()) != null) {
				System.out.println("from map");
				strategy = map.get(c.getName());
			} else {
				System.out.println("from class.newInstance");
				strategy = c.newInstance();
				map.put(c.getName(), strategy);
			}
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return strategy.algorithm(content);
	}
}