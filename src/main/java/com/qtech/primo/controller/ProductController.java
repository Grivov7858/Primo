package com.qtech.primo.controller;

import com.qtech.primo.model.request.ProductRequest;
import com.qtech.primo.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
@Api(value = "Product Controller | Allows saving new product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "Create | Product json")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success", response = ProductRequest.class),
            @ApiResponse(code = 400, message = "Bad Request - You might forgot a parameter", response = ProductRequest.class),
            @ApiResponse(code = 404, message = "Not found", response = ProductRequest.class),
            @ApiResponse(code = 500, message = "Error - A wide range of causes, check logs", response = ProductRequest.class)})
    @PostMapping(value = "/create")
    public void createNewProduct(@RequestBody ProductRequest productRequest) {
        productService.createNewProduct(productRequest);
    }

    //getProductById
    //getAllProducts
}
