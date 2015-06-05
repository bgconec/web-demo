package org.fottchen.dao.impl;

import org.fottchen.dao.GoodsDao;
import org.fottchen.po.Goods;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class GoodsDaoImpl extends SqlMapClientDaoSupport implements GoodsDao {

	@Override
	public Integer insert(Goods goods) {
		return (Integer) this.getSqlMapClientTemplate()
				.insert("org.fottchen.po.Goods.insert", goods);
	}

	@Override
	public void update(Goods goods) {
		this.getSqlMapClientTemplate()
			.update("org.fottchen.po.Goods.update", goods);
	}
	
}
