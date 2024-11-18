package ro.emanuel.phone.pojo;

public class Phone {

	private int id;
	private String brand;
	private double price;
	private int ram;
	private int storage;
	
	public Phone() {
		
	}

	public Phone(int id, String brand, double price, int ram, int storage) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	
}
