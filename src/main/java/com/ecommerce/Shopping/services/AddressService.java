package com.ecommerce.Shopping.services;

import com.ecommerce.Shopping.entities.Address;
import com.ecommerce.Shopping.payloads.AddressDTO;

import java.util.List;



public interface AddressService {
	
	AddressDTO createAddress(AddressDTO addressDTO);
	
	List<AddressDTO> getAddresses();
	
	AddressDTO getAddress(Long addressId);
	
	AddressDTO updateAddress(Long addressId, Address address);
	
	String deleteAddress(Long addressId);
}