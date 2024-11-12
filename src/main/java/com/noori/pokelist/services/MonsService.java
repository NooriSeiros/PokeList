package com.noori.pokelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noori.pokelist.dto.MonsMinDTO;
import com.noori.pokelist.entities.Mons;
import com.noori.pokelist.repositories.MonsRepository;

@Service
public class MonsService {
	
	@Autowired
	MonsRepository gameRepository;
	
	public List<MonsMinDTO> findAll() {
		List<Mons> result = gameRepository.findAll();
		List<MonsMinDTO> dto = result.stream().map(x -> new MonsMinDTO(x)).toList();
		return dto;
	}
}
