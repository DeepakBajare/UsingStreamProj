package com.xworkz.kingdom.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.xworkz.kingdom.DTO.KingDTO;

public class KingDAOImpl implements KingDAO {

	Collection<KingDTO> list = new ArrayList<KingDTO>();

	@Override
	public boolean saveKing(KingDTO kingDTO) {
		System.out.println(kingDTO);
		return this.list.add(kingDTO);
	}

	@Override
	public Collection<KingDTO> findByRegion(Predicate<KingDTO> search) {

		return this.list.stream().filter(temp -> search.test(temp)).collect(Collectors.toList());
	}

	@Override
	public Optional<KingDTO> findOneByName(Predicate<KingDTO> search) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(temp -> search.test(temp)).findAny();
	}

	@Override
	public Collection<KingDTO> findByNameLike(Predicate<KingDTO> search) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(flag -> search.test(flag)).collect(Collectors.toList());
	}

}
