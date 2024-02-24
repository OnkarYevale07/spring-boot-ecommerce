package com.ecommerce.ecommerce.service;

import java.util.List;
import java.util.Optional;
import com.ecommerce.ecommerce.entity.Category;

public interface CategoryService {

    public void addCategory(Category category);

    public List<Category> getAllCategories();

    public void removeCategoryById(int id);

    public Optional<Category> getCategoryById(int id);
}
