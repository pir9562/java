package comparablevscomparator;

public class Car {
	private String brand;
	private int cc;
	private int price;
	
	public Car(String brand, int cc, int price) {
		super();
		this.brand = brand;
		this.cc = cc;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", cc=" + cc + ", price=" + price + "]";
	}
}
