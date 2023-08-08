package com.assigncode;

public class Hotel {
	
	private int id;
	private String hotel_Name;
	private Menu menuItem;

	public void setId(int id) {
		this.id = id;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_Name = hotel_name;
	}

	public void setMenuItem(Menu menuItem) {
		this.menuItem = menuItem;

	}

	public int getId() {
		return id;
	}

	public String getHotel_name() {
		return hotel_Name;
	}

	public Menu getMenuItem() {
		return menuItem;
	}

	public static void main(String[] args) {
		Hotel h = new Hotel();
		h.setId(67894);
		h.setHotel_name("Goodluck");
		h.setMenuItem(new Menu());

		Menu m = h.getMenuItem();
		m.setM_id(1);
		m.setMenu_name("Dalbati");
		m.setPrice(2000);

		System.out.println(h.getId());
		System.out.println(h.getHotel_name());
		System.out.println(m.getM_id());
		System.out.println(m.getMenu_name());
		System.out.println(m.getPrice());

	}

}



