package com.jk.dao;

import com.jk.pojo.MenuTree;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MenuTreeMapper {

    List<MenuTree> queryMenusByPid(int pid);
}