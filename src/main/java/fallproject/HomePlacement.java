package fallproject;

import java.util.List;

public class HomePlacement {
	public static final List<String>  allPlacements = List.of("CITY", "VILLAGE");
	private String placement;
	
	public HomePlacement(String placement) {
		this.placement = placement;
	}
	
	@Override
	public String toString() {
		return this.placement;
	}
	
	public String getPlacement() {
		return placement;
	}

	public void setPlacement(String placement) {
		this.placement = placement;
	}
	
	public static boolean isHomePlacement(String spec) {
		return allPlacements.contains(spec); 
	}
}
