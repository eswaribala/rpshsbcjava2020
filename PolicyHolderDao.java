package com.hsbc.insurance.dao;

import com.hsbc.insurance.models.PolicyHolder;

//Storage and Retrieval
public interface PolicyHolderDao {	
	//operations
	//create
	boolean addPolicyHolder(PolicyHolder policyHolder);
	//retrieve all
	PolicyHolder[] getAllPolicyHolders();
	//retrieve by id
	PolicyHolder getPolicyHolderById(long policyNo);
	//updating policy holder info
	boolean updatePolicyHolder(PolicyHolder policyHolder);
	//delete policy holder
	boolean deletePolicyHolder(long policyNo);
	//retrieve all PolicyHolders sorted by name
	PolicyHolder[] getAllSortedPolicyHolders();
}
