package cn.itcast.springboot.entity;

import java.util.Date;

public class User {
    private Integer id;
    private Integer uappId;
    /** 渠道用户ID */
    private String channelUserid;
    /** 渠道用户登录名 */
    private String channelUsername;
    private String channelNickname;
    /** 用户唯一ID（可用与微信唯一ID） */
    private String openId;
    private String headUrl;
    private String mobile;
    private String orgName;
    private String orgPath;
    private String email;
    private String password;
    private Byte isAdmin;
    private Byte isSuper;
    private Byte isEnabled;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private Date lastLoginTime;
    private Integer version;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setUappId(Integer uappId) {
        this.uappId = uappId;
    }

    public Integer getUappId() {
        return this.uappId;
    }

    public void setChannelUserid(String channelUserid) {
        this.channelUserid = channelUserid;
    }

    public String getChannelUserid() {
        return this.channelUserid;
    }

    public void setChannelUsername(String channelUsername) {
        this.channelUsername = channelUsername;
    }

    public String getChannelUsername() {
        return this.channelUsername;
    }

    public void setChannelNickname(String channelNickname) {
        this.channelNickname = channelNickname;
    }

    public String getChannelNickname() {
        return this.channelNickname;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getHeadUrl() {
        return this.headUrl;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath;
    }

    public String getOrgPath() {
        return this.orgPath;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Byte getIsAdmin() {
        return this.isAdmin;
    }

    public void setIsSuper(Byte isSuper) {
        this.isSuper = isSuper;
    }

    public Byte getIsSuper() {
        return this.isSuper;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Byte getIsEnabled() {
        return this.isEnabled;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Date getDeletedAt() {
        return this.deletedAt;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getVersion() {
        return this.version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        User that = (User) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ",uappId='" + uappId + "'" +
                ",channelUserid='" + channelUserid + "'" +
                ",channelUsername='" + channelUsername + "'" +
                ",channelNickname='" + channelNickname + "'" +
                ",openId='" + openId + "'" +
                ",headUrl='" + headUrl + "'" +
                ",mobile='" + mobile + "'" +
                ",orgName='" + orgName + "'" +
                ",orgPath='" + orgPath + "'" +
                ",email='" + email + "'" +
                ",password='" + password + "'" +
                ",isAdmin='" + isAdmin + "'" +
                ",isSuper='" + isSuper + "'" +
                ",isEnabled='" + isEnabled + "'" +
                ",createdAt='" + createdAt + "'" +
                ",updatedAt='" + updatedAt + "'" +
                ",deletedAt='" + deletedAt + "'" +
                ",lastLoginTime='" + lastLoginTime + "'" +
                ",version='" + version + "'" +
                '}';
    }
}
