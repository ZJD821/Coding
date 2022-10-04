package txw.study.service;

import org.springframework.stereotype.Component;
import txw.study.resp.HelloResp;

/**
 * test
 * @author tao xing wei
 */
public interface HelloService {

    /**
     * test
     * @param number
     * @return
     */
    HelloResp getTestMsg(Integer number);
}
