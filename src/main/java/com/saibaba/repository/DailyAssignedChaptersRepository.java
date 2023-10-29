package com.saibaba.repository;



import com.saibaba.entity.DailyAssignedChapters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyAssignedChaptersRepository extends JpaRepository<DailyAssignedChapters,Long> {
}
