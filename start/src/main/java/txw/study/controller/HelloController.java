package txw.study.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import txw.study.resp.HelloResp;
import txw.study.service.HelloService;

import javax.annotation.Resource;

/**
 * @author tao xing wei
 */
@RestController
public class HelloController {

    @Resource
    HelloService helloService;

    @RequestMapping("/hello")
    public HelloResp method() {
        HelloResp testMsg = helloService.getTestMsg(1);
        return testMsg;
    }
}
