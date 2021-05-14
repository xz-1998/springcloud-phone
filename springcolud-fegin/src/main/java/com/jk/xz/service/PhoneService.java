package com.jk.xz.service;

import com.jk.xz.pojo.PhoneBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
@FeignClient(value = "provider",fallback = PhoneServiceHystrix.class)
public interface PhoneService {
    @RequestMapping("phone/queryPhone")
    HashMap<String, Object> queryPhone(PhoneBean phoneBean);
    @RequestMapping("phone/addOrUp")
    void addOrUp(PhoneBean phoneBean);
    @RequestMapping("phone/byId")
    PhoneBean byId(@RequestParam Integer id);
    @RequestMapping("phone/delAll")
    void delAll(@RequestParam String ids);
}
