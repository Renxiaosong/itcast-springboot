package cn.itcast.springboot.entity;
import java.util.Date;

public class PApp {
    private Integer id;
    private String appHosts;
    /** 渠道码，用于url拼接的链接 */
    private String appCode;
    private String appName;
    /** 平台appid */
    private String uappId;
    /** 平台appkey，用于进行签名请求接口 */
    private String uappKey;
    /** 平台appkey密钥信息 */
    private String uappSecret;
    /** 联系人 */
    private String contactName;
    /** 联系人电话 */
    private String contactMobile;
    /** 联系人邮箱 */
    private String contactEmail;
    /** 0禁用 1启用 */
    private Byte isEnabled;
    /** 请求是否验签 */
    private Byte isSign;
    /** 支付类型：00第三方应用自己支付(推送过来的都是已经付款的订单)，10平台代收款 */
    private String payType;
    /** 支付类型：00第三方应用自己ke进行提报交付，10平台进行交付 */
    private String deliveryType;
    private String desc;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private Integer version;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setAppHosts(String appHosts) {
        this.appHosts = appHosts;
    }

    public String getAppHosts() {
        return this.appHosts;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setUappId(String uappId) {
        this.uappId = uappId;
    }

    public String getUappId() {
        return this.uappId;
    }

    public void setUappKey(String uappKey) {
        this.uappKey = uappKey;
    }

    public String getUappKey() {
        return this.uappKey;
    }

    public void setUappSecret(String uappSecret) {
        this.uappSecret = uappSecret;
    }

    public String getUappSecret() {
        return this.uappSecret;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactMobile() {
        return this.contactMobile;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Byte getIsEnabled() {
        return this.isEnabled;
    }

    public void setIsSign(Byte isSign) {
        this.isSign = isSign;
    }

    public Byte getIsSign() {
        return this.isSign;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryType() {
        return this.deliveryType;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
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
        PApp that = (PApp) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PApp{" +
                "id=" + id +
                ",appHosts='" + appHosts + "'" +
                ",appCode='" + appCode + "'" +
                ",appName='" + appName + "'" +
                ",uappId='" + uappId + "'" +
                ",uappKey='" + uappKey + "'" +
                ",uappSecret='" + uappSecret + "'" +
                ",contactName='" + contactName + "'" +
                ",contactMobile='" + contactMobile + "'" +
                ",contactEmail='" + contactEmail + "'" +
                ",isEnabled='" + isEnabled + "'" +
                ",isSign='" + isSign + "'" +
                ",payType='" + payType + "'" +
                ",deliveryType='" + deliveryType + "'" +
                ",desc='" + desc + "'" +
                ",createdAt='" + createdAt + "'" +
                ",updatedAt='" + updatedAt + "'" +
                ",deletedAt='" + deletedAt + "'" +
                ",version='" + version + "'" +
                '}';
    }

}