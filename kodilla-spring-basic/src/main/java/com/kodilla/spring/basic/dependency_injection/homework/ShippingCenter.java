package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private ServicesD servicesD;
    private NotificationService notificationService;

    public ShippingCenter (ServicesD servicesD, NotificationService notificationService) {
        this.servicesD = servicesD;
        this.notificationService = notificationService;

    }

    public void sendPackage(String address, double weight) {
        if (servicesD.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
