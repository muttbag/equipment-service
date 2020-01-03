package co.uk.dental.group.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class EquipmentServiceExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    protected ResponseEntity<EquipmentServiceErrorResponse> handleUnexpectedExceptions(Exception ex) {

        final HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

        EquipmentServiceErrorResponse response = new EquipmentServiceErrorResponse();
        response.setMessage(ex.getMessage());
        response.setStatus(httpStatus.value());
        response.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(response, httpStatus);
    }

}
