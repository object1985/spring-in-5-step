package jp.co.tonaise.spring.basics.springin5step;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm algorithm;

//    @Autowired
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//	super();
//	this.algorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] umbers, int numberToSearchFor) {
	// Sorting an array
	// Implementing Sorting Logic
	// Bubble Sort Algorithm
	int[] sortedNumbers = algorithm.sort(umbers);
	System.out.println(sortedNumbers);
	// Quick Soer Algorithm

	// Search the array
	// Return the result
	return 3;
    }
}
