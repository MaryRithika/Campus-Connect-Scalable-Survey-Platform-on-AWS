package com.example.service;

import java.util.List;

import com.example.entity.StudentSurvey;


public interface StudentService {
    StudentSurvey saveStudentsurvey(StudentSurvey student);
    List<StudentSurvey> getAllStudentsurveys();
    StudentSurvey getStudentsurveyById(long id);
    StudentSurvey updateStudentsurvey(StudentSurvey student, long id);
    boolean deleteStudentsurvey(long id);
}
