package com.renj.provider.config;

import com.renj.provider.bean.base.BaseResponseBean;
import com.renj.provider.common.ApplicationCommon;
import com.renj.provider.utils.ResponseFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ======================================================================
 * <p>
 * 作者：Renj
 * 邮箱：renjunhua@anlovek.com
 * <p>
 * 创建时间：2019-07-05   15:02
 * <p>
 * 描述：全局异常处理
 * <p>
 * 修订历史：
 * <p>
 * ======================================================================
 */
@ControllerAdvice
public class ApplicationExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ApplicationExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResponseBean handle(Exception e) {
        if (e instanceof MyException) {
            MyException myException = (MyException) e;
            int exceptionCode = myException.getCode();
            if (exceptionCode == ApplicationCommon.CODE_TOKEN_EXCEPTION) {
                logger.error("【Token异常】{}", e);
                return ResponseFactory.tokenExceptionResponse();
            } else if (exceptionCode == ApplicationCommon.CODE_HANDLER_EXCEPTION) {
                logger.error("【服务器处理异常】{}", e);
                return ResponseFactory.handlerExceptionResponse();
            } else if (exceptionCode == ApplicationCommon.CODE_PARAMS_EXCEPTION) {
                logger.error("【参数异常】{}", e);
                return ResponseFactory.paramsExceptionResponse();
            } else {
                logger.error("【未知异常】{}", e);
                return ResponseFactory.unknowExceptionResponse();
            }
        } else {
            logger.error("【系统异常】{}", e);
            return ResponseFactory.failResponse();
        }
    }
}
