package com.hendisantika.command.api.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample8
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/06/22
 * Time: 19.37
 */
@Data
@Entity
public class Product {
    @Id
    private String productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
