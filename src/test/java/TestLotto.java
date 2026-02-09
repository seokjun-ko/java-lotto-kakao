import model.AutoLottoGenerator;
import model.Lotto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestLotto {

    @Test
    void 로또_번호는_6개의_수로_이루어져야_한다() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Lotto lotto = new Lotto(numbers);

        assertThat(lotto.size()).isEqualTo(6);
    }

}
