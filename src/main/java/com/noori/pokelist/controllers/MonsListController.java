package com.noori.pokelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noori.pokelist.dto.MonsListDTO;
import com.noori.pokelist.dto.MonsMinDTO;
import com.noori.pokelist.services.MonsListService;
import com.noori.pokelist.services.MonsService;

@RestController
@RequestMapping(value = "/lists")
public class MonsListController {
	
	@Autowired
	private MonsListService monsListService;
	
	@Autowired
	private MonsService monsService;
	
	
	
	@GetMapping
	public List<MonsListDTO> findAll(){
		List<MonsListDTO> result = monsListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/mons")
	public List<MonsMinDTO> findByList(@PathVariable Long listId){
		List<MonsMinDTO> result = monsService.findByList(listId);
		return result;
	}
}
