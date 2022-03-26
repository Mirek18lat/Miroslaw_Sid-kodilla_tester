package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private ServicesD servicesD;
    private ServicesN servicesN;

    public ShippingCenter (ServicesD servicesD, ServicesN servicesN) {
        this.servicesD = servicesD;
        this.servicesN = servicesN;

    }

    public void sendPackage(String address, double weight) {
        if (servicesD.deliverPackage(address, weight)) {
            servicesN.success(address);
        } else {
            servicesN.fail(address);
        }
    }
}
