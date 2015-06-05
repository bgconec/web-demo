package org.fottchen.service.impl;

import org.fottchen.dao.GoodsDao;
import org.fottchen.po.Goods;
import org.fottchen.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;

public class GoodsServiceImpl implements GoodsService {

	@Autowired private GoodsDao goodsDao;
	
	@Override
	public void updateTwice(Goods goods) {
		goods.setName("FirstUpdate");
		update(goods);
		goods.setName("SecondUpdate");
		update(goods);
	}
	
	

	@Override
	public Integer insert(Goods goods) {
		return goodsDao.insert(goods);
	}

	@Override
	public void update(Goods goods) {
		if( "SecondUpdate".equals(goods.getName())) {
			goods = null;
		}
		goodsDao.update(goods);
	}
	
}
