package com.ameda.kisevu.service;/*
*
@author ameda
@project gRPC
*
*/

import com.ameda.kevin.gRPC.GreetingRequest;
import com.ameda.kevin.gRPC.GreetingResponse;
import com.ameda.kevin.gRPC.GreetingServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    /**
     * @param request
     * @param responseObserver
     */
      /*
    *
    @author ameda
    @project gRPC
    *
    */
    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        String message = request.getMessage();
        System.out.println("received message: "+message);

        GreetingResponse greetingResponse = GreetingResponse.newBuilder()
                .setMessage("Received your " + message + "Dev Ameda Kisevu from server")
                .build();

        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();

    }
}
