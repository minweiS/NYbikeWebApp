package org.XTU.service;

import cn.hutool.db.Entity;
import org.XTU.dao.RealtimeDao;
import org.XTU.dao.Xuqiu2Dao;
import org.XTU.pojo.StationNbaVO;
import org.XTU.pojo.Xuqiu2VO;

import java.util.ArrayList;
import java.util.List;

public class Xuqiu2Sevice {
    private Xuqiu2Dao dao=new Xuqiu2Dao();
    public Xuqiu2VO findXuqiu2(String sid){
        List<Entity> list=dao.listXuqiu2(sid);
        List<Integer> xData=new ArrayList<>();
        List<Integer> yData=new ArrayList<>();
        for(Entity entity:list){
            xData.add(entity.getInt("gender"));
            yData.add(entity.getInt("count(*)"));
        }
        Xuqiu2VO vo=new Xuqiu2VO(xData,yData);
        return vo;

    }
}
