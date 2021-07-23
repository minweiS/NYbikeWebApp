package org.XTU.service;

import cn.hutool.db.Entity;
import org.XTU.dao.RealtimeDao;
import org.XTU.pojo.AllLiveBike;
import org.XTU.pojo.HotStation;
import org.XTU.pojo.StationNbaVO;
import org.XTU.pojo.TopTen;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class RealtimeService {
    private RealtimeDao dao = new RealtimeDao();

    public StationNbaVO findNbaBySid(String sid, int hour) {
        //1.调用持久层方法查数据
        List<Entity> list = dao.listNbaBySid(sid, hour);
        //2.声明封装数据的容器
        List<String> xData = new ArrayList<>();
        List<Integer> yData = new ArrayList<>();
        //3.遍历结果，封装数据
        for (Entity entity : list) {
            xData.add(entity.getStr("created_time"));
            yData.add(entity.getInt("num_bikes_available"));
        }
        StationNbaVO vo = new StationNbaVO(xData, yData);
        //4.返回封装数据
        return vo;
    }

    /*************************************************************/
    public AllLiveBike findLiveByDayAndHour(int day, int hour) {
        //1.调用持久层方法查数据
        List<Entity> list = dao.listNbaByDay(day, hour);
        //2.声明封装数据的容器
        List<Integer> xData = new ArrayList<>();
        List<Integer> yData = new ArrayList<>();
        //3.遍历结果，封装数据
        for (Entity entity : list) {
            xData.add(entity.getInt("live_day"));
            yData.add(entity.getInt("hour"));
        }
        AllLiveBike alb = new AllLiveBike(xData, yData);
        //4.返回封装数据
        return alb;
    }

    /**********************************************/
    public HotStation findHotStation(String date, int hour) {
        //1.调用持久层方法查数据
        List<Entity> list = dao.listHotStation(date, hour);
        //2.声明封装数据的容器
        List<String> xData = new ArrayList<>();
        List<Integer> yData = new ArrayList<>();
        //3.遍历结果，封装数据
        for (Entity entity : list) {
            xData.add(entity.getStr("stationid"));
            yData.add(entity.getInt("outtime"));
        }
        HotStation hs = new HotStation(xData, yData);
        //4.返回封装数据
        return hs;
    }

    /**
     *
     * @param week
     * @param hour
     * @return
     */
    public TopTen findTopten(int week,int hour){
        //1.调用持久层方法查数据
        List<Entity> list = dao.listTopTen(week, hour);
        //2.声明封装数据的容器
        List<Integer> xData = new ArrayList<>();
        List<Integer> yData = new ArrayList<>();
        //3.遍历结果，封装数据
        for (Entity entity : list) {
            xData.add(entity.getInt("start_station_id"));
            yData.add(entity.getInt("count(*)"));
        }
        TopTen tt = new TopTen(xData, yData);
        //4.返回封装数据
        return tt;
    }
}