package com.noori.pokelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.noori.pokelist.dto.MonsDTO;
import com.noori.pokelist.dto.MonsMinDTO;
import com.noori.pokelist.entities.Mons;
import com.noori.pokelist.repositories.MonsRepository;

@Service
public class MonsService {
	
	@Autowired
	MonsRepository monsRepository;
	
	@Transactional(readOnly = true)
	public MonsDTO findById(Long id) {
		Mons result = monsRepository.findById(id).get();
		MonsDTO dto = new MonsDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<MonsMinDTO> findAll() {
		List<Mons> result = monsRepository.findAll();
		List<MonsMinDTO> dto = result.stream().map(x -> new MonsMinDTO(x)).toList();
		return dto;
	}
	
	
}
