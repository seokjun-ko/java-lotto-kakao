package model;

import java.util.List;

public class Lotto {
    List<Integer> numbers;

    public Lotto(List<Integer> numbers){
        this.numbers = numbers;
    }

    public Integer size(){
        return numbers.size();
    }
}
