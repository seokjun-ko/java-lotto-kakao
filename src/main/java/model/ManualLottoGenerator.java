package model;

import java.util.List;

public class ManualLottoGenerator {
	public Lotto issueLotto(List<Integer> numbers) {
		return new Lotto(numbers);
	}
}
