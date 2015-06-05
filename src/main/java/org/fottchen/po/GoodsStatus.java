package org.fottchen.po;

/**
 * 货品状态
 *
 * @author RUIZ
 */
public class GoodsStatus {

    private final int totalPeriods;

    private final boolean offSell;

    private final Goods goods;

    /**
     * 货品状态
     * 
     * @param totalPeriods
     * @param offSell
     * @param goods
     */
    public GoodsStatus(int totalPeriods, boolean offSell, Goods goods) {
        this.totalPeriods = totalPeriods;
        this.offSell = offSell;
        this.goods = goods;
    }

    public int getId() {
        return goods.getId();
    }

    /**
     * 总期数
     * 
     * @return
     */
    public int getTotalPeriods() {
        return totalPeriods;
    }

    /**
     * 是否已下架
     * 
     * @return
     */
    public boolean isOffSell() {
        return offSell;
    }

    /**
     * 货品信息
     * 
     * @return
     */
    public Goods getGoods() {
        return goods;
    }

}
