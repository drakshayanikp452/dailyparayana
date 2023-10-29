package com.saibaba.repository;



import com.saibaba.entity.TrackDailyParayana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackDailyparayanaRepository extends JpaRepository<TrackDailyParayana,Long> {
}
