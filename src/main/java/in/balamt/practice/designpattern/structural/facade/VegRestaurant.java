package in.balamt.practice.designpattern.structural.facade;

public class VegRestaurant implements Hotel {

	@Override
	public Menus getMenus() {
		VegMenus vMenu = new VegMenus();
		vMenu.setMenu("Paneer Tikka");
		return vMenu;
	}
}
