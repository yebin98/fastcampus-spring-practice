package com.fastcampus.springpractice.logic;

import com.fastcampus.springpractice.logic.BubbleSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : logic
 * fileName       : BubbleSortTest
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
class BubbleSortTest {
    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다") //test의 제목
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        // Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // When
        List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        // Then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}