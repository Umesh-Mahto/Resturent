package com.Resturent.Resturent.Controller;


import com.Resturent.Resturent.Model.RestuDetails;
import com.Resturent.Resturent.Service.RestuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RestuController {

    @Autowired
    RestuService restuService;


    @PostMapping(value="/add")
    public  String AddResturent(@RequestBody RestuDetails details){

        return restuService.addRestuDetails(details);

    }
    @GetMapping("/showDetails")
    public ArrayList<RestuDetails>allResturent(){
        return restuService.allResturentdetail();
    }
    @GetMapping("/getById/{id}")
    public RestuDetails getId1(@PathVariable int id){
        return RestuService.getObjByID(id);
    }

    @PutMapping("/update/{id}/{speciality}")
    public String updateResturent(@PathVariable int id,@PathVariable String speciality){
        return RestuService.updateSpeciality(id,speciality);

    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return RestuService.deleteDetails(id);
    }
}
