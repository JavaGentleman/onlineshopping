package com.yyr.modules.user.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: yyr
 * @Date: 2019/5/22 19:37
 */
@Data
@ToString
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String image;
    /**
     * 0-女；1-男
     */
    private Integer sex;
    /**
     * 0-管理员；1-普通用户
     */
    private Integer type;
    private String email;
    /**
     * 0-正常；1-注销
     */
    private Integer status;

}
