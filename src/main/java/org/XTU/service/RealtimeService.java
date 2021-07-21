package org.XTU.service;

import cn.hutool.db.Entity;
import org.XTU.dao.RealtimeDao;
import org.XTU.pojo.HotStation;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class RealtimeService {
    private RealtimeDao dao = new RealtimeDao();

//    public StationNbaVO findNbaBySid(String sid, int hour) {
//        //1.调用持久层方法查数据
//        List<Entity> list = dao.listNbaBySid(sid, hour);
//        //2.声明封装数据的容器
//        List<String> StationID = new ArrayList<>();
//        List<Integer> OutTime = new ArrayList<>();
//        //3.遍历结果，封装数据
//        for (Entity entity : list) {
//            StationID.add(entity.getStr("created_time"));
//            OutTime.add(entity.getInt("num_bikes_available"));
//        }
//        StationNbaVO vo = new StationNbaVO(StationID, OutTime);
//        //4.返回封装数据
//        return vo;
//    }
//
//    /*************************************************************/
//    public AllLiveBike findLiveByDayAndHour(int day, int hour) {
//        //1.调用持久层方法查数据
//        List<Entity> list = dao.listNbaByDay(day, hour);
//        //2.声明封装数据的容器
//        List<Integer> StationID = new ArrayList<>();
//        List<Integer> OutTime = new ArrayList<>();
//        //3.遍历结果，封装数据
//        for (Entity entity : list) {
//            StationID.add(entity.getInt("live_day"));
//            OutTime.add(entity.getInt("hour"));
//        }
//        AllLiveBike alb = new AllLiveBike(StationID, OutTime);
//        //4.返回封装数据
//        return alb;
//    }

    /**********************************************/
    public HotStation findHotStation(String date, int hour) {
        //1.调用持久层方法查数据
        List<Entity> list = dao.listHotStation(date, hour);
        //2.声明封装数据的容器
        List<String> StationID = new ArrayList<>();
        List<Integer> OutTime = new ArrayList<>();
        //3.遍历结果，封装数据
        for (Entity entity : list) {
            StationID.add(entity.getStr("stationid"));
            OutTime.add(entity.getInt("outtime"));
        }
        HotStation hs = new HotStation(StationID, OutTime);
        //4.返回封装数据
        return hs;
    }
}