//package com.driver.services.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.driver.services.AdminService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.driver.model.Admin;
//import com.driver.model.Customer;
//import com.driver.model.Driver;
//import com.driver.repository.AdminRepository;
//import com.driver.repository.CustomerRepository;
//import com.driver.repository.DriverRepository;
//
//@Service
//public class AdminServiceImpl implements AdminService {
//
//	@Autowired
//	AdminRepository adminRepository1;
//
//	@Autowired
//	DriverRepository driverRepository1;
//
//	@Autowired
//	CustomerRepository customerRepository1;
//
//	@Override
//	public void adminRegister(Admin admin) {
//		//Save the admin in the database
//
//		adminRepository1.save(admin);
//	}
//
//	@Override
//	public Admin updatePassword(Integer adminId, String password) {
//		//Update the password of admin with given id
//		// getting the admin obj;
//		Admin admin=adminRepository1.findById(adminId).get();
//		admin.setPassword(password);
//		adminRepository1.save(admin);
//		return admin;
//
//	}
//
//	@Override
//	public void deleteAdmin(int adminId){
//		// Delete admin without using deleteById function
//		Admin admin=adminRepository1.findById(adminId).get();
//		adminRepository1.delete(admin);
//
//	}
//
//	@Override
//	public List<Driver> getListOfDrivers() {
//		//Find the list of all drivers
//		List<Driver>drivers=driverRepository1.findAll();
//		return drivers;
//	}
//
//	@Override
//	public List<Customer> getListOfCustomers() {
//		//Find the list of all customers
//		List<Customer>customers=customerRepository1.findAll();
//		return customers;
//	}
//
//}
package com.driver.services.impl;

import java.util.List;

import com.driver.model.Driver;
import com.driver.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.driver.model.Admin;
import com.driver.model.Customer;
import com.driver.repository.AdminRepository;
import com.driver.repository.CustomerRepository;
import com.driver.repository.DriverRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository1;

	@Autowired
	DriverRepository driverRepository1;

	@Autowired
	CustomerRepository customerRepository1;

	@Override
	public void adminRegister(Admin admin) {
		//Save the admin in the database
		adminRepository1.save(admin);
	}

	@Override
	public Admin updatePassword(Integer adminId, String password) {
		//Update the password of admin with given id
		Admin newAdmin = adminRepository1.findById(adminId).get();
		newAdmin.setPassword(password);
		adminRepository1.save(newAdmin);
		return  newAdmin;
	}

	@Override
	public void deleteAdmin(int adminId){
		// Delete admin without using deleteById function
		Admin currAdmin = adminRepository1.findById(adminId).get();
		adminRepository1.delete(currAdmin);
	}

	@Override
	public List<com.driver.model.Driver> getListOfDrivers() {
		//Find the list of all drivers
		List<Driver> drivers = driverRepository1.findAll();
		return drivers;


	}

	@Override
	public List<Customer> getListOfCustomers() {
		//Find the list of all customers
		List<Customer> customers = customerRepository1.findAll();
		return customers;
	}

}