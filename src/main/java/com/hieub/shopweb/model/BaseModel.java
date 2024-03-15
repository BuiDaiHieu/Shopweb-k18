package com.hieub.shopweb.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseModel {
    @Id //Mark as key attribute
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    @Column(name = "id")
    private int id;

    @Column(name = "status", nullable = true)
    private boolean status = true;

    @Column(name = "created_by", nullable = true)
    private Integer createdBy;

    @Column(name = "created_date", nullable = true)
    private Integer createdDate;

    @Column(name = "updated_by", nullable = true)
    private Integer updatedBy;

    @Column(name = "updated_date", nullable = true)
    private Integer updatedDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(int createdDate) {
        this.createdDate = createdDate;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public int getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(int updatedDate) {
        this.updatedDate = updatedDate;
    }
}
