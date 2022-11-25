package com.example.makeupapi.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
    private Integer id;
    private String brand;
    private String name;
    private String price;
    private String price_sign;
    private String currency;
    private String image_link;
    private String product_link;
    private String website_link;
    private String description;
    private String rating;
    private String category;
    private String product_type;
    private List<String> tag_list;
    private String created_at;
    private String updated_at;
    private String product_api_url;
    private String api_featured_image;
    private List<ProductColors>product_colors;
}