package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.Sort;

import java.util.List;

/**
 * packageName    : service
 * fileName       : SortService
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
public class SortService {

    //DI
    private final Sort<String> sort;

    // 생성사 주입 방법
    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
//        Sort<String> sort = new JavaSort<>();
        return sort.sort(list);
    }

}
