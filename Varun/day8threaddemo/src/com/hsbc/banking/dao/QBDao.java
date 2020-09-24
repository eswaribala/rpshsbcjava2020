package com.hsbc.banking.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.hsbc.banking.models.Question;

public interface QBDao {

	boolean addQuestions(List<Question> questions) throws FileNotFoundException, IOException;
	List<Question> getQuestions() throws FileNotFoundException, IOException, ClassNotFoundException;
}
