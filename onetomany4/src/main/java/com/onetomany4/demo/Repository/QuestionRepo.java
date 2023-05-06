package com.onetomany4.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany4.demo.Model.Question;

public interface QuestionRepo extends JpaRepository<Question,Integer>{

}
