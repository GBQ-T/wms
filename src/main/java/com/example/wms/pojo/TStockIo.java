package com.example.wms.pojo;

import lombok.Data;

@Data
public class TStockIo {

  private String id;
  private long inOutNo;
  private long ioType;
  private long ioNum;
  private String remarks;
  private long delFlg;
  private java.sql.Timestamp createDate;
  private String createUser;
  private java.sql.Timestamp updateDate;
  private String updateUser;
  private long version;


}
