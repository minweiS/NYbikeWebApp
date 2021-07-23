package cn.tedu.pojo;

import java.util.List;

public class Xuqiu2VO {
    private List<Integer> xData;
    private List<Integer> yData;

    public Xuqiu2VO() {
    }

    public Xuqiu2VO(List<Integer> xData, List<Integer> yData) {
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
        return "Xuqiu2VO{" +
                "xData=" + xData +
                ", yData=" + yData +
                '}';
    }
}