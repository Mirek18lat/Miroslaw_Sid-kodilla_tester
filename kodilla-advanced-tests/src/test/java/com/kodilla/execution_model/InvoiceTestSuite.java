package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item electricity = new Item("Electricity",2000.00);
    Item water = new Item("Water",500.00);
    Item gaz = new Item("Gaz",500.00);
    Item taxi = new Item("Taxi",700.00);
    Item postServices = new Item("Post Services",200.00);

    @Test
    public void shouldAddItemsAndCheckSizeListItem() {
        //when
        int invoiceSize = invoice.getSize();
        //then
        assertEquals(5, invoiceSize);
    }

    @Test
    public void shouldCheckValueOfAddedItems() {
        //when
        Item checkItem = invoice.getItem(0);
        //then
        assertEquals("Electricity", checkItem.getName());
        assertEquals(2000.00, checkItem.getPrice());
    }

    @Test
    public void shouldCheckNegativeIndex() {
        //when
        Item negativeValue = invoice.getItem(-2);
        //then
        assertNull(negativeValue);
    }

    @Test
    public void shouldCheckIndexOverScale() {
        //then
        assertEquals(null, invoice.getItem(9));
    }

    @Test
    public void shouldCheckAddAndEraseLIst() {
        //when
       invoice.clear();
        //then

        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(electricity);
        invoice.addItem(water);
        invoice.addItem(gaz);
        invoice.addItem(taxi);
        invoice.addItem(postServices);
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