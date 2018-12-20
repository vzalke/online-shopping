package net.vpz.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.vpz.shoppingbackend.dao.CategoryDAO;
import net.vpz.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
private static	List<Category> categories = new ArrayList<>();

static
{
	Category category = new Category();
	category.setId(1);
	category.setName("Television");
	category.setDescription("Describe Television");
	category.setImageURL("CAT_1.png");
	
	categories.add(category);

    category = new Category();
	category.setId(2);
	category.setName("Mobile");
	category.setDescription("Describe Mobile");
	category.setImageURL("CAT_2.png");
	
	categories.add(category);
	
	
	category = new Category();
	category.setId(3);
	category.setName("Laptop");
	category.setDescription("Describe Laptop");
	category.setImageURL("CAT_3.png");
	
	categories.add(category);



}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
