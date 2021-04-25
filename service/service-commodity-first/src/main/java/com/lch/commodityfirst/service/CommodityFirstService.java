package com.lch.commodityfirst.service;

import com.lch.commodityfirst.dao.CommodityFirstMapper;
import com.lch.commodityfirst.entity.Commodity;
import com.lch.commonbaseutils.uuid.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 商品逻辑层
 * @author LiuChenHao
 * @version Test
 * @createDate 2021/4/23 23:21
 */
@Service
public class CommodityFirstService {
    @Autowired
    private CommodityFirstMapper Mapper;

    public int addCommodity()
    {
        Commodity commodity1=new Commodity();
        commodity1.setId(UUIDUtils.getUUID());
        commodity1.setCommodityMessage("外星人Alienware m15 R3 15.6英寸轻薄游戏本电脑(i7 16G 512GSSD GTX1660Ti 6G独显 144Hz)5726白");
        commodity1.setCommodityMoney(new BigDecimal("11199"));
        commodity1.setCommodityImg("https://img14.360buyimg.com/n0/jfs/t1/165003/40/14662/139134/606411e9E36a22184/211d5993e4af1221.jpg");
        commodity1.setCommoditySellNumber(17799);
        commodity1.setCommodityHistory(new Date());
        commodity1.setCommodityType("电脑");
        Mapper.addOneCommodity(commodity1);
        return 0;
    }

    public List<Commodity> getCommodityAll(){
        return Mapper.getCommodityAll();
    }

}
