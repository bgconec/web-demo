package org.fottchen.service;

import org.fottchen.po.Goods;

public interface GoodsService {

	void updateTwice(Goods goods);
	
	Integer insert(Goods goods);
	
	void update(Goods goods);
	
}
