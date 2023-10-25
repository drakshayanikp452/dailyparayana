package com.saibaba.repository;

import com.saibaba.entity.Groups;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GroupsRepositoryTest {
    @Autowired
    private GroupsRepository groupsRepository;

    @Test
    void validateFetchRecords(){
      List<Groups> groupsList= groupsRepository.findAll();
        Assertions.assertTrue(groupsList.size()==6);
    }
}
