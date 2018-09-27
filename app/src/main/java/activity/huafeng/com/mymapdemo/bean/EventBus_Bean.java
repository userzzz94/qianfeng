package activity.huafeng.com.mymapdemo.bean;

/**
 * Created by xian on 2018/9/10.
 */

public class EventBus_Bean {
    private String sign;
    private String message;

    public EventBus_Bean(String sign) {
        this.sign = sign;
    }

    public EventBus_Bean(String sign, String message) {
        this.sign = sign;
        this.message = message;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
