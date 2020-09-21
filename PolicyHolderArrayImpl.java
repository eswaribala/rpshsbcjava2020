package com.hsbc.insurance.dao;

import com.hsbc.insurance.models.PolicyHolder;
//Array Transient Objects
public class PolicyHolderArrayImpl implements PolicyHolderDao{

	private PolicyHolder[] policyHolderList;
	private static int pos;
	
	public PolicyHolderArrayImpl()
	{
		policyHolderList=new PolicyHolder[5];
	}
	
	@Override
	public boolean addPolicyHolder(PolicyHolder policyHolder) {
		// TODO Auto-generated method stub		
		policyHolderList[pos]=policyHolder;
		pos++;
		return true;
	}

	@Override
	public PolicyHolder[] getAllPolicyHolders() {
		// TODO Auto-generated method stub
		return policyHolderList;
	}

	@Override
	public PolicyHolder getPolicyHolderById(long policyNo) {
		// TODO Auto-generated method stub
		PolicyHolder responseObj=null;
		for(PolicyHolder policyHolder:policyHolderList)
		{
			if(policyHolder.getPolicyNo()==policyNo)
			{
				responseObj=policyHolder;
				break;
			}
		}
		return responseObj;
	}

	@Override
	public boolean updatePolicyHolder(PolicyHolder policyHolder) {
		// TODO Auto-generated method stub
		boolean status=false;
		for(PolicyHolder policyHolderObj:policyHolderList)
		{
			if(policyHolderObj.getPolicyNo()==policyHolder.getPolicyNo())
			{
				policyHolderObj.setNameOfInsured(policyHolder.getNameOfInsured());
				policyHolderObj.setEmail(policyHolder.getEmail());
				status=true;
				break;
			}
		}
		return status;
	}

	@Override
	public boolean deletePolicyHolder(long policyNo) {
		// TODO Auto-generated method stub
		boolean status=false;
		for(PolicyHolder policyHolderObj:policyHolderList)
		{
			if(policyHolderObj.getPolicyNo()==policyNo)
			{
				policyHolderObj=null;
				status=true;
				break;
			}
		}
		return status;
	}

	@Override
	public PolicyHolder[] getAllSortedPolicyHolders() {
		// TODO Auto-generated method stub
		return null;
	}

}
