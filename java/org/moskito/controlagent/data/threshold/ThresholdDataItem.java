package org.moskito.controlagent.data.threshold;

import net.anotheria.moskito.core.threshold.ThresholdStatus;

/**
 * Contains single threshold data.
 *
 * @author: Vladyslav Bezuhlyi
 */
public class ThresholdDataItem {

    private String name;

    private ThresholdStatus status;

    private String lastValue;

    private long statusChangeTimestamp;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStatus(ThresholdStatus status) {
        this.status = status;
    }

    public ThresholdStatus getStatus() {
        return status;
    }

    public void setLastValue(String lastValue) {
        this.lastValue = lastValue;
    }

    public String getLastValue() {
        return lastValue;
    }

    public void setStatusChangeTimestamp(long statusChangeTimestamp) {
        this.statusChangeTimestamp = statusChangeTimestamp;
    }

    public long getStatusChangeTimestamp() {
        return statusChangeTimestamp;
    }

}
