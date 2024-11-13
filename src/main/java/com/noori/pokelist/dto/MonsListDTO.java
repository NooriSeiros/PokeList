package com.noori.pokelist.dto;

import com.noori.pokelist.entities.MonsList;

public class MonsListDTO {
	
	private Long id;
	private	String name;
	
	public MonsListDTO() {
			
	}

	public MonsListDTO(MonsList entity) {
		
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
