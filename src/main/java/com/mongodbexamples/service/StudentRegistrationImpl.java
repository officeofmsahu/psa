package com.mongodbexamples.service;


import com.mongodbexamples.entity.StudentRegistration;
import com.mongodbexamples.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationImpl implements StudentRegistrationService {
 private StudentRepository studentRepository;

    public StudentRegistrationImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentRegistration createStudentRegistration(StudentRegistration studentRegistration) {
        StudentRegistration savedEntity = studentRepository.save(studentRegistration);
        return savedEntity;

    }
}
