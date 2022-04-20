package org.sang.common;

import org.sang.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * 获取登录HR
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
