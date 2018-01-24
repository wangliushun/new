package com.jk.pojo;

import java.io.Serializable;
import java.util.List;

public class MenuTree implements Serializable{
    private Integer id;

    private String text;

    private Integer pid;

    private String href;
    private List<MenuTree> nodes;

    public List<MenuTree> getNodes() {
        return nodes;
    }

    public void setNodes(List<MenuTree> nodes) {
        this.nodes = nodes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }
}