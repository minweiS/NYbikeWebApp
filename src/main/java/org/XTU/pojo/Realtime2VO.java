package org.XTU.pojo;

import java.util.List;

public class Realtime2VO {
    private List<Integer> xData;
    private List<Integer> yData;

    public Realtime2VO() {
    }

    public Realtime2VO(List<Integer> xData, List<Integer> yData) {
        this.xData = xData;
        this.yData = yData;
    }

    public List<Integer> getxData() {
        return xData;
    }

    public void setxData(List<Integer> xData) {
        this.xData = xData;
    }

    public List<Integer> getyData() {
        return yData;
    }

    public void setyData(List<Integer> yData) {
        this.yData = yData;
    }

    @Override
    public String toString() {
        return "Realtime2VO{" +
                "xData=" + xData +
                ", yData=" + yData +
                '}';
    }
}
