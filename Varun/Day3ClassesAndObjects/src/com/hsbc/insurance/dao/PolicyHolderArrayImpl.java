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
	public PolicyHolder getPolicyHolderById(long PolicyNum) {
		// TODO Auto-generated method stub
		PolicyHolder responseObj=null;
		for(PolicyHolder policyHolder:policyHolderList)
		{
			if(policyHolder.getPolicyNum()==PolicyNum)
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
			if(policyHolderObj.getPolicyNum()==policyHolder.getPolicyNum())
			{
				policyHolderObj.setNameOfInsured(policyHolder.getNameOfInsured());
				policyHolderObj.setEmailAddr(policyHolder.getEmailAddr());
				status=true;
				break;
			}
		}
		return status;
	}

	@Override
	public boolean deletePolicyHolder(long PolicyNum) {
		// TODO Auto-generated method stub
		boolean status=false;
		for(PolicyHolder policyHolderObj:policyHolderList)
		{
			if(policyHolderObj.getPolicyNum()==PolicyNum)
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