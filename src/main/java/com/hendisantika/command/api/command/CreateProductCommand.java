package com.hendisantika.command.api.command;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample8
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/06/22
 * Time: 19.40
 */
@Data
@Builder
public class CreateProductCommand {
    @TargetAggregateIdentifier
    private String productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
