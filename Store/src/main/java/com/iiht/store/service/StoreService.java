package com.iiht.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.store.entity.Apple;
import com.iiht.store.entity.Bread;
import com.iiht.store.entity.Chocolate;
import com.iiht.store.entity.Egg;
import com.iiht.store.entity.Milk;
import com.iiht.store.repository.AppleRepository;
import com.iiht.store.repository.BreadRepository;
import com.iiht.store.repository.ChocolateRepository;
import com.iiht.store.repository.EggRepository;
import com.iiht.store.repository.MilkRepository;

@Service
public class StoreService {
	
	@Autowired
	EggRepository eggRepo;
	
	@Autowired
	MilkRepository milkRepo;
	
	@Autowired
	ChocolateRepository chocolateRepository;
	
	@Autowired
	AppleRepository appleRepository;
	
	@Autowired
	BreadRepository breadRepository;
	
	
//Egg class Implementation
	
	public Egg createEgg(Egg e1)
	{
		return eggRepo.save(e1);
	}
	
	public List<Egg> getAllEggs()
	{
		return eggRepo.findAll();
	}
	
	
//Milk Class  Service Implementation
	
	public Milk createMilk(Milk m1)
	{
		return milkRepo.save(m1);
	}
	
	public List<Milk> getAllMilk()
	{
		return milkRepo.findAll();
	}

	
// Chocolate class implemetations
	public Chocolate createChocolate(Chocolate c1)
	{
		return chocolateRepository.save(c1);
	}
	
	public List<Chocolate> getAllChocolate()
	{
		return chocolateRepository.findAll();
	}

// Apple Class Implementation
	
	public Apple createApple(Apple a1)
	{
		return appleRepository.save(a1);
	}
	
	public List<Apple> getAllApple()
	{
		return appleRepository.findAll();
	}

	
// Bread Class Implementations
	
	public Bread createBread(Bread b1)
	{
		return breadRepository.save(b1);
	}
	
	public List<Bread> getAllBread()
	{
		return breadRepository.findAll();
	}
}
