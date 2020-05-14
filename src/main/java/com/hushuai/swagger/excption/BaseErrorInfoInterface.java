package com.hushuai.swagger.excption;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shuaihu2
 * @Date: 2020/5/14
 * @Interface: BaseErrorInfoInterface
 * @Description:
 */
public interface BaseErrorInfoInterface {
    /** 错误码*/
    String getResultCode();

    /** 错误描述*/
    String getResultMsg();

}
