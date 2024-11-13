package com.noori.pokelist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	@ManyToOne
	@JoinColumn(name = "mons_id")
	private Mons mons;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private MonsList list;
	
	public BelongingPK () {
		
	}

	public BelongingPK(Mons mons, MonsList list) {
		super();
		this.mons = mons;
		this.list = list;
	}

	public Mons getMons() {
		return mons;
	}

	public void setMons(Mons mons) {
		this.mons = mons;
	}

	public MonsList getList() {
		return list;
	}

	public void setList(MonsList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(list, mons);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(list, other.list) && Objects.equals(mons, other.mons);
	}

}
