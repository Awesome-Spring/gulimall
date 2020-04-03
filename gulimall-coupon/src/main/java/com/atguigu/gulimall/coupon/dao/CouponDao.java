package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jiangtao
 * @email jtjava@163.com
 * @date 2020-04-03 15:04:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
