package com.noori.pokelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noori.pokelist.dto.MonsMinDTO;
import com.noori.pokelist.entities.Mons;
import com.noori.pokelist.services.MonsService;

@RestController
@RequestMapping(value = "/mons")
public class MonsController {
	
	@Autowired
	private MonsService monsService;
	
	@GetMapping
	public List<MonsMinDTO> findAll(){
		List<MonsMinDTO> result = monsService.findAll();
		return result;
	}
}
