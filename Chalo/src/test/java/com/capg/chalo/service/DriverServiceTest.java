package com.capg.chalo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.chalo.entity.Driver;
import com.capg.chalo.entity.Payment;
import com.capg.chalo.entity.Vehicle;
import com.capg.chalo.exception.CustomException;
import com.capg.chalo.repository.DriverRepository;


@SpringBootTest
public class DriverServiceTest {
	@Autowired
	private DriverService driverService;
	
	@MockBean
	private DriverRepository driverRepository;
	
	private Driver driver; 
	private Payment payment; 
	private Vehicle vehicle;
	
	@BeforeEach
	public void driverServiceTestSetUp() {
		driver = new Driver(1l,"Ramu",567342,6789534273l,"MP04RS4356","Bike","Ramu@123","Ramu@123");
		
	}
	
	@Test
	public void addDriverTest() throws CustomException {
		Mockito.when(driverRepository.save(driver)).thenReturn(driver);
		assertThat(driverService.addDriver(driver)).isEqualTo(driver);
	}
	
	@Test
	public void getAllDriversTest() throws CustomException {
		List<Driver> driverList = new ArrayList<>();
		driverList.add(driver);
		Mockito.when(driverRepository.findAll()).thenReturn(driverList);
		assertThat(driverService.showAllDrivers()).isEqualTo(driverList);
	}
	
	@Test
	public void updateDriverTest() throws CustomException{
//		Mockito.when(driverRepository.save(driver)).thenReturn(driver);
//		Mockito.when(driverRepository.findById(1l)).thenReturn(Optional.of(driver));
//		
//		Driver updatedDriver = new Driver(2l,"Ramu",567342,6789534273l,"MP04RS4356","Bike","Ramu@123","Ramu@123");
//		Driver result = driverService.updateDriver(updatedDriver);
//		
//		assertEquals("Steven",result.getDriverName());
//		assertEquals("Steve@123",result.getPassword());
//		assertEquals("Steve@123",result.getConfirmPassword());
//		assertEquals("56789432",result.getLicenseNo());
//		assertEquals("MP07MS4532",result.getVehicleNo());
//		assertEquals(7890654361l,result.getMobileNo());
//		
//		Driver driver = driverRepository.findById(2L).get();
//		driver.setDriverName("Steven");
//		driver.setLicenseNo(56789432);
//		driver.setMobileNo(7890654361l);
//		driver.setPassword("Steve@123");
//		driver.setConfirmPassword("Steve@123");
//		driver.setVehicleNo("MP07MS4532");
//		driver.setVehicleType("Bike");
//		driverRepository.save(driver);
//		assertNotNull("Honey", driverRepository.findById(2L).get().getDriverName());
//		assertNotNull(56432896, driverRepository.findById(2L).get().getLicenseNo());
		
	}
	
	
	
}
