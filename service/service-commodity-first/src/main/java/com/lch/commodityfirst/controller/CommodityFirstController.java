package com.lch.commodityfirst.controller;

import com.lch.commodityfirst.entity.Commodity;
import com.lch.commodityfirst.service.CommodityFirstService;
import com.lch.commonbaseutils.api.APICODE;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections4.Get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品表现层
 * @author LiuChenHao
 * @version Test
 * @createDate 2021/4/23 22:30
 */
@Api(tags = "商品模块表现层")
@RestController
@RequestMapping("/retailer/commodity")
@CrossOrigin
public class CommodityFirstController {
    @Autowired
    private CommodityFirstService commodityFirstService;

    @PutMapping("add")
    public APICODE add(Commodity commodity)
    {
        commodityFirstService.addCommodity();
        return APICODE.OK().message("添加成功");
    }

    @GetMapping("first")
    public APICODE getCommodityAll()
    {
        List<Commodity> commodityAll = commodityFirstService.getCommodityAll();
        return APICODE.OK().data("items",commodityAll);
    }
}
