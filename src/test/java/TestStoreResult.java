import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import model.StoreResult;

public class TestStoreResult {

	@Test
	void 외부에서_당첨번호를_입력했을_때_저장한다(){

		String input = "1, 2, 3, 4, 5, 6";
		List<Integer> answer = List.of(1, 2, 3, 4, 5, 6);
		StoreResult store = new StoreResult();

		assertThat(store.setNumber(input)).isEqualTo(answer);
	}

	@Test
	void 보너스_볼을_입력했을_때_저장한다(){
		String input = "7";
		Integer answer = 7;
		StoreResult store = new StoreResult();
		assertThat(store.setBonus(input)).isEqualTo(answer);
	}
}
