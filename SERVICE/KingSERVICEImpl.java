package com.xworkz.kingdom.SERVICE;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import com.xworkz.kingdom.DAO.KingDAO;
import com.xworkz.kingdom.DAO.KingDAOImpl;
import com.xworkz.kingdom.DTO.KingDTO;

public class KingSERVICEImpl implements KingSERVICE {

	private KingDAO dao = new KingDAOImpl();

	// private Collection<KingDTO> list = new ArrayList<KingDTO>();

	@Override
	public boolean validateAndSave(KingDTO kingDTO) {
		boolean nameValidate = false;
		boolean dynastyValidate = false;
		boolean regionValidate = false;
		boolean totalYearRuledValidate = false;
		boolean currentQueenNameValidate = false;
		boolean totalQueensValidate = false;

		System.out.println(kingDTO);
		if (kingDTO != null) {
			System.out.println("KingDTO is not null,validating data...");

			String name = kingDTO.getName();
			if (name != null && name.length() > 4 && name.length() < 50) {
				System.out.println("name is valid");
				nameValidate = true;
			} else {
				System.out.println("name is not valid...");
				nameValidate = false;
			}

			String dynasty = kingDTO.getDynasty();
			if (dynasty != null && dynasty.length() > 4 && dynasty.length() < 50) {
				System.out.println("dynasty is valid");
				dynastyValidate = true;
			} else {
				System.out.println("dynasty is not valid");
				dynastyValidate = false;
			}

			String region = kingDTO.getRegion();
			if (region != null && region.length() > 4 && region.length() < 50) {
				System.out.println("region is not valid");
				regionValidate = true;
			} else {
				System.out.println("region is not valid");
				regionValidate = false;
			}

			int totalYearRuled = kingDTO.getTotalYearRuled();
			if (totalYearRuled != 0) {
				System.out.println("totalYearRuled is validate");
				totalYearRuledValidate = true;
			} else {
				System.out.println("totalYearRuled is not validate");
				totalQueensValidate = false;
			}

			String currentQueenName = kingDTO.getCurrentQueenName();
			if (currentQueenName != null && currentQueenName.length() > 4 && currentQueenName.length() < 50) {
				System.out.println("currentQueenName is validate");
				currentQueenNameValidate = true;
			} else {
				System.out.println("currentQueenName is not validate");
				currentQueenNameValidate = false;
			}

			int totalQueens = kingDTO.getTotalQueens();
			if (totalQueens != 0 && totalQueens > 3) {
				System.out.println("totalQueen is valid");
				totalQueensValidate = true;
			} else {
				System.out.println("totalQueen is not validate");
				totalQueensValidate = false;
			}
			if (nameValidate && dynastyValidate && regionValidate && totalYearRuledValidate && currentQueenNameValidate
					&& totalQueensValidate) {
				dao.saveKing(kingDTO);
				System.out.println("All data is validated....");
				return true;
			} else {
				System.out.println("All Data is not validated");
				return false;
			}

		}

		return false;
	}

	@Override
	public Collection<KingDTO> validateAndFindByRegion(Predicate<KingDTO> search) {
		return dao.findByRegion(search);

	}

	@Override
	public Optional<KingDTO> validateFindOneByName(Predicate<KingDTO> search) {

		return dao.findOneByName(search);
	}

	@Override
	public Collection<KingDTO> validateAndFindNameLike(Predicate<KingDTO> search) {
		// TODO Auto-generated method stub
		return dao.findByNameLike(search);
	}

}
