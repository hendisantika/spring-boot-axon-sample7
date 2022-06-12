package com.hendisantika.command.api.data;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample8
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/06/22
 * Time: 19.38
 */
public interface ProductRepository extends JpaRepository<Product, String> {
}
