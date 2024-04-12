package com.fastcampus.springpractice.controller;

import com.fastcampus.springpractice.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName    : com.fastcampus.springpractice.controller
 * fileName       : MainController
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
@RestController
public class MainController {

    private final SortService sortService;

    public MainController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")
    public String hello(@RequestParam List<String> list) {
        return sortService.doSort(list).toString();
    }

}
