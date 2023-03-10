package com.juni.fm.record.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juni.fm.record.entiity.Work;

public interface WorkRepository extends JpaRepository<Work, Long>{

	List<Work> findByMemberId(Long memberId);

}
