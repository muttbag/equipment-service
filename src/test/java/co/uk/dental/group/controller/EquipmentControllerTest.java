package co.uk.dental.group.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquipmentControllerTest {

    @Test
    public void testController(){
        EquipmentController testClass = new EquipmentController();

        Assertions.assertEquals("Equipment list", testClass.test());
    }
}
