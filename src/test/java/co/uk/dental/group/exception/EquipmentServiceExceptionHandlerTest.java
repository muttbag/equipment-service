package co.uk.dental.group.exception;

import co.uk.dental.group.common.CamelCaseDisplayNameGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(CamelCaseDisplayNameGenerator.class)
public class EquipmentServiceExceptionHandlerTest {

    private static final EquipmentServiceExceptionHandler TEST_CLASS = new EquipmentServiceExceptionHandler();
    private static final String EXCEPTION_MESSAGE = "An exception has occurred";

    @Test
    public void testGeneralErrorResponseIsGenerated() {

        final ResponseEntity result = TEST_CLASS.handleUnexpectedExceptions(new Exception(EXCEPTION_MESSAGE));

        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, result.getStatusCode());

        EquipmentServiceErrorResponse equipmentServiceErrorResponse = (EquipmentServiceErrorResponse) result.getBody();

        assertEquals(EXCEPTION_MESSAGE, equipmentServiceErrorResponse.getMessage());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR.value(), equipmentServiceErrorResponse.getStatus());
        assertTrue(equipmentServiceErrorResponse.getTimeStamp() < System.currentTimeMillis());
    }
}
