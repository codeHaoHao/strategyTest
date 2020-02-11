package test3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.ClassUtils;

public class Context {
	// �洢��ʵ����keyΪ������valueΪʵ��
	private static Map<String, Strategy> map;
	static {
		List<Object> strategys = null;
		try {
			strategys = ClassUtils.getAllObjectByInterface(Strategy.class);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		map = new HashMap<String, Strategy>();
		for (int i = 0; i < strategys.size(); i++) {
			Strategy strategy = (Strategy) strategys.get(i);
			String name = strategy.getClass().getSimpleName(); // ��ȡ����
			map.put(name, strategy);
		}
	}
	
	public static String algorithm(String className, String content) {
		return map.get(className).algorithm(content);
	}
}