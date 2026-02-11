package model;

import java.util.HashSet;
import java.util.List;

public class Lotto {
    List<Integer> numbers;

    public Lotto(List<Integer> numbers){
        if(numbers.size() != 6) throw new RuntimeException("로또 번호 개수가 6개가 아닙니다.");
        if(!numbers.stream().allMatch(new HashSet<Integer>()::add)) throw new RuntimeException("로또 번호는 중복될 수 없습니다");
        for (Integer number : numbers) {
            throwIfOutOfRange(number);
        }
        this.numbers = numbers;
    }

    private void throwIfOutOfRange(Integer number) {
        if (!isInRange(number)) {
            throw new RuntimeException("로또 번호는 1~45까지의 숫자여야 한다.");
        }
    }

    public boolean isInRange(Integer value) {
        return 1 <= value && value <= 45;
    }

    public Integer size(){
        return numbers.size();
    }

    public List<Integer> getNumbers(){
        return numbers;
    }
}
