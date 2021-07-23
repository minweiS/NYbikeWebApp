package org.XTU.service;

import cn.hutool.db.Entity;
import org.XTU.dao.Realtime1Dao;
import org.XTU.dao.RealtimeDao;
import org.XTU.pojo.Realtime1VO;
import org.XTU.pojo.StationNbaVO;

import java.util.ArrayList;
import java.util.List;

public class Realtime1Sevice {
    private Realtime1Dao dao=new Realtime1Dao();
    public Realtime1VO findRealtime1(){
        List<Entity> list=dao.listRealtime1();
        List<String> xData=new ArrayList<>();
        List<Integer> yData=new ArrayList<>();
        for(Entity entity:list){
            xData.add(entity.getStr("station_id"));
            yData.add(entity.getInt("num_bikes_available+num_ebikes_available"));
        }
        Realtime1VO vo=new Realtime1VO(xData,yData);
        return vo;

    }
}
