package com.hieub.shopweb.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_product")
public class Product extends BaseModel{
    @Column(name = "title", length = 1000, nullable = false)
    private String title;

    @Column(name = "price", precision = 13, scale = 2, nullable = false)
    private BigDecimal price;

    @Column(name = "price_sale", precision = 13, scale = 2, nullable = true)
    private BigDecimal price_sale;

    @Column(name = "short_description", length = 3000, nullable = false)
    private String shortDes;

    @Lob
    @Column(name = "detail_description", nullable = false, columnDefinition = "LONGTEXT")
    private String detailDes;

    @Column(name = "avatar", nullable = true)
    private String avatar;

    @Column(name = "seo", length = 1000, nullable = true)
    private String seo;

    @Column(name = "is_hot", nullable = true)
    private boolean isHot = false;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice_sale() {
        return price_sale;
    }

    public void setPrice_sale(BigDecimal price_sale) {
        this.price_sale = price_sale;
    }

    public String getShortDes() {
        return shortDes;
    }

    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }

    public String getDetailDes() {
        return detailDes;
    }

    public void setDetailDes(String detailDes) {
        this.detailDes = detailDes;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSeo() {
        return seo;
    }

    public void setSeo(String seo) {
        this.seo = seo;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
