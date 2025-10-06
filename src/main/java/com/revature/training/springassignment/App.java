package com.revature.training.springassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageService emailService = (MessageService) context.getBean("emailService");
        MessageService smsService = (MessageService) context.getBean("smsService");

        emailService.sendMessage();
        smsService.sendMessage();
    }
}
