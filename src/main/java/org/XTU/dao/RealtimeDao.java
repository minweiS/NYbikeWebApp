package org.XTU.dao;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

/**
 *实时数据的持久层类
 * 访问实时数据
 * 查询：
 *      查一条 getXXXByxxx  getUserById
 *      查多条 listXXXByxxx
 */


public class RealtimeDao {
    /**
     * 基于站点id 查询指定周期内站点可用车的数量
     * @param sid 站点id
     * @param hour 自当前时间向前多少个小时
     * @return
     */
//    public List<Entity> listNbaBySid(String sid,int hour){
//        String sql = "select " +
//                "station_id, num_bikes_available, created_time from " +
//                "t_status " +
//                "where " +
//                "station_id=? and created_time > DATE_SUB(NOW(),INTERVAL  ? HOUR);";
//
//        List<Entity> list = null;
//        try {
//            list = Db.use().query(sql,sid,hour);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return list;
//    }

    /**
     * 有站点加在一起，周X的第Y个小时有多少人借车。
     * @param day 星期数
     * @param hour 第几个小时起
     * @return
     */
//    public List<Entity> listNbaByDay(int day,int hour){
//        String sql = "select count(*) FROM t_trip_202006 where" +
//                " dayofweek(STR_TO_DATE(SUBSTRING(starttime FROM 1 FOR 10) , '%Y-%m-%d'))=? " +
//                "and SUBSTRING(starttime FROM 12 FOR 2)=? ;";
//        List<Entity> list = null;
//        try {
//            list = Db.use().query(sql,day,hour);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return list;
//    }
    /**********************/
    public List<Entity> listHotStation(String date,int time){
//        String sql = "select stationid,outtime from t_outheatMap where date = '2020-06-?' and time =?;";
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
