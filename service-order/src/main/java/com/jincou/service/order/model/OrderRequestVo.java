package com.jincou.service.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * OrderRequestVo
 *
 * @Auther: renyajian
 * @Date: 2019/10/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestVo<T> implements Serializable{

    private String method;

    private T param;
}
