package com.hziee.hotel.Bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class Order implements Serializable {
	private int id;
	private String user_name;
	private String type;
	private String price;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date in_date;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date out_date;

	public Order() {

	}

	public Order(int id, String user_name, String type, String price, Date in_date, Date out_date) {
		this.id = id;
		this.user_name = user_name;
		this.type = type;
		this.price = price;
		this.in_date = in_date;
		this.out_date = out_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
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

	public Date getIn_date() {
		return in_date;
	}

	public void setIn_date(Date in_date) {
		this.in_date = in_date;
	}

	public Date getOut_date() {
		return out_date;
	}

	public void setOut_date(Date out_date) {
		this.out_date = out_date;
	}

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", user_name='" + user_name + '\'' +
				", type='" + type + '\'' +
				", price='" + price + '\'' +
				", in_date=" + in_date +
				", out_date=" + out_date +
				'}';
	}
}
