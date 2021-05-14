package com.jk.xz.service;

import com.jk.xz.pojo.PhoneBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
@Component
public class PhoneServiceHystrix implements PhoneService {
    @Override
    public HashMap<String, Object> queryPhone(PhoneBean phoneBean) {
        System.out.println("======error");
        HashMap<String, Object> map=new HashMap<String, Object>();
        map.put("total",0);
        map.put("rows",0);
        return map;
    }

    @Override
    public void addOrUp(PhoneBean phoneBean) {
        System.out.println("======error");
    }

    @Override
    public PhoneBean byId(Integer id) {
        System.out.println("======error");
        return null;
    }

    @Override
    public void delAll(String ids) {
        System.out.println("======error");
    }
}
