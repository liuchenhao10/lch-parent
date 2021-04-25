package com.lch.commonbaseutils.money;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 金钱保留俩位小数的工具类
 * @author LiuChenHao
 * @version Test
 * @createDate 2021/4/25 19:03
 */
public class BigDecimalUtils {
    public static BigDecimal getBigDecimal(BigDecimal money){
        BigDecimal bigDecimal=money.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal;
    }
}
