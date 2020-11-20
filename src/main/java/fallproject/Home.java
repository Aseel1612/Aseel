package fallproject;




public class Home {
	private int id;
	private HomeType type;
	private HomeMaterial material;
	private HomePlacement placement;
	private HomePets pets;
	private HomeAmenities amenities;
	private int price;
	private int area;
	private int numberofbedrooms;
	private int numberofbathrooms;
	private int leaselength;
	

	@Override
	public String toString() {
		return "Home [id= " + id + ", type= " + type.toString() + ", material = " + material.toString() + ", placement= " + placement.toString() + 
				", pets= " + pets.toString() + ", amenities= " + amenities.toString() + ", price= " + price +", area= " + area + 
				", number_of_bedrooms= " + numberofbedrooms + ", number_of_bathrooms= " + numberofbathrooms + 
				", lease_length= " + leaselength + "]";
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public HomePlacement getPlacement() {
		return placement;
	}

	public void setPlacement(HomePlacement placement) {
		this.placement = placement;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getarea() {
		return area;
	}

	public void setarea(int area) {
		this.area = area;
	}

	public int getnumberofbedrooms() {
		return numberofbedrooms;
	}

	public void setnumberofbedrooms(int numberofbedrooms) {
		this.numberofbedrooms = numberofbedrooms;
	}

	public int getnumberofbathrooms() {
		return numberofbathrooms;
	}

	public void setnumberofbathrooms(int numberofbathrooms) {
		this.numberofbathrooms = numberofbathrooms;
	}

	public int getleaselength() {
		return leaselength;
	}

	public void setleaselength(int leaselength) {
		this.leaselength = leaselength;
	}
	
	public HomeType gettype() {
		return type;
	}

	public void settype(HomeType type) {
		this.type = type;
	}

	public HomeMaterial getmaterial() {
		return material;
	}

	public void setmaterial(HomeMaterial material) {
		this.material = material;
	}

	public HomePets getpets() {
		return pets;
	}

	public void setpets(HomePets pets) {
		this.pets = pets;
	}

	public HomeAmenities getamenities() {
		return amenities;
	}

	public void setamenities(HomeAmenities amenities) {
		this.amenities = amenities;
	}


}

