package com.peter.grpctutorials;

import io.grpc.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangye
 * @description
 * @date 2021/7/6 20:44
 */
@Slf4j
public class LogGrpcInterceptor implements ClientInterceptor {
    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
        log.info(method.getFullMethodName());
        return next.newCall(method, callOptions);
    }
}
