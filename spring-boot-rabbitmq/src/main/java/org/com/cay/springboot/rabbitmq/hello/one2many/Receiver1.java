package org.com.cay.springboot.rabbitmq.hello.one2many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Cay on 2018/4/18.
 */
@RabbitListener(queues = {"helloOne2Many"})
@Component("one2many-receiver1")
public class Receiver1 {

	@RabbitHandler
	public void handler(String content){
		System.out.println("Receiver1接收到：" + content);
	}
}
