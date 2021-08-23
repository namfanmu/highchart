package com.stackInstance.HighChartDatabase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.stackInstance.HighChartDatabase.model.CountList;
import com.stackInstance.HighChartDatabase.model.Employee;

public interface CountListRepository extends CrudRepository<Employee, Integer> {

	@Query(value = "SELECT new com.stackInstance.HighChartDatabase.model.CountList(COUNT(e.name), DAY(e.createdDate)) FROM Employee e WHERE MONTH(e.createdDate) = ?1 GROUP BY DAY(e.createdDate) ORDER BY DAY(e.createdDate) ASC")
	List<CountList> findStatistics(int month);

	@Query(value = "select count(e.name) from employee e where MONTH(e.created_date)=?1", nativeQuery = true)
	long CountInMonth(int month);
}
