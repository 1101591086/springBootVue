package org.sang.bean;

import java.io.Serializable;
/**
 * 菜单权限
 * @author Administrator
 *
 */
public class MenuMeta implements Serializable {

    private boolean keepAlive; //菜单切换时是否保活
    private boolean requireAuth; //是否登录后才能访问

    public boolean isKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public boolean isRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
}
