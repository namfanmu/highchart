package com.stackInstance.HighChartDatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackInstance.HighChartDatabase.model.CountList;
import com.stackInstance.HighChartDatabase.repository.CountListRepository;

@Service
public class CountListService {
	@Autowired
	CountListRepository repository;

	public List<CountList> getAllCountByDay(int month) {
		return repository.findStatistics(month);
	}

	public long getAllCountInMonth(int month) {
		return repository.CountInMonth(month);
	}

}
