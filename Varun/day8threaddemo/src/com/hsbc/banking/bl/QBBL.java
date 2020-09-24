package com.hsbc.banking.bl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.hsbc.banking.exceptions.QuestionCreationException;
import com.hsbc.banking.exceptions.QuestionRetrievalException;
import com.hsbc.banking.models.Question;

public interface QBBL {
	boolean addQuestions(List<Question> questions) throws QuestionCreationException;
	List<Question> getQuestions() throws QuestionRetrievalException;
}
