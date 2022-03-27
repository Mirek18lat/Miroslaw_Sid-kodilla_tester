package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTest {

    @Test
    public void shouldReturnTrue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean delivery = bean.deliverPackage("Test", 18.0);
        Assertions.assertTrue(delivery);
    }

    @Test
    public void shouldReturnFalse() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean delivery = bean.deliverPackage("Test", 31.0);
        Assertions.assertFalse(delivery);
    }

    @Test
    public void shouldReturnTrueForSuccessAddress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        NotificationService bean = context.getBean(NotificationService.class);
        String addressSuccess = bean.success("Test");
        Assertions.assertEquals("Package delivered to: Test", addressSuccess);
    }

    @Test
    public void shouldReturnTrueForFailAddress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        NotificationService bean = context.getBean(NotificationService.class);
        String addressFail = bean.fail("Test");
        Assertions.assertEquals("Package not delivered to: Test", addressFail);
    }

    @Test
    public void shouldProcessSuccessSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String sendSuccess = bean.sendPackage("Test", 18.0);
        Assertions.assertEquals("Package delivered to: Test", sendSuccess);
    }

    @Test
    public void shouldProcessFalSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String sendSuccess = bean.sendPackage("Test", 31.0);
        Assertions.assertEquals("Package not delivered to: Test", sendSuccess);
    }
}