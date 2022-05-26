package com.hziee.hotel.Bean;

import lombok.Data;

import java.util.Date;

@Data
public class order {
	private int id;
	private String user_name;
	private String type;
	private String price;
	private Date in_date;
	private Date out_date;
}
