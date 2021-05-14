package com.jk.xz.controller;

import com.jk.xz.pojo.PhoneBean;
import com.jk.xz.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("phone")
public class PhoneController {
    @Autowired
   private PhoneService phoneService;
    /*
    * @Author: xz
    * @Description: 查询
    * @Date: 2021/5/13 19:52
    * @Param:[phone]
    * @Return: java.util.HashMap
    **/
    @RequestMapping("queryPhone")
    public HashMap<String,Object> queryPhone(@RequestBody PhoneBean phone ){
    return phoneService.queryPhone(phone);
    }
    /*
    * @Author: xz
    * @Description: 新增+修改
    * @Date: 2021/5/13 19:53
    * @Param:[phone]
    * @Return: void
    **/
    @RequestMapping("addOrUp")
    public void addOrUp(@RequestBody PhoneBean phone){
        phoneService.addOrUp(phone);
    }
    /*
    * @Author: xz
    * @Description: 删除
    * @Date: 2021/5/13 19:53
    * @Param:
    * @Return:
    **/
    @RequestMapping("delAll")
    public void delAll(String[] ids){
        phoneService.delAll(ids);
    }
    /*
    * @Author: xz
    * @Description: 回显
    * @Date: 2021/5/13 19:54
    * @Param:[id]
    * @Return: com.jk.xz.pojo.PhoneBean
    **/
    @RequestMapping("byId")
    public PhoneBean byId(Integer id){
       return phoneService.byId(id);
    }
}
