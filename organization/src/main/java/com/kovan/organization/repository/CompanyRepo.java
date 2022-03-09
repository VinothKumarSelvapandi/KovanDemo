package com.kovan.organization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kovan.organization.entity.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer>{

}
