package com.AptConnect.vendor_service.service;

import com.AptConnect.vendor_service.model.Vendor;
import com.AptConnect.vendor_service.repository.VendorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
    @Autowired
    private VendorRepository vendorRepository;

    public VendorService() {
    }

    public List<Vendor> getAllVendors() {
        return this.vendorRepository.findAll();
    }

    public Vendor createVendor(Vendor vendor) {
        return (Vendor)this.vendorRepository.save(vendor);
    }
}
