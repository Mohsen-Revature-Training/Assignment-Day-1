package com.revature.training.springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageService emailService = context.getBean("emailService", MessageService.class);
        MessageService smsService = context.getBean("smsService", MessageService.class);

        emailService.sendMessage();
        smsService.sendMessage();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
