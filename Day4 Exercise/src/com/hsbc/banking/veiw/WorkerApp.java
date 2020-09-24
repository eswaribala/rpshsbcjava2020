package com.hsbc.banking.veiw;

import java.io.IOException;
import java.util.Scanner;

import com.hsbc.banking.Bl.WorkerBl;
import com.hsbc.banking.Bl.WorkerBlImpl;
import com.hsbc.banking.dao.WorkerDao;
import com.hsbc.banking.dao.WorkerDaoImpl;
import com.hsbc.banking.models.DailyWorker;
import com.hsbc.banking.models.SalariedWorker;
import com.hsbc.banking.models.Worker;
//Worker app class takes the input whether the new worker is daily worker or salaried worker 

public class WorkerApp 
{
	static Scanner sc=new Scanner(System.in);
	static DailyWorker dw=new DailyWorker();
	static SalariedWorker sw=new SalariedWorker();
	static WorkerBl workerBl=new WorkerBlImpl();
		
		private static void menu()
		{
			 
			System.out.println(" Admin Menu");
			System.out.println("-----------------------------------------");
			System.out.println("1.Add Daily Worker");
			System.out.println("2.Add Salaried Worker");
			System.out.println("3.Display Pay");
			System.out.println("99.Exit");		
		}
		
		
		public static void choiceImpl(int option)
	   {
	       switch(option)
		{
			case 1:
			System.out.println("Enter name");
			sw.setName(sc.nextLine());
			
			System.out.println("Enter salary rate");
			sw.setSalaryRate(sc.nextInt());
			
			System.out.println("Enter working hours");
			sw.setNoOfWorkingHours(sc.nextInt());
			
			workerBl.addSalariedWorker(sw);
			
			break;
			
			case 2:
				System.out.println("Enter name");
				dw.setName(sc.nextLine());
				
				System.out.println("Enter salary rate");
				dw.setSalaryRate(sc.nextInt());
				
				workerBl.addDailyWorker(dw);
				
				sw.setNoOfWorkingHours(40);
			break;
			
			case 3:
				System.out.println("Pay for Salaried Workers----");
				workerBl.pay();
				
				System.out.println("Pay for Daily Workers----");
				workerBl.pay1();
				
				
				
		default:
		}
	   }
	
	
		public static void cls() 
		  {
		        try {
					new ProcessBuilder("cmd", "", "cls").inheritIO().start().waitFor();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    
		  }
		
		
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			DailyWorker dw=new DailyWorker();
			SalariedWorker sw=new SalariedWorker();
			WorkerBl workerBl=new WorkerBlImpl();
			
			// TODO Auto-generated method stub
			int choice=0;	
			//Scanner sc=new Scanner(System.in);
			
			do
			{
				
	          menu();               
	          System.out.println("Do you want to continue(1..98)");
	          choice=sc.nextInt();
	          sc.nextLine();
	          choiceImpl(choice);
			}
			while(choice!=99);
			
			sc.close();
		}

	

		
	
	
	
	}

