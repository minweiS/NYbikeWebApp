package org.XTU.dao;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

/**
 * 实时数据的持久层类
 */
public class Xuqiu2Dao {
    public List<Entity> listXuqiu2(String sid){
        String sql="select gender,count(*) from t_trip_202006 where start_station_id=? group by gender;";
        List<Entity> list=null;
        try {
            list=Db.use().query(sql,sid);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }
}