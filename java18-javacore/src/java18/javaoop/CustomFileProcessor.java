package java18.javaoop;

import java.io.IOException;

public class CustomFileProcessor {
	
	//behavior parameterization
	public String processFile(String path, BufferedReaderProcessor processor) {
		try(BufferedReader)
	}
	
	@FunctionalInterface
	public interface BufferedReaderProcessor() {
		
		//signature
		//function decriptor
		//BufferedReader -> String
		String process(BufferedReader br) throws IOException;
		defaul void 
	}
}

