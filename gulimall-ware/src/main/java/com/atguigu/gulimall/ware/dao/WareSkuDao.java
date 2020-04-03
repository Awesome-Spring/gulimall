package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author jiangtao
 * @email jtjava@163.com
 * @date 2020-04-03 14:53:43
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
