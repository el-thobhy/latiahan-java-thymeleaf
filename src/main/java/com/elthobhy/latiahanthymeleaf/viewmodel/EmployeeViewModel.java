package com.elthobhy.latiahanthymeleaf.viewmodel;

import java.sql.Timestamp;

public class EmployeeViewModel {

    private long id;
    private long biodataId;
    private String nip;
    private String status;
    private int salary;

    private BiodataViewModel biodata;

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

    public long getBiodataId() {
        return biodataId;
    }

    public void setBiodataId(long biodataId) {
        this.biodataId = biodataId;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public BiodataViewModel getBiodata() {
        return biodata;
    }

    public void setBiodata(BiodataViewModel biodata) {
        this.biodata = biodata;
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
