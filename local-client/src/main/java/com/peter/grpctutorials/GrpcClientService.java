package com.peter.grpctutorials;

import com.peter.grpctutorials.lib.HelloReply;
import com.peter.grpctutorials.lib.HelloRequest;
import com.peter.grpctutorials.lib.SimpleGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @author zhangye
 * @description
 * @date 2021/7/6 20:48
 */
@Service
public class GrpcClientService {
    @GrpcClient("local-grpc-server")
    private SimpleGrpc.SimpleBlockingStub simpleStub;

    public String sendMessage(final String name) {
        try {
            final HelloReply response = this.simpleStub.sayHello(HelloRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }
}
