package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.EmpDto;

public interface EmpRepo extends JpaRepository<EmpDto, Integer>{

}
