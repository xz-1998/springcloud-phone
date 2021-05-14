package com.jk.xz.service;

import com.jk.xz.pojo.PhoneBean;

import java.util.HashMap;

public interface PhoneService {
    HashMap<String,Object> queryPhone(PhoneBean phone);

    void addOrUp(PhoneBean phone);

    void delAll(String[] ids);

    PhoneBean byId(Integer id);
}
