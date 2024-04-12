package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.Sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName    : service
 * fileName       : SortService
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
@Service // 서비스의 역활을 하는 Bean으로 등록
public class SortService {

    //DI
    private final Sort<String> sort;

    // 생성자 주입 방법
//    public SortService(Sort<String> sort) {
//        this.sort = sort;
//        System.out.println("구현체: " + sort.getClass().getName());
//    }

    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
//        Sort<String> sort = new JavaSort<>();
        return sort.sort(list);
    }

}
