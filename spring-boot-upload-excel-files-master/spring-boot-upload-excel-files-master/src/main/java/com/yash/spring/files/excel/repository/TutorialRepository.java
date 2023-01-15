package com.yash.spring.files.excel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.spring.files.excel.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
