package day12.Fruit;

public class Fruit implements Comparable<Fruit> {
	private String name;
	private String color;
	private double price;
	private int quantity;
	
	public Fruit(String name, String color, double price, int quantity) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public int compareTo(Fruit o) {
		return this.color.compareToIgnoreCase(o.color);
	}
	
	
}
