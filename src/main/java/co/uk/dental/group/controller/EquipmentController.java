package co.uk.dental.group.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EquipmentController {

    @GetMapping(value="/equipment", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return "Equipment list";
    }

}
