package common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.CustomerService;

public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-customer.xml");
        CustomerService customer = (CustomerService) appContext.getBean("customerService");
        customer.addCustomerAround("javaxblog");
    }
}