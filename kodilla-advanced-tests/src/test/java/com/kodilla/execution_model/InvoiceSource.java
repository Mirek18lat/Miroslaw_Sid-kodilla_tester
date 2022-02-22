package com.kodilla.execution_model;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class InvoiceSource {
    static Stream<Arguments> provideStringsForTestingInvoice() {
        return  Stream.of(
                Arguments.of("Electricity", 2000.00),
                Arguments.of("Water", 500.00),
                Arguments.of("Gaz", 500.00),
                Arguments.of("Taxi", 700.00),
                Arguments.of("Post Services", 200.00)
        );
    }

}
