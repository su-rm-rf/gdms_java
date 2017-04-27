package com.yuhualing.www.gdms.common.Error;

/**
 * Created by macbook on 17/4/20.
 */
public class ShopErrorMsg {

    private String errorCode;

    private String errorMsg;

    private Integer shopId;

    public ShopErrorMsg() {
    }

    public ShopErrorMsg(String errorCode, String errorMsg, Integer shopId) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.shopId = shopId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

}
