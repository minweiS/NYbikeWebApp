package org.XTU.pojo;

public class StationHeat {
    private int station_id;
    private int heat;

    public StationHeat() {
    }

    public StationHeat(int station_id, int heat) {
        this.station_id = station_id;
        this.heat = heat;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }
}
