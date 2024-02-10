package com.anil.it;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.type.AdjustableBasicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.it.entity.Address;
import com.anil.it.entity.Category;
import com.anil.it.entity.Laptops;
import com.anil.it.entity.Product;
import com.anil.it.entity.Student;
import com.anil.it.repo.AddressRepo;
import com.anil.it.repo.LaptopRepository;
import com.anil.it.repo.StudentRepo;

@SpringBootApplication
public class Application {
	
	@Autowired
	private static StudentRepo studentRepo;
	
	@Autowired
	private LaptopRepository laptopRepo;
	
	@Autowired
	private static AddressRepo addressRepo;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		StudentRepo strepo = ctxt.getBean(StudentRepo.class);
		LaptopRepository laprepo = ctxt.getBean(LaptopRepository.class);
		
		
		

		Product p1=new Product();
		p1.setPid("pid1");
		p1.setProductName("Iphone max");
	//	p1.setCategoryList(c);
		Product p2 = new Product();
		p2.setPid("pid2");
		p2.setProductName("Poco m6");
		Product p3 = new Product();
		p3.setPid("pid3");
		p3.setProductName("LG TV");
		Product p4 = new Product();
		p4.setPid("pid4");
		p4.setProductName("Samsung TV");
		
		Category c=new Category();
		c.setCid("cid1");
		c.setTitile("Electronics");
		c.setProductsList(Arrays.asList(p1,p2));
		
		
		
		
		
		
		
//		Student st=new Student();
//		st.setId(12);
//		st.setStudentName("Rahul");
//		st.setAbout("im a software developer");
//		
//		Laptops lp=new Laptops();
//		lp.setLaptopId(101);
//		lp.setLaptopBrand("Apple");
//		lp.setLaptopModel("Insperion mac");
//		
//		Address ad=new Address();
//		ad.setAddressId(200);
//		ad.setStreet("Sanahantuad");
//		ad.setCity("Banapur");
//		ad.setCountry("Odisha");
//		ad.setStudent(st);
//		Address ad2=new Address();
//		ad2.setAddressId(201);
//		ad2.setStreet("Badahantuad");
//		ad2.setCity("Banapur");
//		ad2.setCountry("Odisha");
//		ad2.setStudent(st);
//		//studentRepo.save(st); we can do
//		st.setAddressList(Arrays.asList(ad,ad2));
//		st.setLaptop(lp);
//		lp.setStudent(st);
		
//		
//		Student st11=strepo.findById(12).get();
//		System.out.println(st11.getStudentName());
//		List<Address> addressList = st11.getAddressList();
//		System.out.println(addressList);
//		//strepo.save(st);
		
//		Address address = addressRepo.findById(200).get();
//		System.out.println(address.getCountry());
//		System.out.println(address.getStudent().getStudentName());
//		
//		Optional<Student> findById2 = strepo.findById(12);
//		if(findById2.isPresent()) {
//			Student student2 = findById2.get();
//			System.out.println("student name: "+student2.getStudentName());
//			List<Address> addressList = student2.getAddressList();
//			System.out.println("student address: "+addressList);
//		}
//		else {
//			System.out.println("id is not present");
//		}
//		
		
		//in this way only student object will be save
		//so to solve we can individual create laptop repository then save or
		//we can use cascade type in that also be do the save
			
		//one to one mapping
//		System.out.println("============== one to one=========");
//		Student st2=strepo.findById(11).get();
//		System.out.println(st2.getStudentName());
//		Laptops laptop = st2.getLaptop();
//		System.out.println(laptop.getLaptopBrand());
//		System.out.println("--------------------------");
//		
//		System.out.println("through the laptop we can get the student name:::");
//		Optional<Laptops> findById = laprepo.findById(100);
//		if(findById.isPresent()) {
//			Laptops lps=findById.get();
//			System.out.println(lps.getLaptopBrand());
//			Student student = lps.getStudent();
//			System.out.println(student.getStudentName());
//		}else {
//	}

}
}