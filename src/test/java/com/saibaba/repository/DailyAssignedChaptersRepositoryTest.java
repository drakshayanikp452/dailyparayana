package com.saibaba.repository;

import com.saibaba.entity.DailyAssignedChapters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DailyAssignedChaptersRepositoryTest {
    @Autowired
    private DailyAssignedChaptersRepository dailyAssignedChaptersRepository;

    @Test
    void validateFetchRecords(){
      List<DailyAssignedChapters> dailyAssignedChaptersList= dailyAssignedChaptersRepository.findAll();
        Assertions.assertTrue(dailyAssignedChaptersList.size()==6);
    }
}
