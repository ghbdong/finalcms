package org.yoqu.cms.core.model;

import com.jfinal.plugin.activerecord.Db;
import org.yoqu.cms.core.model.base.BaseDictionary;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Dictionary extends BaseDictionary<Dictionary> {
    public static final Dictionary dao = new Dictionary();

    public List<Dictionary> getDictionaryList() {
        return find("select * from dictionary");
    }

    public List<Dictionary> getDictionaryList(Integer dictionType) {
        return find("select * from dictionary where typeid=?", dictionType);
    }

    public boolean update(Object key, Object value){
        return Db.update("update dictionary set value=? where name=? and is_delete=0",value,key)>0?true:false;
    }
}
