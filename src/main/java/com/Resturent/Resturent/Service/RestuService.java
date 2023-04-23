package com.Resturent.Resturent.Service;


import com.Resturent.Resturent.Model.RestuDetails;
import com.Resturent.Resturent.Repository.RestuDau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RestuService {

    @Autowired
    RestuDau restudau;

    public String addRestuDetails(RestuDetails details){

        boolean status = restudau.allDetails(details);
        if(status){
            return "Resturent details added ....!!!";
        }
        else{
            return "Resturent details not added....!!!";
        }
    }
    public ArrayList<RestuDetails> allResturentdetail(){
        return RestuDau.rrrr();
    }
    public static RestuDetails getObjByID(int id){
        ArrayList<RestuDetails>alllist=RestuDau.rrrr();
        RestuDetails objects=null;
        for(RestuDetails objlist:alllist) {
            if (objlist.getId() == id) {
                objects = objlist;
                break;
            }
        }
        return objects;
    }
    public static String updateSpeciality(int id, String speciality){
        ArrayList<RestuDetails>alllist=RestuDau.rrrr();
        for(RestuDetails objlist:alllist) {
            if (objlist.getId() == id) {
                objlist.setSpeciality(speciality);
                return "resturent Speciality updated....!!";
            }
        }
        return "resturent Speciality not updated....!!";
    }
    public static String deleteDetails(int id){
    ArrayList<RestuDetails>alllist=RestuDau.rrrr();
    for(RestuDetails objlist:alllist)

    {
        if (objlist.getId() == id) {
            alllist.remove(objlist);
            return "resturent id deleted....!!";
        }
       }
    return "resturent id not deleted....!!";
   }
}
