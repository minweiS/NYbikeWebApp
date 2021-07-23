package cn.tedu.service;

import cn.hutool.db.Entity;
import cn.tedu.dao.RealtimeDao;
import cn.tedu.dao.Xuqiu2Dao;
import cn.tedu.pojo.StationNbaVO;
import cn.tedu.pojo.Xuqiu2VO;

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
