package com.example.first.mapper;

import com.example.first.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> listAll();
}
