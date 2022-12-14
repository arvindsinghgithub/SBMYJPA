package com.Arvind.MySqlJPA.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Arvind.MySqlJPA.DAO.LoginJPAReposDAO;
import com.Arvind.MySqlJPA.DAO.LoginReposDAO;
import com.Arvind.MySqlJPA.Model.LoginId;

//@RequestMapping("/api/v1")
//@RequestMapping(value= {"/api/v1" ,"/home"})
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = {"http://localhost:4200" , "http://localhost:8040"} )
//@CrossOrigin(origins = {"http://localhost:4200" , "http://localhost:8080"} )
@Controller //@RestController- if we will mention here then "ResponseBody" not required 	
public class SqlJPAController
{	
	@Autowired
	LoginReposDAO reposdao;
	
	@Autowired
	LoginJPAReposDAO jpa_Reposdao2;
	
	@RequestMapping("/home")	
	public String home()
	{
		return "home.jsp";
	}	
	
	@RequestMapping("/addusers")
	public String Addusers(LoginId logid)
	{
		System.out.println(" this is cintroller ");		
		reposdao.save(logid);		
		return "home.jsp";
	}
	
	public LoginReposDAO getReposdao() {
		return reposdao;
	}

	public void setReposdao(LoginReposDAO reposdao) {
		this.reposdao = reposdao;
	}

	

	@RequestMapping("/getUserData")	
	public ModelAndView getUserData(@RequestParam int lanid)
	{
		
		  ModelAndView mv = new ModelAndView("getUserData.jsp"); 
		  LoginId lanid2 =  reposdao.findById(lanid).orElse(new LoginId());		 
		
		 // System.out.println("mail id="+lanid2.getEmailid()+"=LanId==="+lanid2.getLanid());
		 
//		  mv.addObject(lanid2);
		  mv.addObject("lanid2", lanid2);
		   
		  return mv;
	
	}

	@RequestMapping("/getUserDataByLoginId")	
	public ModelAndView getUserDataByLoginId(@RequestParam int lanid)
	{
		
		  ModelAndView mv = new ModelAndView("getUserDataByLoginId.jsp"); 
		  Iterable<LoginId> data=reposdao.findAll();		  
		  List<LoginId> list=new ArrayList<>();		  
		  data.forEach(item->{ list.add(item); });		  
		  list.forEach(item->System.out.println(item));

//		  mv.addObject(lanid2);
		  mv.addObject("lanid2", list);
		   
		  return mv;	
	}
	@RequestMapping("/findByEmailID")	
	public ModelAndView findByEmailID(@RequestParam int lanid)
	{		
		  ModelAndView mv = new ModelAndView("findByEmailID.jsp"); 
			/*
			 * Iterable<LoginId> data=reposdao.findAll(); List<LoginId> list=new
			 * ArrayList<>(); data.forEach(item->{ list.add(item); });
			 * list.forEach(item->System.out.println(item));
			 */
		  LoginId lanid2 =  reposdao.findById(lanid).orElse(new LoginId());	
		  
		  System.out.println(" # findByEmailid=="+reposdao.findByEmailid("arvind2@gmail.com"));
		  System.out.println(" # findByLanidGreaterThan="+reposdao.findByLanidGreaterThan(lanid));		  
		 // System.out.println("#Sorted vaule with query="+reposdao.findByEmailidSorted("vendor@gmail.com"));		  
		  mv.addObject("lanid3", lanid2);		   
		  return mv;	
	}
	
	//rest examples
	@RequestMapping("/restDataAll")    
	@ResponseBody
	public String getAllRestData()   		
	{		
		return reposdao.findAll().toString();  
	}
	//rest examples
	@RequestMapping("/restDataById/{lanid}")
	@ResponseBody
	public String getAllRestDataById(@PathVariable("lanid") int lanid)   
	{
		return reposdao.findById(lanid).toString();
	}
	
	//rest examples and JSON data postman
	@RequestMapping(path="/restJSONDataAll", produces = {"application/json"})    
	@ResponseBody
	public List<LoginId> getAllRestJSONData()   		
	{		
		return jpa_Reposdao2.findAll();  
	}
	//rest examples
	@RequestMapping("/restJSONDataById/{lanid}")		
	//@RequestMapping(path = "/restJSONDataById/{lanid}" , produces = {"application/xml"}) //restricting data in JSON with Rest API in postman
	@ResponseBody
	public Optional<LoginId> getAllRestJSONDataById(@PathVariable("lanid") int lanid)   
	{
		return jpa_Reposdao2.findById(lanid);
	}
	
	@PostMapping("/addLanid")   // REST Post Example #save/insert in db
	//@PostMapping(path = "/addLanid" ,consumes = {"application/json"})  //here server accept(consume) data only in JSON format
	@ResponseBody
	 //public LoginId addLanid(LoginId lanid) //post data from "form-data" postman
	public LoginId addLanid(@RequestBody LoginId lanid)  // post data from "raw" by body postman
	 {
		jpa_Reposdao2.save(lanid);
		 return lanid;
	 }
	
	//delete by postman rest api	
	@DeleteMapping("/deleterestDataById/{lanid}")
	@ResponseBody
	public String deleterestDataById(@PathVariable("lanid") int lanid)   
	{
		LoginId a = jpa_Reposdao2.getOne(lanid);		
		jpa_Reposdao2.delete(a);
		return "data deleted of lan id= "+lanid;
	}
	//update=PUT bypostman rest api
	@PutMapping(path = "/updateorSaveRestDataById/{lanid}" , consumes = {"application/json"})
	@ResponseBody
	public LoginId updateorSaveRestDataById(@RequestBody LoginId lanid)   
	{			
		jpa_Reposdao2.save(lanid);
		return lanid;
	}
	
}

















