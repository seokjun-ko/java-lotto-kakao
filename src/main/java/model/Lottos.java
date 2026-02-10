package model;

import java.util.ArrayList;
import java.util.List;

public class Lottos {
    List<Lotto> lottoList;

    public Lottos(){
        lottoList = new ArrayList<>();
    }

    public Integer getQuantity(){
        return lottoList.size();
    }

    public List<Lotto> getLottoList(){
        return lottoList;
    }

    public void add(Lotto lotto){
        lottoList.add(lotto);
    }
}
