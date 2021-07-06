package com.peter.grpctutorials;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangye
 * @description
 * @date 2021/7/6 20:50
 */
@RestController
public class GrpcClientController {
    @Resource
    private GrpcClientService grpcClientService;

    @RequestMapping("/")
    public String printMessage(@RequestParam(defaultValue = "peter") String name) {
        return grpcClientService.sendMessage(name);
    }
}
