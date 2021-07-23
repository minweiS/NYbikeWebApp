package org.XTU.pojo;

import java.util.List;

public class HotStation {


    private List<String> xData;
    private List<Integer> yData;
    public HotStation() {
    }

    public HotStation(List<String> xData, List<Integer> yData) {
        this.xData = xData;
        this.yData = yData;
    }

    public List<String> getxData() {
        return xData;
    }

    public void setxData(List<String> xData) {
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
        return "HotStation{" +
                "xData=" + xData +
                ", yData=" + yData +
                '}';
    }
}
