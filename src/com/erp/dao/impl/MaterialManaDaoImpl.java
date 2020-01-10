package dao.impl;

import dao.BaseDao;
import dao.MaterialManaDao;
import util.Page;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MaterialManaDaoImpl extends BaseDao implements MaterialManaDao {
    @Override
    public List<Map<String, Object>> queryAllMaterialMana(Map<String,Object> params, Page page) {
        String sql = "select * from blp_material_mana where mm_area = ? ";
        int area = (int)params.get("area");
        //参数列表
        List<Object> plist = new ArrayList<Object>();
        plist.add(area);

        Set<String> keys = params.keySet();
        for (String key : keys) {
            if(!key.equals("area")){
                //判断mm_cata 物料别名是否填写
                Object value = params.get(key);
                //如果你填写了数据
                if (value != null && !"".equals(value)){
                    sql += " and " + key + " like concat('%',?,'%') ";
                    plist.add(value);
                }
            }
        }

        String countStr = "select count(1) from (" + sql + ") t";
        long totalCount = (long)executeOne(countStr,plist.toArray());
        page.setTotalCount((int)totalCount);
        sql = sql + " order by mm_state desc limit ?,? ";

        System.out.println("searchSql:" + sql);
        plist.add((page.currentPage - 1) * page.pageCount);
        plist.add(page.pageCount);
        return executeQueryMap(sql, plist.toArray());
    }

    @Override
    public List<String> queryAllCata() {
        List<String> cataList = new ArrayList<>();
        String sql = "SELECT DISTINCT mm_cata from blp_material_mana where mm_cata is not null or mm_cata <> ''";
        try {
            executeQuery(sql);
            while (rs.next()){
                cataList.add(rs.getString(1));
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return cataList;
    }

    @Override
    public List<String> queryAllUnit() {
        List<String> unitList = new ArrayList<>();
        String sql = "SELECT DISTINCT mm_unit from blp_material_mana where mm_unit is not null or mm_unit <> ''";
        try {
            executeQuery(sql);
            while (rs.next()){
                unitList.add(rs.getString(1));
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return unitList;
    }

    @Override
    public List<String> queryAllAccount() {
        List<String> accountList = new ArrayList<>();
        String sql = "SELECT DISTINCT mm_account from blp_material_mana where mm_account is not null or mm_account <> ''";
        try {
            executeQuery(sql);
            while (rs.next()){
                accountList.add(rs.getString(1));
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return accountList;
    }

    @Override
    public List<String> queryAllCodeByValue(String code) {
        List<String> accountList = new ArrayList<>();
        String sql = "SELECT DISTINCT mm_code from blp_material_mana where mm_code like CONCAT('%',?,'%') limit 0,20";
        try {
            executeQuery(sql,code);
            while (rs.next()){
                accountList.add(rs.getString(1));
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return accountList;
    }

    @Override
    public List<Map<String,Object>> queryMaterialByIds(String ids) {
        String sql = "select * from blp_material_mana where mm_id in (" +  ids + ")";
        //参数列表
        List<Object> plist = new ArrayList<Object>();
        return executeQueryMap(sql);
    }

    @Override
    public void disableMaterialMana(String ids) {
        String sql = "update blp_material_mana set mm_state=0 where mm_id in (" + ids + ")";
        executeUpdate(sql);
    }
}
