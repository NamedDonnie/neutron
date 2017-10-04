package pers.donnie.result;

import java.io.Serializable;

public class NeutronResult implements Serializable {

    private Integer status;
    private String msg;

    /**
     * 成功调用的方法
     *
     * @return
     */
    public static NeutronResult success() {
        NeutronResult result = new NeutronResult();
        result.setStatus(200);
        result.setMsg("success");
        return result;
    }

    /**
     * 失败调用的方法
     *
     * @return
     */
    public static NeutronResult faild() {
        NeutronResult result = new NeutronResult();
        result.setStatus(400);
        result.setMsg("failed");
        return result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
