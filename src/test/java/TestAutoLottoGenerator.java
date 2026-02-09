import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import model.Lotto;
import org.junit.jupiter.api.Test;
import model.AutoLottoGenerator;

import java.util.List;

public class TestAutoLottoGenerator {
	@Test
	void 자동으로_생성된_로또번호는_6자리이다() {
		AutoLottoGenerator generator = new AutoLottoGenerator();
		assertThat(generator.makeLotto().size()).isEqualTo(6);
	}


}
