package com.AptConnect.vendor_service.controller;


import com.AptConnect.vendor_service.model.Vendor;
import com.AptConnect.vendor_service.service.VendorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/vendors"})
public class VendorController {
    @Autowired
    private VendorService vendorService;

    public VendorController() {
    }

    @GetMapping({"/getAllVendors"})
    public List<Vendor> getAllVendors() {

        return this.vendorService.getAllVendors();
    }

    @PostMapping({"/createVendor"})
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return this.vendorService.createVendor(vendor);
    }
}

