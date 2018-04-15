package com.zcj.tc.model.menu;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_mene_food")
public class Food {
    @Id
    @Column(name = "food_id", length = 32)
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String foodId;

    @Column(name = "food_code", length = 50, unique = true, nullable = false)
    private String foodCode;

    @Column(name = "food_name", length = 100, nullable = false)
    private String foodName;

    @Column(name = "category_id", length = 32, nullable = false)
    private String categoryId;

    @Column(name = "summary", length = 200)
    private String summary;

    @Column(nullable = false, name = "update_by", length = 32)
    private String updateBy;

    @Column(nullable = false, name = "create_time")
    private Date createTime;

    @Column(nullable = false, name = "update_time")
    private Date updateTime;

    @Column(nullable = false, name = "create_by", length = 32)
    private String createBy;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodCode() {
        return foodCode;
    }

    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
