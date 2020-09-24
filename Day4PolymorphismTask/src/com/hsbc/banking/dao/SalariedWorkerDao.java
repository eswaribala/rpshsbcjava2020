package com.hsbc.banking.dao;

import com.hsbc.banking.models.Worker;

public interface SalariedWorkerDao {
	boolean addDSalariedWorker(Worker worker);
	Worker[] getAllWorkers();
}
