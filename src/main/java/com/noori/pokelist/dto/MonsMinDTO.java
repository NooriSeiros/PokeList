package com.noori.pokelist.dto;

import com.noori.pokelist.entities.Mons;
import com.noori.pokelist.projections.MonsMinProjection;

public class MonsMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public MonsMinDTO() {	
	}

	public MonsMinDTO(Mons entity) {
		
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getGenre();
		this.shortDescription = entity.getShortDescription();
	}
	
	public MonsMinDTO(MonsMinProjection projection) {
		
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getYear();
		this.shortDescription = projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}


}
