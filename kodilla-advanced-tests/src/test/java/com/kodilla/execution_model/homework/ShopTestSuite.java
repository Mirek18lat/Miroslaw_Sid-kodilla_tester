package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {
    Shop shop = new Shop();
    Order banana = new Order(20.00, LocalDate.of(2022, 1, 31), "MRSID");
    Order lime = new Order(40.00, LocalDate.of(2021, 2, 25), "DAWLAW");
    Order pear  = new Order(15.00, LocalDate.of(2020, 3, 31), "MICLIP");
    Order apple = new Order(15.00, LocalDate.of(2019, 8, 9), "ANDPOL");
    Order banana2 = new Order(19.00, LocalDate.of(2022, 1, 16), "MRSID");
    Order lime2 = new Order(65.00, LocalDate.of(2015, 2, 26), "DAWLAW");
    Order pear2 = new Order(105.00, LocalDate.of(2018, 3, 22), "MICLIP");
    Order apple2 = new Order(60.00, LocalDate.of(2014, 8, 10), "ANDPOL");


    @Test
    public void shouldCountOrdersFromBeforeEach() {
        //when
        int invoiceNumber = shop.getSize();
        //then
        assertEquals(8, invoiceNumber);
    }

    @Test
    public void shouldReturnOrdersFrom2year() {
        //when

        //then
        assertEquals(4, shop.returnListFrom2Year().size());
    }
    @Test
    public void getMaxValueOrder() {
        //given
        //when

        //then
        assertEquals(105.00, shop.getMaxValueOrder());
    }

    @Test
    public void getMinValueOrder() {
        //given
        //when

        //then
        assertEquals(15.00, shop.getMinValueOrder());
    }



    @BeforeEach
    public void initializeShop() {
        shop.addOrder(banana);
        shop.addOrder(lime);
        shop.addOrder(pear);
        shop.addOrder(apple);
        shop.addOrder(banana2);
        shop.addOrder(lime2);
        shop.addOrder(pear2);
        shop.addOrder(apple2);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
