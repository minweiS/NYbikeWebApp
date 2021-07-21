package org.XTU.dao;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;
/**
 * 实时数据的持久层类
 * 访问实时数据
 *查询：
 * 查一条 getXXXByXXX getUserById
 * 查多条 ListXXXByXXX
 */
public class Dao {
    /**
     * 基于站点id查询指定时间段内站点出站热度和入站热度
     * @param sid 站点id
     * @param hour 自当前时间向前多少小时
     * @return
     */
    public List<Entity> listNbaBySid(String sid, int hour){
        String sql = "select station_id, num_bikes_available, created_time "
                //  ? 是占位符， 表示该位置是一个参数
                +"from t_status where station_id=? and created_time > DATE_SUB(NOW(),INTERVAL ? HOUR);";
        //使用HuTool执行查询
        //query 第一个参数是传入语句，后面是需要替换的参数
        List<Entity> list = null;
        try {
            list = Db.use().query(sql,sid,hour); //接受查询结果
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
