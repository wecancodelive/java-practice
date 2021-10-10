package in.balamt.practice.logical.vendingmachine;

public enum Item {

	COKE("Coke", 25), PEPSI("PEPSI", 35), SODA("Soda", 45);

	private String name;
	private int price;

	private Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

}
