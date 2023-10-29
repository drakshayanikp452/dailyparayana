package com.saibaba.repository;


import com.saibaba.entity.Chapters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaptersRepository extends JpaRepository<Chapters,Long> {
}
