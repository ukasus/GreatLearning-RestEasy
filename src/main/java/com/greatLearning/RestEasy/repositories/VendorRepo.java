package com.greatLearning.RestEasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.RestEasy.entities.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, String> {

}
