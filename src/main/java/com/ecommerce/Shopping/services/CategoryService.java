package com.ecommerce.Shopping.services;


import com.ecommerce.Shopping.entities.Category;
import com.ecommerce.Shopping.payloads.CategoryDTO;
import com.ecommerce.Shopping.payloads.CategoryResponse;

public interface CategoryService {

	CategoryDTO createCategory(Category category);

	CategoryResponse getCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

	CategoryDTO updateCategory(Category category, Long categoryId);

	String deleteCategory(Long categoryId);
}