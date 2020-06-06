package cn.cie.event.handler;

import cn.cie.event.EventModel;
import cn.cie.event.EventType;
import cn.cie.utils.MailUtil;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by RojerAlone on 2017/6/25.
 * 发送注册用户时邮箱验证码事件
 */
@Service
public class SendValidateMailHandler implements EventHandler {

    @Override
    public void doHandler(EventModel model) {
        MailUtil.sendValidateMail(model.getExts("mail"), model.getExts("code"));
    }

    @Override
    public List<EventType> getSupportEvent() {
        return Arrays.asList(EventType.SEND_VALIDATE_EMAIL);
    }
}
