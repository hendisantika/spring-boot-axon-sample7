package com.hendisantika.command.api.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample8
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/06/22
 * Time: 19.41
 */
@RestController
@RequestMapping("/products")
public class ProductCommandController {

    private final CommandGateway commandGateway;

    public ProductCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }
}
