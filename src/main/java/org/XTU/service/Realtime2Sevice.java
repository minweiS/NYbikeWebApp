package org.XTU.service;

import cn.hutool.db.Entity;
import org.XTU.dao.Realtime1Dao;
import org.XTU.dao.Realtime2Dao;
import org.XTU.dao.RealtimeDao;
import org.XTU.pojo.Realtime1VO;
import org.XTU.pojo.Realtime2VO;
import org.XTU.pojo.StationNbaVO;

import java.util.ArrayList;
import java.util.List;

public class Realtime2Sevice {
    private Realtime2Dao dao=new Realtime2Dao();
    public Realtime2VO findRealtime2(String sid){
        List<Entity> list=dao.listRealtime2(sid);
        List<Integer> xData=new ArrayList<>();
        List<Integer> yData=new ArrayList<>();
        for(Entity entity:list){
            xData.add(entity.getInt("num_docks_available"));
            yData.add(entity.getInt("num_bikes_available"));
        }
        Realtime2VO vo=new Realtime2VO(xData,yData);
        return vo;
    }
}
