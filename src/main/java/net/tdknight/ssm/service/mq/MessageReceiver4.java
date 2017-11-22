package net.tdknight.ssm.service.mq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * 消息消费者
 *
 * @Author TDKnight
 * @Date 2017/11/6
 */
@Component
public class MessageReceiver4 implements MessageListener{

    @Override
    public void onMessage(Message message) {
        System.out.println(message.getMessageProperties().getContentEncoding() + "===>encode");
        try {
            System.out.println(new String(message.getBody(), message.getMessageProperties().getContentEncoding()) + "====>body");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("队列监听器4号收到消息"+message.toString());
    }
}
