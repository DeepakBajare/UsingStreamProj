package com.xworkz.kingdom.DAO;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.kingdom.DTO.KingDTO;

public interface KingDAO {
	
	boolean saveKing(KingDTO kingDTO);
	
	Collection<KingDTO> findByRegion(Predicate<KingDTO> search);
	
	Optional<KingDTO> findOneByName(Predicate<KingDTO> search);
	
	Collection<KingDTO> findByNameLike(Predicate<KingDTO> search);

}
