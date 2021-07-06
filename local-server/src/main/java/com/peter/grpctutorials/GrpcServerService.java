package com.peter.grpctutorials;

import com.peter.grpctutorials.lib.HelloReply;
import com.peter.grpctutorials.lib.SimpleGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Date;

/**
 * @author zhangye
 * @description
 * @date 2021/7/6 20:41
 */
@GrpcService
public class GrpcServerService extends SimpleGrpc.SimpleImplBase {
    @Override
    public void sayHello(com.peter.grpctutorials.lib.HelloRequest request,
                         io.grpc.stub.StreamObserver<com.peter.grpctutorials.lib.HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + request.getName() + ", " + new Date()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
