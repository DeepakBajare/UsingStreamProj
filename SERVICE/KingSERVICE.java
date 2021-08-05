package com.xworkz.kingdom.SERVICE;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.kingdom.DTO.KingDTO;

public interface KingSERVICE {

	boolean validateAndSave(KingDTO kingDTO);

	Collection<KingDTO> validateAndFindByRegion(Predicate<KingDTO> search);

	Optional<KingDTO> validateFindOneByName(Predicate<KingDTO> search);

	Collection<KingDTO> validateAndFindNameLike(Predicate<KingDTO> search);
}
