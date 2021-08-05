package com.xworkz.kingdom.Tester;

import java.util.Optional;

import com.xworkz.kingdom.DTO.KingDTO;
import com.xworkz.kingdom.SERVICE.KingSERVICE;
import com.xworkz.kingdom.SERVICE.KingSERVICEImpl;

public class KingTester {
	public static void main(String[] args) {

		KingDTO kingDTO1 = new KingDTO("Vikramaditya", "ChalukyaDynasty", "Bagalkot", 30, "Chandala Devi", 11);
		KingDTO kingDTO2 = new KingDTO("PeshwaBajirao", "Maratha", "Pune", 45, "BajiraoMastani", 3);
		KingDTO kingDTO3 = new KingDTO("ChandraguptaMaurya", "ChandraguptaMaurya Dynasty ", "Punjab", 29, "Durdhara",
				4);
		KingDTO kingDTO4 = new KingDTO("king Ala al-Din Husayn", "Ghazni Dynasty", "Lahore", 55, "AfreenBegum", 8);
		KingDTO kingDTO5 = new KingDTO("Samudragupta", "GuptaDynasty", "UttarPradesh", 40, "Kumaradevi", 6);
		KingDTO kingDTO6 = new KingDTO("Peshwar", "Kanishka ", "Kashmir", 34, "Subadra", 9);

		KingSERVICE service = new KingSERVICEImpl();
		service.validateAndSave(kingDTO1);
		service.validateAndSave(kingDTO2);
		service.validateAndSave(kingDTO3);
		service.validateAndSave(kingDTO4);
		service.validateAndSave(kingDTO5);
		service.validateAndSave(kingDTO6);

		System.out.println("--------------------------------");

		service.validateAndFindByRegion((a) -> a.getRegion().equals("Kashmir")).forEach(System.out::println);

		System.out.println("--------------------------------");

		Optional<KingDTO> optional = service.validateFindOneByName(flag -> flag.getName().equals("Vikramaditya"));
		if (optional.isPresent()) {
			KingDTO dto = optional.get();
			System.out.println(dto);
		}
		
		System.out.println("--------------------------------");
		
	service.validateAndFindNameLike((tree) -> tree.getName().equals("Samudragupta")).forEach(System.out::println);

	}

}
