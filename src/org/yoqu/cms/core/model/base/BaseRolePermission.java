package org.yoqu.cms.core.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRolePermission<M extends BaseRolePermission<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setRid(java.lang.Integer rid) {
		set("rid", rid);
	}

	public java.lang.Integer getRid() {
		return get("rid");
	}

	public void setModule(java.lang.String module) {
		set("module", module);
	}

	public java.lang.String getModule() {
		return get("module");
	}

	public void setMethod(java.lang.String method) {
		set("method", method);
	}

	public java.lang.String getMethod() {
		return get("method");
	}

	public void setIsDelete(java.lang.Integer isDelete) {
		set("is_delete", isDelete);
	}

	public java.lang.Integer getIsDelete() {
		return get("is_delete");
	}

}
