package com.elthobhy.latiahanthymeleaf.viewmodel;

import java.sql.Timestamp;

public class BiodataViewModel {
    private long id;
    private String firstName;
    private String lastName;
    private String dob;
    private String pob;
    private String address;
    private boolean maritalStatus;

    private boolean deleted;
    private int createBy;
    private Timestamp createDate;
    private int updateBy;
    private Timestamp updateDate;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getPob() {
        return pob;
    }
    public void setPob(String pob) {
        this.pob = pob;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean isMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public boolean isDeleted() {
        return deleted;
    }
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    public int getCreateBy() {
        return createBy;
    }
    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }
    public Timestamp getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
    public int getUpdateBy() {
        return updateBy;
    }
    public void setUpdateBy(int updateBy) {
        this.updateBy = updateBy;
    }
    public Timestamp getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }
}
