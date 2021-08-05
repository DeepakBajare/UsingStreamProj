package com.xworkz.kingdom.DTO;

import java.io.Serializable;

public class KingDTO implements Serializable {
	String name;
	String dynasty;
	String region;
	int totalYearRuled;
	String currentQueenName;
	int totalQueens;

	public KingDTO() {
		// TODO Auto-generated constructor stub
	}

	public KingDTO(String name, String dynasty, String region, int totalYearRuled, String currentQueenName,
			int totalQueens) {
		super();
		this.name = name;
		this.dynasty = dynasty;
		this.region = region;
		this.totalYearRuled = totalYearRuled;
		this.currentQueenName = currentQueenName;
		this.totalQueens = totalQueens;
	}

	@Override
	public String toString() {
		return "KingDTO [name=" + name + ", dynasty=" + dynasty + ", region=" + region + ", totalYearRuled="
				+ totalYearRuled + ", currentQueenName=" + currentQueenName + ", totalQueens=" + totalQueens + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentQueenName == null) ? 0 : currentQueenName.hashCode());
		result = prime * result + ((dynasty == null) ? 0 : dynasty.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + totalQueens;
		result = prime * result + totalYearRuled;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KingDTO other = (KingDTO) obj;
		if (currentQueenName == null) {
			if (other.currentQueenName != null)
				return false;
		} else if (!currentQueenName.equals(other.currentQueenName))
			return false;
		if (dynasty == null) {
			if (other.dynasty != null)
				return false;
		} else if (!dynasty.equals(other.dynasty))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (totalQueens != other.totalQueens)
			return false;
		if (totalYearRuled != other.totalYearRuled)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public String getDynasty() {
		return dynasty;
	}

	public String getRegion() {
		return region;
	}

	public int getTotalYearRuled() {
		return totalYearRuled;
	}

	public String getCurrentQueenName() {
		return currentQueenName;
	}

	public int getTotalQueens() {
		return totalQueens;
	}

}
