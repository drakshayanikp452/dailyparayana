package com.saibaba.repository;

import com.saibaba.entity.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupsRepository  extends JpaRepository<Groups,Long> {
}
