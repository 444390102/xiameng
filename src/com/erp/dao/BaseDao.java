package dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao {
	protected final static String URL
			= "jdbc:mysql://39.99.163.64:3306/blp?useUnicode=true&characterEncoding=utf-8&useSSL=false&zeroDateTimeBehavior=convertToNull";
	protected final static String UID = "root";
	protected final static String PWD = "123456";
	protected final static String DRIVER = "com.mysql.jdbc.Driver";
	//提供的链接操作
	protected Connection conn;
	//提供的传令官
	protected PreparedStatement ps;
	//结果集的指向
	protected ResultSet rs;


	/**
	 * 查询所有信息
	 * @param sql SQL语句
	 * @param params 参数数组
	 * @return 查询结果
	 */
	public List<Map<String, Object>> executeQueryMap(String sql, Object... params)  {
		ResultSetMetaData dmd = null; //数据表信息查询对象
		//返回结果集
		List resluts = new ArrayList();
		try {
			openConn();
			//建立发送sql语句对象
			ps = conn.prepareStatement(sql);
			//添加参数
			if (params != null) {
				int i = 1;
				for (Object param : params) {
					if (param == null) {
						ps.setString(i, null);
					} else {
						ps.setObject(i, param);
					}
					i++;
				}
			}
			//查询并且返回结果
			rs = ps.executeQuery();
			//建立读取返回列信息对象
			dmd = rs.getMetaData();
			//存放所有列信息
			List<String> columnNames = new ArrayList<>();
			List<Integer> columnTypes = new ArrayList<>();
			int colCount = dmd.getColumnCount();
			for (int i = 1; i <= colCount; i++) {
				columnNames.add(dmd.getColumnName(i));
				columnTypes.add(dmd.getColumnType(i));
			}
			//循环所有记录
			while(rs.next()){
				//用来存储一条临时记录
				Map data = new HashMap<String,Object>();
				//循环所有列，将数据库中的数据存放到临时数据中
				int i = 0;
				for (String colName : columnNames) {
					try {
						data.put(colName, rs.getObject(colName));
						//data.put(i, rs.getObject(colName));
						i++;
					} catch(Exception e){
						e.printStackTrace();
					}
				}
				//将临时数据添加到返回列表中
				resluts.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll();
		}
		//返回查询列表
		return resluts;
	}

	/**
	 * 提供公共的查询方法
	 * @param sql 要执行的sql语句
	 * @param params 传入的参数
	 */
	protected void executeQuery(String sql,Object... params) {
		openConn();
		try {
			ps = conn.prepareStatement(sql);
			//填写参数
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					Object param = params[i];//拿出某一个参数
					if (param == null) {
						ps.setString(i + 1, null);
					} else {
						ps.setObject(i + 1, param);
					}
				}
			}
			this.rs =  ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	/**
	 * 公共的 增删改
	 * @param sql	要执行的语句
	 * @param params	填入的参数
	 * @return	受到影响的行数
	 */
	protected int executeUpdate(String sql,Object... params) {
		openConn();
		try {
			ps = conn.prepareStatement(sql);
			//填写参数
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					Object param = params[i];//拿出某一个参数
					if (param == null) {
						ps.setString(i + 1, null);
					} else {
						ps.setObject(i + 1, param);
					}
				}
			}
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return 0;//代表执行失败
	}

	/**
	 * 返回单行单列的功能
	 * @param sql	要查询的SQL语句
	 * @param params 填写的参数
	 * @return 查询的单行单列的结果
	 */
	public Object executeOne(String sql,Object... params) {
		openConn();
		try {
			ps = conn.prepareStatement(sql);
			//填写参数
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					//拿出某一个参数
					Object param = params[i];
					if (param == null) {
						ps.setString(i + 1, null);
					} else {
						ps.setObject(i + 1, param);
					}
				}
			}
			rs = ps.executeQuery();
			rs.next();
			Object r = rs.getObject(1);
			return r;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return null;
	}


	//提供获得链接的方法
	protected void openConn() {
		try {
			Class.forName(DRIVER);
			this.conn = DriverManager.getConnection(URL,UID,PWD);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//公共的关闭所有资源的方法
	protected void closeAll() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//加快gc回收无用对象
		rs = null;
		ps = null;
		conn = null;
	}


}
