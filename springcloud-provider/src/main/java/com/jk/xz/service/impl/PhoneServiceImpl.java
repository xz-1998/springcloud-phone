package com.jk.xz.service.impl;

import com.jk.xz.dao.PhoneDao;
import com.jk.xz.pojo.PhoneBean;
import com.jk.xz.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {
@Autowired
    private PhoneDao phoneDao;
    //查询
    @Override
    public  HashMap<String,Object> queryPhone(PhoneBean phone) {
        Integer count=phoneDao.getCount(phone);
        Integer start=(phone.getPage()-1)*phone.getRows();
        List<PhoneBean> list=phoneDao.queryPhone(start,phone.getRows(),phone);
        HashMap<String,Object> map=new HashMap<>();
        map.put("total",count);
        map.put("rows",list);
        return map;
    }
    //新增+修改
    @Override
    public void addOrUp(PhoneBean phone) {
            if (phone.getId()==null){
                phoneDao.add(phone);
            }
            else{
                phoneDao.up(phone);
            }
    }
    //删除
    @Override
    public void delAll(String[] ids) {
              phoneDao.delAll(ids);
    }
   //回显
    @Override
    public PhoneBean byId(Integer id) {
        return phoneDao.byId(id);
    }
}
