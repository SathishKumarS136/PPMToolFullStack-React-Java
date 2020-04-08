package com.sathish.reactapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathish.reactapplication.domain.Backlog;

@Repository
public interface BacklogRepository extends JpaRepository<Backlog, Long> {
	
	Backlog findByProjectIdentifier(String projectIdentifier);
	
}
