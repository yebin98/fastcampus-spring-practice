package com.fastcampus.springpractice.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * packageName    : logic
 * fileName       : JavaSort
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
public class JavaSort <T extends Comparable<T>> implements Sort<T>{

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }

}
