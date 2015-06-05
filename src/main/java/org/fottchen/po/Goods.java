package org.fottchen.po;

/**
 * 货品
 *
 * @author RUIZ
 */
public class Goods {

    private int id;

    private String name;

    public Goods(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Goods() {
		super();
	}

	/**
     * 货品ID
     * 
     * @return
     */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
