package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StoreResult {
	List<Integer> numbers;
	Integer bonus;

	public StoreResult(){
		numbers = new ArrayList<>();;
	}

	public List<Integer> setNumber(String input) {
		numbers = Arrays.stream(input.split(","))
			.map(String::trim)
			.map(Integer::parseInt)
			.collect(Collectors.toList());

		return numbers;
	}

	public Integer setBonus(String input) {
		bonus = Integer.parseInt(input);
		return bonus;
	}
}
