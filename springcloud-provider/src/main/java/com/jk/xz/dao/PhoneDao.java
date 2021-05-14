package com.jk.xz.dao;

import com.jk.xz.pojo.PhoneBean;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PhoneDao {
    Integer getCount(@Param("phone")PhoneBean phone);

    List<PhoneBean> queryPhone(@Param("start") Integer start,@Param("rows") Integer rows,@Param("phone") PhoneBean phone);
    @Insert("insert into t_phone(name,type,size,date,price) values(#{name},#{type},#{size},#{date},#{price})")
    void add(PhoneBean phone);
    @Update("update t_phone set name=#{name},type=#{type},size=#{size},date=#{date},price=#{price} where id=#{id}")
    void up(PhoneBean phone);

    void delAll(@Param("ids") String[] ids);
    @Select("select * from t_phone where id=#{id}")
    PhoneBean byId(Integer id);
}
