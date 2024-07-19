package com.mongodbexamples.repository;

import com.mongodbexamples.entity.StudentRegistration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentRegistration,Long> {
}
