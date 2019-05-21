package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Staff;

public interface StaffDao extends JpaRepository<Staff, Integer>{

}
