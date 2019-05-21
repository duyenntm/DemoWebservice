package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;


@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffService staffService;
	
	 @RequestMapping(value = "/all", method = RequestMethod.GET)
     public List<Staff> getAllStaff() {
         return staffService.getAllStaff();
     }
 
     @RequestMapping(value = "/addstaff", method = RequestMethod.POST,
             consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     @ResponseBody()
     public Staff addNewStaff(@RequestBody Staff staff) {
         return this.staffService.addStaff(staff);
     }
     
     @RequestMapping(value = "/updatestaff", method = RequestMethod.PUT,
             consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     public Staff updateStaff(@RequestBody Staff staff) {
         return this.staffService.updateStaff(staff);
     }
     @RequestMapping(value = "/all", method = RequestMethod.DELETE)
     public void deleteAllStaff() {
         this.staffService.deleteAllStaff();
     }
     @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
     public void deleteStaffById(@PathVariable int id) {
         this.staffService.deleteStaffById(id);
     }
}
