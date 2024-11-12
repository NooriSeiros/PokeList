package com.noori.pokelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noori.pokelist.entities.Mons;

public interface MonsRepository extends JpaRepository<Mons,Long> {

}
