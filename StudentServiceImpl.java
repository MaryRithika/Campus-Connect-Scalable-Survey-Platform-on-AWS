package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StudentSurvey;

import com.example.repository.StudentSurveyRepository;

@Service
public class StudentServiceImpl implements StudentService{
    public StudentSurveyRepository studentsurveyRepository;

    @Autowired
    public StudentServiceImpl(StudentSurveyRepository studentsurveyRepository) {
        super();
        this.studentsurveyRepository = studentsurveyRepository;
    }


    @Override
    public StudentSurvey saveStudentsurvey(StudentSurvey studentsurvey) {
        return studentsurveyRepository.save(studentsurvey);
    }

    @Override
    public List<StudentSurvey> getAllStudentsurveys() {
        return studentsurveyRepository.findAll();
    }

    @Override
    public StudentSurvey getStudentsurveyById(long id) {
        Optional<StudentSurvey> studentsurvey = studentsurveyRepository.findById(id);

        if (studentsurvey.isPresent()) {
            return studentsurvey.get();
        }
        else {
            return null;
        }
    }

    @Override
    public StudentSurvey updateStudentsurvey(StudentSurvey studentsurvey, long id) {
        Optional<StudentSurvey> mystudentsurveyid = studentsurveyRepository.findById(id);

        if (mystudentsurveyid.isPresent()) {
            StudentSurvey presentSurvey = mystudentsurveyid.get();
            presentSurvey.setStudentFirstName(studentsurvey.getStudentFirstName());
            presentSurvey.setStudentLastName(studentsurvey.getStudentLastName());
            presentSurvey.setStudentStreetAddress(studentsurvey.getStudentStreetAddress());
            presentSurvey.setStudentCity(studentsurvey.getStudentCity());
            presentSurvey.setStudentState(studentsurvey.getStudentState());
            presentSurvey.setStudentZip(studentsurvey.getStudentZip());
            presentSurvey.setStudentPhoneNumber(studentsurvey.getStudentPhoneNumber());
            presentSurvey.setStudentEmail(studentsurvey.getStudentEmail());
            presentSurvey.setStudentDateOfSurvey(studentsurvey.getStudentDateOfSurvey());
            presentSurvey.setStudentLikedMost(studentsurvey.getStudentLikedMost());
            presentSurvey.setStudentInterestedIn(studentsurvey.getStudentInterestedIn());
            presentSurvey.setStudentLikelihood(studentsurvey.getStudentLikelihood());
            return presentSurvey;
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteStudentsurvey(long id) {
        Optional<StudentSurvey> mystudentsuveyid = studentsurveyRepository.findById(id);

        if (mystudentsuveyid.isPresent()) {
            studentsurveyRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}
