package jp.co.tonaise.spring.basics.springin5step;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepApplication {

    public static void main(String[] args) {
//	BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm());
//	int result = binarySearchImpl.binarySearch(new int[] { 12, 4, 6 }, 3);
//	System.out.println(result);

	ApplicationContext context = SpringApplication.run(SpringIn5StepApplication.class, args);
	BinarySearchImpl search = context.getBean(BinarySearchImpl.class);
	int result = search.binarySearch(new int[] { 12, 4, 6 }, 3);
	System.out.println(result);
    }

}
