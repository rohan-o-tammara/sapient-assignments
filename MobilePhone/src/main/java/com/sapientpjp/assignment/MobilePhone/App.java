package com.sapientpjp.assignment.MobilePhone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Mobile Phone
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("mobileContext.xml");
    	
        Mobile phone = (Mobile)factory.getBean("mobile");
    }
}
