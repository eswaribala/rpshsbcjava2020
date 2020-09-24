package com.hsbc.banking.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.hsbc.banking.bl.QBBL;
import com.hsbc.banking.bl.QBBLImpl;
import com.hsbc.banking.exceptions.FileCreationException;
import com.hsbc.banking.exceptions.QuestionCreationException;
import com.hsbc.banking.exceptions.QuestionRetrievalException;
import com.hsbc.banking.models.Answer;
import com.hsbc.banking.models.Question;

public class QuestionApp extends Thread{

	private static QBBL qbBL;
	private static ResourceBundle resourceBundle;
	static
	{
		try {
			qbBL=new QBBLImpl();
		} catch (FileCreationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	private static void addQuestions()
	{
		resourceBundle=ResourceBundle.getBundle("com/hsbc/banking/resources/qb");
		List<Question> questions=new ArrayList<Question>();
		Question question=null;
		List<Answer> answers=null;
		Answer answer=null;
		for(int i=1;i<3;i++)
		{
			question=new Question();
			question.setQuestionNo(i);
			question.setDescription(resourceBundle.getString("question"+i));
			answers=new ArrayList<Answer>();
			for(int j=1;j<5;j++)
			{
				answer=new Answer();
				answer.setAnswerId(j);
				answer.setDescription(resourceBundle.getString("answer"+i+j));
				answers.add(answer);				
			}
			question.setAnswers(answers);
			questions.add(question);
		}
		
		try {
			qbBL.addQuestions(questions);
		} catch (QuestionCreationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
	private void getQuestions()
	{
		try {
			for(Question question : qbBL.getQuestions())
			{
				
				System.out.println(question.getQuestionNo()+"."+question.getDescription());
				for(Answer answer:question.getAnswers())
				{
					System.out.println(answer.getAnswerId()+"."+answer.getDescription());
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		} catch (QuestionRetrievalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 getQuestions();
	}

	public static void main(String[] args)
	{
		//addQuestions();
		QuestionApp questionApp=new QuestionApp();		
		questionApp.start();
		
	}
	
}
