package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.entity.Address;
import com.ecommerce.ecommerce.repository.AddressRepository;

@Service
public class AddressServiceImpl  implements AddressService{

    @Autowired
    private AddressRepository addressRepo;

    @Override
    public Address saveAddress(Address address) {
        Address newAddress = addressRepo.save(address);
        return newAddress;
    }

    @Override
    public List<Address> getAddressByUserId(int userId) {
        
        return null;
    }

    @Override
    public List<Address> getAllAddresses() {
        return null;
    }

    @Override
    public Address getAddressById(int id) {

        return addressRepo.findById(id).get();
    }

    @Override
    public boolean deleteAddress(int id) {
        Address address = addressRepo.findById(id).get();
        if(address!=null){
            addressRepo.delete(address);
            return true;
        }
        return false;
    }
    

    
}
