package org.yoqu.cms.core.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseFile<M extends BaseFile<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setSize(java.lang.String size) {
		set("size", size);
	}

	public java.lang.String getSize() {
		return get("size");
	}

	public void setPath(java.lang.String path) {
		set("path", path);
	}

	public java.lang.String getPath() {
		return get("path");
	}

	public void setModule(java.lang.String module) {
		set("module", module);
	}

	public java.lang.String getModule() {
		return get("module");
	}

	public void setFid(java.lang.Integer fid) {
		set("fid", fid);
	}

	public java.lang.Integer getFid() {
		return get("fid");
	}

	public void setUploadTime(java.util.Date uploadTime) {
		set("upload_time", uploadTime);
	}

	public java.util.Date getUploadTime() {
		return get("upload_time");
	}

}
