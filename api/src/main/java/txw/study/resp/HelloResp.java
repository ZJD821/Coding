package txw.study.resp;

import lombok.Data;

/**
 * hello 返回结果
 * @author tao xing wei
 */
@Data
public class HelloResp extends BaseResp {

    /**
     * 一句话
     */
    private String msg;
}
