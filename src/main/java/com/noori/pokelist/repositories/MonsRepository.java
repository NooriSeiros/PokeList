package com.noori.pokelist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.noori.pokelist.entities.Mons;
import com.noori.pokelist.projections.MonsMinProjection;

public interface MonsRepository extends JpaRepository<Mons,Long> {
	
	@Query(nativeQuery = true, value = """
			SELECT tb_mons.id, tb_mons.title, tb_mons.game_year AS `year`, tb_mons.img_url AS imgUrl,
			tb_mons.short_description AS shortDescription, tb_belonging.position
			FROM tb_mons
			INNER JOIN tb_belonging ON tb_mons.id = tb_belonging.mons_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<MonsMinProjection> searchByList(Long listId);
}
