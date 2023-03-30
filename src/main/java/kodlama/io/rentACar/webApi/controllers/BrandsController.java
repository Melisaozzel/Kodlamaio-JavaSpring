package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController
@RequestMapping("/api/brands") //Controllera erişmek için gereken anatasyon
public class BrandsController {

	private BrandService brandService;

	@Autowired // Parametrelerine bak = brandservice => brandmanager brandservice implement ediyor, new'leyip ver 
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
     @GetMapping()
	public List<GetAllBrandsResponse> getAll()
	{
		return brandService.getAll();
	}
	
     @GetMapping("/{id}")
 	public GetByIdBrandResponse getById(@PathVariable int id)
 	{
 		return brandService.getById(id);
 	}
 	

	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@RequestBody() CreateBrandRequest createBrandRequest)
	{
		 this.brandService.add(createBrandRequest);
	}
	 
	@PutMapping()
	public void update(@RequestBody() UpdateBrandRequest updatebrandRequest)
	{
		this.brandService.update(updatebrandRequest);
	}

	@DeleteMapping({"/id"})
	public void delete(@PathVariable int id)
	{
		this.brandService.delete(id);
	}
	
}
