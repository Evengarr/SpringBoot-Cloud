package ru.geekbrains.order.requests;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.product.entity.ProductDto;
import ru.geekbrains.routinglib.request.ProductRequest;

@RequiredArgsConstructor
@RestController
@ComponentScan("ru.geekbrains")
@RequestMapping("api/v1/orders")
public class RequestController {
    private final ProductRequest productRequest;

    @GetMapping("/requestProductList")
    Page<ProductDto> findAllProducts(@RequestParam MultiValueMap<String, String> params, @RequestParam(name = "p", defaultValue = "1") Integer page){
        return productRequest.findAllProducts(params, page);
    }

    @GetMapping("/{id}")
    public ProductDto findProductById(@PathVariable Long id){
        return productRequest.findProductById(id);
    }
}
