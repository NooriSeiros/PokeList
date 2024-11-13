package com.noori.pokelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noori.pokelist.dto.MonsListDTO;
import com.noori.pokelist.dto.MonsMinDTO;
import com.noori.pokelist.services.MonsListService;

@RestController
@RequestMapping(value = "/lists")
public class MonsListController {
	
	@Autowired
	private MonsListService monsListService;
	
	
	
	@GetMapping
	public List<MonsListDTO> findAll(){
		List<MonsListDTO> result = monsListService.findAll();
		return result;
	}
}
