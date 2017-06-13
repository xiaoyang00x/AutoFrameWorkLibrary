package dataBean.dubbo.userSys;

import com.miaoqian.usersvc.model.enums.PageTradeTypeEnum;
import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/14.
 */
public class MyOpenPageParamsReqDto implements IDataBean{

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    /**
     * 用户uid
     */
    private String uid;

    /**
     * 页面交易类型
     */
    private PageTradeTypeEnum pageTradeTypeEnum;

    /**
     * 江西银行redirect至平台方页面地址
     */
    private String retUrl;

    /**
     * 自动投标签约，自动购买债权签约需要传
     * 平台方忘记密码跳转
     */
    private String forgotPwdUrl;

    /**
     * 增强短信验证码
     * 重置交易密码时需用到
     */
    private String smsCode;
    /**
     * 增强短信授权码
     * 重置交易密码时需用到
     */
    private String authCode;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public PageTradeTypeEnum getPageTradeTypeEnum() {
        return pageTradeTypeEnum;
    }

    public void setPageTradeTypeEnum(PageTradeTypeEnum pageTradeTypeEnum) {
        this.pageTradeTypeEnum = pageTradeTypeEnum;
    }

    public String getRetUrl() {
        return retUrl;
    }

    public void setRetUrl(String retUrl) {
        this.retUrl = retUrl;
    }

    public String getForgotPwdUrl() {
        return forgotPwdUrl;
    }

    public void setForgotPwdUrl(String forgotPwdUrl) {
        this.forgotPwdUrl = forgotPwdUrl;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    @Override
    public String toString() {
        return "MyOpenPageParamsReqDto{" +
                "uid='" + uid + '\'' +
                ", pageTradeTypeEnum=" + pageTradeTypeEnum +
                ", smsCode=" + smsCode +
                ", authCode=" + authCode +
                ", retUrl='" + retUrl + '\'' +
                ", forgotPwdUrl='" + forgotPwdUrl + '\'' +
                '}';
    }
}
