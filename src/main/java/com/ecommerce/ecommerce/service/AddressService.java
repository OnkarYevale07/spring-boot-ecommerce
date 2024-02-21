package com.ecommerce.ecommerce.service;

import java.util.List;

import com.ecommerce.ecommerce.entity.Address;

public interface AddressService {
    
    public Address saveAddress(Address address);

    public List<Address> getAddressByUserId(int userId);

    public List<Address> getAllAddresses();

    public Address getAddressById(int id);

    public boolean deleteAddress(int id);
}
