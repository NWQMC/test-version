package gov.acwi.wqp;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.node.ObjectNode;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public Function<String, String> reverseString() {
//		return value -> {
//			System.out.println(value);
//			String rtn = new StringBuilder(value).reverse().toString();
//			System.out.println(rtn);
//			return rtn;
//		};
//	}
	
	@Bean
	public Function<Object, String> echoObject() {
		return value -> {
			System.out.println(value.toString());
			return "Hello";
		};
	}
}