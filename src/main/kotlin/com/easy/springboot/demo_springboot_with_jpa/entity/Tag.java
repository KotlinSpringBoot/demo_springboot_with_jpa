package com.easy.springboot.demo_springboot_with_jpa.entity;
import javax.persistence.*;


@Entity
public class Tag {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private java.sql.Timestamp gmtCreate;
  private java.sql.Timestamp gmtModify;
  private long isDeleted;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Timestamp getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(java.sql.Timestamp gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public java.sql.Timestamp getGmtModify() {
    return gmtModify;
  }

  public void setGmtModify(java.sql.Timestamp gmtModify) {
    this.gmtModify = gmtModify;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }

}
