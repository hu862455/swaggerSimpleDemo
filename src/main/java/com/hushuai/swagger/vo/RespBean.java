package com.hushuai.swagger.vo;

import com.hushuai.swagger.constant.CommonEnum;
import com.hushuai.swagger.excption.BaseErrorInfoInterface;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shuaihu2
 * @Date: 2020/5/14
 * @Interface: RespBean
 * @Description:
 */
public class RespBean {

    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object result;

    public RespBean() {
    }
    /**
     * 成功
     * @param data
     * @return
     */
    public static RespBean success(Object data) {
        RespBean rb = new RespBean();
        rb.setCode(CommonEnum.SUCCESS.getResultCode());
        rb.setMessage(CommonEnum.SUCCESS.getResultMsg());
        rb.setResult(data);
        return rb;
    }

    /**
     * 失败
     */
    public static RespBean error(BaseErrorInfoInterface errorInfo) {
        RespBean rb = new RespBean();
        rb.setCode(errorInfo.getResultCode());
        rb.setMessage(errorInfo.getResultMsg());
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static RespBean error(String code, String message) {
        RespBean rb = new RespBean();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static RespBean error( String message) {
        RespBean rb = new RespBean();
        rb.setCode("-1");
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
