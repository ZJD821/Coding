package txw.study.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import txw.study.resp.HelloResp;
import txw.study.service.HelloService;

import java.util.Objects;

/**
 * test
 * @author tao xing wei
 */
@Service
@Slf4j
public class HelloServiceImpl implements HelloService {

    @Override
    public HelloResp getTestMsg(Integer number) {
        if (Objects.nonNull(number)) {
            String s = "hello";
            HelloResp helloResp = new HelloResp();
            helloResp.setMsg(s);
            return helloResp;
        }
        return new HelloResp();
    }
}
