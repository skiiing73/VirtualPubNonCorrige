package edu.usmb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarTest {
    @Test
    void testServiceBoissonNonDispo() {
        Bar bar = new Bar();
        assertNull(bar.serv("biere"));
    }

    @Test
    void testCategoryBoissonAdd() {
        Bar bar = new Bar();
        Boisson vin = new Boisson("vin",18.0f);
        bar.add(vin);
        assertNotNull(bar.boissonAlcoolisee);
    }
}