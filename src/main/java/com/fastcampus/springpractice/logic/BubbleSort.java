package com.fastcampus.springpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : logic
 * fileName       : BubbleSort
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
@Component //Bean으로 인식/등록
public class BubbleSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        for (int i = output.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }
}
