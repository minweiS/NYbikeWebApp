package org.XTU.pojo;

import java.util.List;

public class HotStation {


    private List<String> StationID;
    private List<Integer> OutTime;
    public HotStation() {
    }

    public HotStation(List<String> StationID, List<Integer> OutTime) {
        this.StationID = StationID;
        this.OutTime = OutTime;
    }

    public List<String> getStationID() {
        return StationID;
    }

    public void setStationID(List<String> StationID) {
        this.StationID = StationID;
    }

    public List<Integer> getOutTime() {
        return OutTime;
    }

    public void setOutTime(List<Integer> OutTime) {
        this.OutTime = OutTime;
    }

    @Override
    public String toString() {
        return "HotStation{" +
                "StationID=" + StationID +
                ", OutTime=" + OutTime +
                '}';
    }
}
