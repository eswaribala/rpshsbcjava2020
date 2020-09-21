package com.hsbc.insurance.bl;

import java.time.LocalDate;
import java.util.Random;
import java.util.regex.Pattern;

import com.hsbc.insurance.dao.PolicyHolderArrayImpl;
import com.hsbc.insurance.dao.PolicyHolderDao;
import com.hsbc.insurance.models.PolicyHolder;

public class PolicyHolderBLImpl implements PolicyHolderBL{

	private static Pattern pattern;
	private PolicyHolderDao policyHolderDao;
	
	public PolicyHolderBLImpl()
	{
		policyHolderDao=new PolicyHolderArrayImpl();
	}
	
	private boolean validateDate(LocalDate from, LocalDate to)
	{
		boolean status=false;
		if(from.isAfter(LocalDate.now())&&(to.isAfter(LocalDate.now())))
			status=true;
		return status;		
		
	}
	
	private boolean validateMobileNo(long mobileNo)
	{
		
		return Pattern.matches("\\d{10}", String.valueOf(mobileNo));
	}
	
	
	//validations
	//Validate Policy Holder Object
	@Override
	public boolean addPolicyHolder(PolicyHolder policyHolder) {
		boolean status=false;
		//generate the policy no
		policyHolder.setPolicyNo(new Random().nextInt(100000));
		//validation
		//validate from date and to date
		
		 if(validateDate(policyHolder.getFromDate(),policyHolder.getToDate()))
		 {
		    if(validateMobileNo(policyHolder.getPhoneNo()))
		    {
		      //save this in array
	  	     policyHolderDao.addPolicyHolder(policyHolder);
		
	  	     status=true;
		    }
		 }
		
		return status;
	}

	@Override
	public PolicyHolder[] getAllPolicyHolders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PolicyHolder getPolicyHolderById(long policyNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePolicyHolder(PolicyHolder policyHolder) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePolicyHolder(long policyNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PolicyHolder[] getAllSortedPolicyHolders() {
		// TODO Auto-generated method stub
		return null;
	}

}
