package org.XTU.dao;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

/**
 * 实时数据的持久层类
 */
public class Realtime1Dao {
    public List<Entity> listRealtime1(){
        String sql="select station_id,num_bikes_available+num_ebikes_available " +
                "from t_status " +
                "group by station_id " +
                "order by num_bikes_available+num_ebikes_available desc limit 5;";
        List<Entity> list=null;
        try {
            list=Db.use().query(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }
}


