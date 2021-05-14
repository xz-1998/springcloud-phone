package com.jk.xz.controller;

import com.jk.xz.pojo.PhoneBean;
import com.jk.xz.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("phone")
public class PhoneController {
    @Autowired
    PhoneService phoneService;
    //查询
    @RequestMapping("queryPhone")
    public HashMap<String,Object> queryPhone(PhoneBean phoneBean){
        return phoneService.queryPhone(phoneBean);
    }
    //新增+修改
    @RequestMapping("addOrUp")
    public void addOrUp(PhoneBean phoneBean){
      phoneService.addOrUp(phoneBean);
    }
    //回显
    @RequestMapping("byId")
    public PhoneBean byId(@RequestParam Integer id){
        return phoneService.byId(id);
    }
    //删除
    @RequestMapping("delAll")
    public void delAll(@RequestParam String ids){
         phoneService.delAll(ids);
    }
}
