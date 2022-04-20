package org.sang.bean;

import java.io.Serializable;

/**
 * 角色
 */
public class Role implements Serializable {
    private Long id; //主键
    private String name; //角色名称
    private String nameZh; //角色中文名

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
