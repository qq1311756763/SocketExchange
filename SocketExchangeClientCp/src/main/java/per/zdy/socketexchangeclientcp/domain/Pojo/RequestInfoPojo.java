package per.zdy.socketexchangeclientcp.domain.Pojo;

/**
 * 向服务器发起请求附带的参数
 * @author ZDY
 * */
public class RequestInfoPojo {
    String targetIp;
    int targetPort;
    String userId;
    String userPwd;

    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
    }

    public int getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(int targetPort) {
        this.targetPort = targetPort;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userName) {
        this.userId = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
