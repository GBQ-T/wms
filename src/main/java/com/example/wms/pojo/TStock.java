package com.example.wms.pojo;

import lombok.Data;

@Data
public class TStock {

	private String id;
	private String name;
	private long unitId;
	private long stockNum;
	private String remarks;
	private long delFlg;
	private java.sql.Timestamp createDate;
	private String createUser;
	private java.sql.Timestamp updateDate;
	private String updateUser;
}
