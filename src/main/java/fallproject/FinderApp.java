package fallproject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.cucumber.datatable.DataTable;

public class FinderApp {
List<Home> homes;
private static  WebEmailService emailservice;
public static List<Home>MaterialList;
	
	public FinderApp(DataTable dataTable) {
		this.homes = new ArrayList<>();
		
	
		
		this.homes = new ArrayList<>();
		List<String> list = dataTable.asList();
		
		for (int i = 0; i < list.size(); i+=2) {
			List<String> specs = Arrays.asList(list.get(i).split("_"));
			HomeType type = new HomeType(specs.get(0));
			HomeMaterial material = new HomeMaterial(specs.get(1));
			HomePlacement placemnt = new HomePlacement(specs.get(2));
			HomePets pets = new HomePets(specs.get(3));
			HomeAmenities amenities = new HomeAmenities(Arrays.asList(specs.get(4).split(",")));
			List<String> numericData = Arrays.asList(list.get(i+1).split("_"));
			int price = Integer.parseInt(numericData.get(0));
			int area = Integer.parseInt(numericData.get(1));
			int numberofbedrooms = Integer.parseInt(numericData.get(2));
			int numberofbathrooms = Integer.parseInt(numericData.get(3));
			int leaselength = Integer.parseInt(numericData.get(4));
			
			Home home = new Home();
			home.settype(type);
			home.setamenities(amenities);
			home.setmaterial(material);
			home.setpets(pets);
			home.setPlacement(placemnt);

			home.setarea(area);
			home.setPrice(price);
			home.setnumberofbedrooms(numberofbedrooms);
			home.setnumberofbathrooms(numberofbathrooms);
			home.setleaselength(leaselength);
	
			homes.add(home);
		}
	}
		
	public void setEmailservice(WebEmailService emailService) {
		
		this.emailservice=emailService;
	}
	
	public List<Home> byType(String type){ 
		GeneralSpec ty=new BelowType(type);
		return bySpec(ty);
	}//finish



	private List<Home> bySpec(GeneralSpec ty) {
		List<Home> result = new ArrayList<>();
		for (int i = 0; i < homes.size(); i++) {
			if(ty.isMatched(this, i)) {
				result.add(homes.get(i));
			}
		}
		return result;
	}


	public List<Home> byMaterial(String material){
	/*	GeneralSpec mat=new BelowMaterial( material);
		return bySpec(mat);/*/
		List<Home> result = new ArrayList<>();
		for (int i = 0; i < homes.size(); i++) {
			if(material.equals(homes.get(i).getmaterial().toString())) {
				result.add(homes.get(i));}
			}
		
	
	MaterialList=result;
		emailservice.sendEmail("aseel.assi16@gmail.com",result);
		
		return result;
	}//finish


	public List<Home> byPlacement(String placement){
		GeneralSpec pla=new BelowPlacement( placement);
		return bySpec(pla);
		
	}//finished
	
	public List<Home> byAmenities(String amenity){
		GeneralSpec am=new BelowAmenties(amenity);
		return bySpec(am);
	}//finished

	public List<Home> byPets(String pets){
		GeneralSpec pet=new BelowPets(pets);
		return bySpec(pet);
	}
	//finished
	
	

	public List<Home> byPrice(Integer price){
		GeneralNum pr=new BelowPrice(price);
		return isMatchedSpec(price, pr);
	}


	private List<Home> isMatchedSpec(Integer price, GeneralNum pr) {
		List<Home> result = new ArrayList<>();
		for (int i = 0; i < homes.size(); i++) {
			
			if(pr.isbynum(price)){
				result.add(homes.get(i));
			}
		}
		return result;
	}


	public List<Home> byArea(Integer area) {
		GeneralNum  ar=new BelowAreae(area);
		return isMatchedSpec(area, ar);
		
	
	}


	public List<Home> byBedRoom(Integer bed) {
		GeneralNum bd=new BedRooms(bed);
		return isMatchedSpec(bed, bd);
	}

	public List<Home> byBathRoom(Integer bath) {
		GeneralNum bt=new BathRooms(bath);
		return isMatchedSpec(bath, bt);
	}
	//getLease_length
	public List<Home> byLease(Integer lease) {
		 GeneralNum leas=new LeasSpec(lease);
		return isMatchedSpec(lease, leas);
	
}


	


}