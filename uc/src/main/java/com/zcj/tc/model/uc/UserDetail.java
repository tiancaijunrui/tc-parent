package com.zcj.tc.model.uc;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_uc_user_detail")
public class UserDetail {

    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @Column(name = "detailId", length = 32)
    private String detailId;

    @Column(nullable = false, name = "user_id", unique = true, length = 32)
    private String userId;

    @Column(name = "nick_name", length = 50)
    private String nickName;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "gender", length = 20)
    private GenderEnum gender;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "province", length = 50)
    private String province;

    @Column(name = "country", length = 50)
    private String country;

    @Column(name = "bind_type", length = 20)
    @Enumerated(EnumType.STRING)
    private BindTypeEnum bindType;

    @Column(name = "user_type", length = 50)
    private String userType;

    @Column(name = "user_status", length = 50)
    private String userStatus;

    @Column(name = "is_certified", length = 50)
    private String isCertified;

    @Column(nullable = false, name = "update_by", length = 32)
    private String updateBy;

    @Column(nullable = false, name = "create_time")
    private Date createTime;

    @Column(nullable = false, name = "update_time")
    private Date updateTime;

    @Column(nullable = false, name = "create_by", length = 32)
    private String createBy;

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BindTypeEnum getBindType() {
        return bindType;
    }

    public void setBindType(BindTypeEnum bindType) {
        this.bindType = bindType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getIsCertified() {
        return isCertified;
    }

    public void setIsCertified(String isCertified) {
        this.isCertified = isCertified;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "detailId='" + detailId + '\'' +
                ", userId='" + userId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", gender=" + gender +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", bindType=" + bindType +
                ", userType='" + userType + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", isCertified='" + isCertified + '\'' +
                '}';
    }
}
