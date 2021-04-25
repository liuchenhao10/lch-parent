package com.lch.commodityfirst.dao;

import com.lch.commodityfirst.entity.Commodity;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品数据层
 * @author LiuChenHao
 * @version Test
 * @createDate 2021/4/25 22:35
 */
@Mapper
@Repository
public interface CommodityFirstMapper {
    /**
     * 添加一件商品
     * @param commodity 商品实体类
     * @return 1成功 0失败
     */
    int addOneCommodity(Commodity commodity);

    /**
     * 根据主键id删除一件商品
     * @param id 主键
     * @return 1成功 0失败
     */
    int deleteOneCommodityById(Integer id);

    /**
     * 根据id修改一件商品
     * @param commodity 商品实体类
     * @return 1成功 0失败
     */
    int updateCommodityById(Commodity commodity);

    List<Commodity> getCommodityAll();


}
