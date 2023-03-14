package com.capg.chalo.dto;

import lombok.Data;

@Data
public class BookingDto {

	private long bookingId;
	private int otp;
	private String pickupLocation;
	private String dropLocation;
	private long driverId;
	private long userId;
}
