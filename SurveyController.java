package com.example.MicroServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.StudentSurvey;
import com.example.service.StudentService;

@RestController
@RequestMapping("/api")
public class SurveyController {
    
    private final StudentService studentsurveyService;

    @Autowired
    public SurveyController(StudentService studentsurveyService) {
        super();
        this.studentsurveyService = studentsurveyService;
    }

    @PostMapping("/createstudentsurvey")
    public ResponseEntity<StudentSurvey> createStudentSurvey(@RequestBody StudentSurvey studentsurvey) {
        return new ResponseEntity<StudentSurvey>(studentsurveyService.saveStudentsurvey(studentsurvey), HttpStatus.CREATED);
    }

    @GetMapping("/getstudentsurveys")
    public List<StudentSurvey> getAllStudentSurveys() {
        return studentsurveyService.getAllStudentsurveys();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentSurvey> getStudentSurveyById(@PathVariable("id") Long id){
        return new ResponseEntity<StudentSurvey>(studentsurveyService.getStudentsurveyById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateStudentSurvey(@PathVariable("id") Long id, @RequestBody StudentSurvey studentsurvey) {
        StudentSurvey newSurvey = studentsurveyService.updateStudentsurvey(studentsurvey, id);

        if (newSurvey != null) {
            studentsurveyService.saveStudentsurvey(newSurvey);
            return new ResponseEntity<String>("Survey <" + id + "> has been successfully updated!", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Survey update - failed", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentSurvey(@PathVariable("id") Long id) {
        boolean deletedStudentsurvey = studentsurveyService.deleteStudentsurvey(id);

        if (deletedStudentsurvey) {
            return new ResponseEntity<String>("Survey <" + id + "> has been successfully deleted!", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Survey deletion - failed. "+id+" - not found.", HttpStatus.NOT_FOUND);
        }
    }

}
