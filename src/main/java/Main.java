import java.util.Scanner;

import Interface.LottoGenerator;
import model.AutoLottoGenerator;
import model.Buyers;
import model.Lotto;
import model.Lottos;
import model.StoreResult;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LottoGenerator autoGenerator = new AutoLottoGenerator();
		Buyers buyer = new Buyers(autoGenerator);
		try {
			System.out.printf("구입금액을 입력해 주세요.");
			if(!sc.hasNextLine()) return;
			int money = Integer.parseInt(sc.nextLine().trim());
			Lottos lottos = buyer.buyLotto(money);
			for (Lotto lotto : lottos.getLottoList()) {
				System.out.println(lotto.getNumbers());
			}

			System.out.printf("지난 주 당첨 번호를 입력해 주세요.");
			if(!sc.hasNextLine()) return;
			StoreResult store = new StoreResult();
			store.setNumber(sc.nextLine());

			System.out.printf("보너스 볼을 입력해 주세요.");
			if(!sc.hasNextLine()) return;
			store.setBonus(sc.nextLine());

			buyer.setResult(store.getResult());
			buyer.compare();
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
