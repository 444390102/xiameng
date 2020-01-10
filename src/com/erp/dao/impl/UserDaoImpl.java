package dao.impl;

import dao.BaseDao;
import dao.UserDao;
import pojo.User;

import java.sql.SQLException;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUser(User user) {
        String sql = "select * from blp_user where u_acc = ? and u_pwd = ?";
        executeQuery(sql,user.getAcc(),user.getPwd());
        try {
            if (rs.next()){
                User findUser = new User();
                findUser.setPwd(rs.getString("u_pwd"));
                findUser.setAcc(rs.getString("u_acc"));
                findUser.setId(rs.getInt("u_id"));
                findUser.setArea(rs.getInt("u_area"));
                findUser.setRoleId(rs.getInt("r_id"));
                return findUser;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return null;
    }
}
