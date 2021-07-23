package org.XTU.dao;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

/**
 * 实时数据的持久层类
 */
public class Realtime2Dao {
    public List<Entity> listRealtime2(String sid){
        String sql="select num_docks_available,num_bikes_available from t_status where station_id=?";
        List<Entity> list=null;
        try {
            list=Db.use().query(sql,sid);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }
}


