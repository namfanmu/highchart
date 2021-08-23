package com.stackInstance.HighChartDatabase.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.stackInstance.HighChartDatabase.model.CountList;
import com.stackInstance.HighChartDatabase.service.CountListService;

@Controller
public class CountListController {

	@Autowired
	private CountListService service;

	@GetMapping("/barChart/{month}")
	public String getAllEmployee(Model model, @PathVariable("month") int month) {
		List<CountList> list = service.getAllCountByDay(month);
		List<Integer> nameList = list.stream().map(x -> x.getDay()).collect(Collectors.toList());
		List<Long> ageList = list.stream().map(x -> x.getCount()).collect(Collectors.toList());
		long count = service.getAllCountInMonth(month);
		model.addAttribute("name", nameList);
		model.addAttribute("age", ageList);
		model.addAttribute("count", count);
		System.out.println(nameList);
		System.out.println(ageList);
		System.out.println(count);
		return "barChart";
	}

}
