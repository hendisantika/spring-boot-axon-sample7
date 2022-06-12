package com.hendisantika.query.api.projection;

import com.hendisantika.command.api.data.Product;
import com.hendisantika.command.api.data.ProductRepository;
import com.hendisantika.command.api.model.ProductRestModel;
import com.hendisantika.query.api.query.GetProductsQuery;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample8
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/06/22
 * Time: 19.42
 */
@Component
public class ProductProjection {

    private final ProductRepository productRepository;

    public ProductProjection(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryHandler
    public List<ProductRestModel> handle(GetProductsQuery getProductsQuery) {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(product -> ProductRestModel
                        .builder()
                        .quantity(product.getQuantity())
                        .price(product.getPrice())
                        .name(product.getName())
                        .build())
                .collect(Collectors.toList());
    }
}
