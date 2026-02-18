package model;

import java.util.List;

import Interface.LottoGenerator;

public class ManualLottoGenerator implements LottoGenerator {
	private final List<Integer> numbers;

	public ManualLottoGenerator(List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public Lotto issueLotto() {
		return new Lotto(numbers);
	}
}