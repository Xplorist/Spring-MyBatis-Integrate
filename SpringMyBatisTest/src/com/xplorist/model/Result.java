package com.xplorist.model;

public class Result {
	private String pkid;//主鍵id
	private String name;
	private String create_date;//創建時間
	private String project_name;//專案名稱
	private String factory_zone;//廠區編號
	private String bill_no;//單號（專案名稱+廠區編號+日期+流水碼）
	private String rpt_type_no;//報告編號
	
	public Result() {
		super();
	}
	
	public String getPkid() {
		return pkid;
	}
	public void setPkid(String pkid) {
		this.pkid = pkid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getFactory_zone() {
		return factory_zone;
	}

	public void setFactory_zone(String factory_zone) {
		this.factory_zone = factory_zone;
	}

	public String getBill_no() {
		return bill_no;
	}

	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}

	public String getRpt_type_no() {
		return rpt_type_no;
	}

	public void setRpt_type_no(String rpt_type_no) {
		this.rpt_type_no = rpt_type_no;
	}
	
}
