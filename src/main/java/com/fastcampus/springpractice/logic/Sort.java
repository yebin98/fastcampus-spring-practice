package com.fastcampus.springpractice.logic;

import java.util.List;

/**
 * packageName    : logic
 * fileName       : Sort
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
public interface Sort <T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
