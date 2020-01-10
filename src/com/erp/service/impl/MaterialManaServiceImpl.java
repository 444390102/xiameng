package service.impl;

import dao.MaterialManaDao;
import dao.impl.MaterialManaDaoImpl;
import service.MaterialManaService;
import util.Page;

import java.util.List;
import java.util.Map;

public class MaterialManaServiceImpl implements MaterialManaService {
    private MaterialManaDao materialManaDao =
            new MaterialManaDaoImpl();

    @Override
    public List<Map<String, Object>> queryAllMaterialMana(Map<String,Object> params, Page page) {
        return materialManaDao.queryAllMaterialMana(params,page);
    }

    @Override
    public List<String> queryAllCata() {
        return materialManaDao.queryAllCata();
    }

    @Override
    public List<String> queryAllUnit() {
        return materialManaDao.queryAllUnit();
    }

    @Override
    public List<String> queryAllAccount() {
        return materialManaDao.queryAllAccount();
    }

    @Override
    public List<String> queryAllCodeByValue(String code) {
        return materialManaDao.queryAllCodeByValue(code);
    }

    @Override
    public List<Map<String,Object>> queryMaterialByIds(String ids) {
        return materialManaDao.queryMaterialByIds(ids);
    }

    @Override
    public void disableMaterialMana(String ids) {
        materialManaDao.disableMaterialMana(ids);
    }
}
