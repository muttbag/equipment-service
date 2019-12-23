package co.uk.dental.group.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("co.uk.dental.group.controller")
public class EquipmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquipmentServiceApplication.class, args);
	}

}
