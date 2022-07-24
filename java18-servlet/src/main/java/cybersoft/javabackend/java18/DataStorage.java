package cybersoft.javabackend.java18;

import java.util.HashMap;

public class DataStorage {
	private static HashMap<String, String> store = new HashMap<>();

	public static String get(String key) {
		return store.get(key);
	}

	public static void put(String key, String value) {
		store.put(key, value);
	}
}
