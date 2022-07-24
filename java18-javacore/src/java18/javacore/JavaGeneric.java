package java18.javacore;

public class JavaGeneric <T> {
	// data type safe
	// []
	
	public static void main(String[] args) {
		printToConsole("Van Phuc");
		printToConsole(new Integer(100));
	}

	public static boolean isString(Object object) {

		if (object instanceof String)
			return true;
		return false;
	}
	
	public static <T> void printToConsole(T obj) {
		System.out.println("Object java: " + obj.toString());
	}
	
	public boolean isMatchedType(Object obj, Class<T> clazz) {
		
		try {
			clazz.cast(obj);
		}catch (Exception e) {
			return false;// TODO: handle exception
		}
		return true;
	}
}
