package com.hsbc.banking.dao;

import com.hsbc.banking.models.Worker;

public interface DailyWorkerDao {
	boolean addDailyWorker(Worker worker);
	Worker[] getAllWorkers();
}
