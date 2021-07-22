package org.XTU.dao;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

public class DataHeatDao {
    /**
     * 通过传入日期和时间段向服务器请求站点id和热度的对应表
     * @param date 日期
     * @param time 时间段
     * @return 站点id和热度的对应的列表
     */
    public List<Entity> listStaionsHeatByDateandTime(String date, int time){
        String sql = "select stationid,outtime from t_outheatMap where date =? and time =?;";
        List<Entity> list = null;
        try {
            list = Db.use().query(sql,date,time);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
