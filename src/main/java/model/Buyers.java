package model;

import java.util.Map;

public class Buyers {
    Lottos lottos;
    Integer spentMoney = 0;
    LottoResult lottoResult;
    Result result;

    public Buyers(){
        lottoResult = new LottoResult();
        lottos = new Lottos();
    }

    public void setLottos(Lottos lottos) {
        this.lottos = lottos;
    }

    public void setSpentMoney(Integer money){
        this.spentMoney += money;
    }

    public void setResult(Result result){
        this.result = result;
    }

    public Map<LottoRank, Integer> compare(){
        if(result == null) return lottoResult.getResultCount();
        for(Lotto lotto : lottos.getLottoList()) lottoResult.add(calculateRank(lotto));
        return lottoResult.getResultCount();
    }

    public Map<LottoRank, Integer> compare(Result result){
        setResult(result);
        return compare();
    }

    private LottoRank calculateRank(Lotto lotto){
        int matchCount = calculateMatchCount(lotto);
        boolean matchBonus = lotto.getNumbers().contains(result.getBonus());
        return LottoRank.valueOf(matchCount, matchBonus);
    }

    private int calculateMatchCount(Lotto lotto){
        int matchCount = 0;
        for(Integer number : lotto.getNumbers()){
            if(result.getNumbers().contains(number)) matchCount++;
        }
        return matchCount;
    }

}
