package com.lch.commodityfirst.entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品实体类
 * @author LiuChenHao
 * @version Test
 * @createDate 2021/4/23 22:35
 */
@Setter
@Getter
@ToString
public class Commodity implements Serializable {
    // 商品主键
    private String id;
    // 商品类型
    private String commodityType;
    // 商品描述
    private String commodityMessage;
    // 商品销量
    private Integer commoditySellNumber;
    // 商品价格
    private BigDecimal commodityMoney;
    // 商品优惠
    private BigDecimal commodityDiscount;
    // 商品图片
    private String commodityImg;
    // 商品历史
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss",iso = DateTimeFormat.ISO.DATE_TIME)
    private Date commodityHistory;
    // 所属商家
    private String commodityMaster;
}
