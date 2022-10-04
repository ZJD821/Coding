package txw.study.resp;

import java.io.Serializable;

/**
 * 返回结果基类
 * @author tao xing wei
 */
public class BaseResp<T> implements Serializable {

    private T data;

    public T getData() {
        return data;
    }
}
