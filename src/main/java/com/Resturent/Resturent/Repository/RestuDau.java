package com.Resturent.Resturent.Repository;

import com.Resturent.Resturent.Model.RestuDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RestuDau {

    static ArrayList<RestuDetails> list=new ArrayList<>();


    public boolean allDetails(RestuDetails details){

        list.add(details);
        return true;
    }
    public static ArrayList<RestuDetails> rrrr(){
        return list;
    }
}
