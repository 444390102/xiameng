package service;

import util.Page;

import java.util.List;
import java.util.Map;

public interface MaterialManaService {
    List<Map<String, Object>> queryAllMaterialMana(Map<String,Object> params, Page page);

    List<String> queryAllCata();

    List<String> queryAllUnit();

    List<String> queryAllAccount();

    List<String> queryAllCodeByValue(String code);

    List<Map<String,Object>> queryMaterialByIds(String ids);

    void disableMaterialMana(String ids);
}
