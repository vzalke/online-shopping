package net.vpz.shoppingbackend.dao;

import java.util.List;

import net.vpz.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();
	
	Category get(int id);
	
}
