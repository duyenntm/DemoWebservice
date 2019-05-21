package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StaffDao;
import com.example.demo.entity.Staff;


@Service
public class StaffService {
	@Autowired
    StaffDao staffDao;

    public java.util.List<Staff> getAllStaff() {
        return this.staffDao.findAll();
    }

    public Staff addStaff(Staff staff) {
        return this.staffDao.save(staff);
    }

    public Staff updateStaff(Staff staff) {
        return this.staffDao.save(staff);
    }

    public void deleteStaffById(int id) {
        this.staffDao.delete(id);
    }

    public void deleteAllStaff() {
        this.staffDao.deleteAll();
    }

}
