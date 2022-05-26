package com.hziee.hotel.Bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Room implements Serializable {
	private String type;
	private String price;
	private String stock;

	public Room(String type, String price, String stock) {
		this.type = type;
		this.price = price;
		this.stock = stock;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Room{" +
				"type='" + type + '\'' +
				", price='" + price + '\'' +
				", stock='" + stock + '\'' +
				'}';
	}

}
