package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.JavaSort;
import com.fastcampus.springpractice.service.SortService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : service
 * fileName       : SortServiceTest
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
class SortServiceTest {
    private SortService sut = new SortService(new JavaSort<>());

    @Test
    void test() {
        // Given

        // When
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        // Then
        assertEquals(List.of("1", "2", "3"), actual);
    }

}