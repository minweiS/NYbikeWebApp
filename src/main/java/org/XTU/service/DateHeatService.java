package org.XTU.service;

import cn.hutool.db.Entity;
import org.XTU.dao.DataHeatDao;
import org.XTU.pojo.StationHeat;

import java.util.ArrayList;
import java.util.List;

public class DateHeatService {
    private DataHeatDao dao = new DataHeatDao();
    public List<StationHeat> getStationsHeat(String date,int time){
        //1、调用dao层方法查数据
        List<Entity> list = dao.listStaionsHeatByDateandTime(date,time);
        //2、封装数据
        List<StationHeat> stationsheat = new ArrayList<>();
        for(Entity entity : list){
            StationHeat stationHeat = new StationHeat();
            stationHeat.setStation_id(entity.getInt("stationid"));
            stationHeat.setHeat(entity.getInt("outtime"));
            stationsheat.add(stationHeat);
        }
        //3、返回封装数据
       return stationsheat;
    }
}
