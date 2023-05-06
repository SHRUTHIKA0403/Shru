package com.onetomany4.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany4.demo.Model.Answer;

public interface AnswerRepo extends JpaRepository<Answer,Integer>{

}
