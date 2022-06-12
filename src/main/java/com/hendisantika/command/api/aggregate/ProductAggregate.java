package com.hendisantika.command.api.aggregate;

import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample8
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/06/22
 * Time: 19.39
 */
@Aggregate
public class ProductAggregate {

    @AggregateIdentifier
    private String productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
