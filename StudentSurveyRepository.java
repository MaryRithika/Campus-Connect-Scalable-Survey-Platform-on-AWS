package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentSurvey;

@Repository
public interface StudentSurveyRepository extends JpaRepository<StudentSurvey, Long>{

    
}