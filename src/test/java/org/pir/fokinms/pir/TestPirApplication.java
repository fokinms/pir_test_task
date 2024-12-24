package org.pir.fokinms.pir;

import org.springframework.boot.SpringApplication;

public class TestPirApplication {

    public static void main(String[] args) {
        SpringApplication.from(PirApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
