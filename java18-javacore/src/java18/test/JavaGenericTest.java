package java18.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java18.javacore.JavaGeneric;

public class JavaGenericTest {

	@Test
	void shouldWorkCorrectly() {
		//check string
		JavaGeneric<String> stringType = new JavaGeneric<String>();
		assertEquals(true, stringType.isMatchedType("This is a String",String.class));
		assertEquals(false, stringType.isMatchedType(10,String.class));
		assertEquals(false, stringType.isMatchedType(10.5f,String.class));
		assertEquals(false, stringType.isMatchedType(10.5,String.class));
		//check int
		JavaGeneric<Integer> intType = new JavaGeneric<Integer>();
		assertEquals(true, intType.isMatchedType(5,Integer.class));
	}
}
