package com.peter.grpctutorials;

import io.grpc.ClientInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangye
 * @description
 * @date 2021/7/6 20:47
 */
@Configuration(proxyBeanMethods = false)
public class GlobalClientInterceptorConfiguration {
    @GrpcGlobalClientInterceptor
    ClientInterceptor logClientInterceptor() {
        return new LogGrpcInterceptor();
    }
}
