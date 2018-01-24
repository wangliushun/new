package com.jk.service;

import com.jk.pojo.MenuTree;

import java.util.List;

public interface MenuTreeService {
    List<MenuTree> queryMenuTree(int pid);
}
