package com.noori.pokelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noori.pokelist.entities.MonsList;

public interface MonsListRepository extends JpaRepository<MonsList,Long> {

}
