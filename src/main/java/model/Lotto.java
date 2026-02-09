package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Lotto {
    List<Integer> numbers;

    public Lotto(List<Integer> numbers){
        if(numbers.size() != 6) throw new RuntimeException("로또 번호 개수가 6개가 아닙니다.");
        if(!numbers.stream().allMatch(new HashSet<Integer>()::add)) throw new RuntimeException("로또 번호는 중복될 수 없습니다");

        this.numbers = numbers;
    }

    public Integer size(){
        return numbers.size();
    }
}
