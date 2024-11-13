package com.noori.pokelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.noori.pokelist.dto.MonsListDTO;
import com.noori.pokelist.entities.MonsList;
import com.noori.pokelist.repositories.MonsListRepository;

@Service
public class MonsListService {
	
	@Autowired
	MonsListRepository monsListRepository;
	
	@Transactional(readOnly = true)
	public List<MonsListDTO> findAll() {
		List<MonsList> result = monsListRepository.findAll();
		List<MonsListDTO> dto = result.stream().map(x -> new MonsListDTO(x)).toList();
		return dto;
	
	
	
	}
	
}
