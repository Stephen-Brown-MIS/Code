package com.stephenbrown.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stephenbrown.relationships.models.License;
import com.stephenbrown.relationships.repositories.LicenseRepository;
@Service
public class LicenseService {
    // adding the license repository as a dependency
    private final LicenseRepository licenseRepository;
    
    public LicenseService(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }
    // returns all the licenses
    public List<License> allLicenses() {
        return licenseRepository.findAll();
    }
    // creates a license
    public License createLicense(License b) {
        return licenseRepository.save(b);
    }
    // retrieves a license
    public License findLicense(Long id) {
        Optional<License> optionalLicense = licenseRepository.findById(id);
        if(optionalLicense.isPresent()) {
            return optionalLicense.get();
        } else {
            return null;
        }
    }
    // updateLicense will take in a License object and save it to our database
    // our repository will automatically update an existing License object if their IDs match
    public License updateLicense(License License) {
		return licenseRepository.save(License);
	}
	
    // to delete a license, we simply pass in the license ID and if our repository finds it, the license will be deleted
	public void deleteLicense(Long id) {
		Optional<License> optionalLicense = licenseRepository.findById(id);
		if(optionalLicense.isPresent()) {
			licenseRepository.deleteById(id);
		}
	}
}

