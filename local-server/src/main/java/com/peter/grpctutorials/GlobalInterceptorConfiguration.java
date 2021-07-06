package com.peter.grpctutorials;

import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangye
 * @description
 * @date 2021/7/6 20:40
 */
@Configuration(proxyBeanMethods = false)
public class GlobalInterceptorConfiguration {

    @GrpcGlobalServerInterceptor
    public LogGrpcInterceptor logGrpcInterceptor(){
        return new LogGrpcInterceptor();
    }
}
