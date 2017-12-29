
package com.parasol.core.bid;

import java.io.Serializable;

public class TenderBid implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Bid_order bidOrder;

    private String projectName;

    public Bid_order getBidOrder() {
        return bidOrder;
    }

    public void setBidOrder(Bid_order bidOrder) {
        this.bidOrder = bidOrder;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
