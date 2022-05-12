package com.kodilla.testing.collection;

import java.util.Iterator;
import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        Iterator<Integer> iterator = numbers.iterator();
        List<Integer> resultList = new LinkedList<>();
        Integer currentNumber;

        while(iterator.hasNext()){
            currentNumber = iterator.next();
            if((currentNumber % 2) == 0){
                resultList.add(currentNumber);
            }
        }
        return resultList;
    }
}
