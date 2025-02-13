package com.firstspringapplication.QuizApp.dao;

import com.firstspringapplication.QuizApp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
	
}