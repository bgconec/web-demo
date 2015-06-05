package org.fottchen.po;

/**
 * 货品
 *
 * @author RUIZ
 */
public class Goods {

    private final int id;

    private final String name;

    public Goods(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 货品ID
     * 
     * @return
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
