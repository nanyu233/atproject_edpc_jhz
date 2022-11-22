package activetech.task.mq;

import activetech.task.mq.pojo.PushMessageDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ContextConfiguration 需要配上spring的配置文件，这样就可以在测试类中使用注解简单的注入需要的bean了。简单高效。
 * 不建议直接classpath:spring/applicationContext-**.xml，影响效率，很慢
 * junit 4 支持注解事务等等
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-config.xml",
        "classpath:spring/applicationContext-rabbitmq.xml" })
public class ProducerTest {
    @Autowired
    public AmqpTemplate amqpTemplate;
    @Autowired
    public RabbitTemplate rabbitTemplate;

    @Test
    public void SendMessage() {
        PushMessageDto pushMessageDto = new PushMessageDto();
        pushMessageDto.setEmgSeq("11111");
        pushMessageDto.setTargetPage("aaaa");
        amqpTemplate.convertAndSend("messageToWebExchangeFanout", "", pushMessageDto);
    }
    @Test
    public void rabbitTemplateSend(){
        PushMessageDto pushMessageDto = new PushMessageDto();
        pushMessageDto.setEmgSeq("11111");
        pushMessageDto.setTargetPage("aaaa");
        rabbitTemplate.convertAndSend("messageToWebExchangeFanout", "", pushMessageDto);
    }

}
