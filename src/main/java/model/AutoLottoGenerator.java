package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AutoLottoGenerator {
	private final List<Integer> numbers;

	public AutoLottoGenerator(){
		numbers = IntStream.rangeClosed(1, 45)
			.boxed()
			.collect(Collectors.toCollection(ArrayList::new));
	}


	public Lotto issueLotto() {
		Collections.shuffle(numbers);
		return new Lotto(new ArrayList<>(numbers.subList(0, 6)));
	}
}
