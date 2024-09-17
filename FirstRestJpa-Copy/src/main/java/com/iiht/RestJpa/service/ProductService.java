package com.iiht.RestJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.RestJpa.entity.Product;
import com.iiht.RestJpa.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	 ProductRepository repository ;
	
	public Product save(Product product)
	{
		return repository.save(product);
		

	}
	
	
	public List<Product> fetchAll()
	{
		return repository.findAll();
		
	}
	
	public  Product fetch(Long productId)
	{
		Optional <Product> optional = repository.findById(productId);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
	}
	
	
	
	public boolean removeById(Long productId)
	{
		Optional <Product> optional = repository.findById(productId);
		if(optional.isPresent())
		{
			 repository.deleteById(productId);
			 return true;
		}
		else
			return false;
	}
	
	
	
	public Product updateProduct(long id, Product p) {

		Optional<Product> op = repository.findById(id);

		if(op.isPresent()) {

			Product ex = op.get();

			ex.setDescription(p.getDescription());

			ex.setPrice(p.getPrice());

			return repository.save(ex);

		}

		else

			return null;

	}

}
