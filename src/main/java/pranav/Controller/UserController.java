package pranav.Controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pranav.Model.User;
import pranav.Repository.Userrepository;

@Controller
@RequestMapping("")
public class UserController {
	
	@Autowired
	private Userrepository userrep;
	
	//CREATE NEW USER 
		@PostMapping("/createuser")
		public String createuser(@ModelAttribute("user") User user) {
                      this.userrep.save(user);			
			return "redirect:/getusers";
		}

	
	//READ ALL USERS
	@GetMapping("/getusers")
	public String getallusers(Model model) {
		List<User> userslist = this.userrep.findAll();
		model.addAttribute("users", userslist);
		return "Users.html";
	}
	
	//UPDATE USER BY ID 
		@RequestMapping("/update/{id}")
		public String updateuserbyid(@PathVariable String id ,Model model2) {
			int ids  = Integer.parseInt(id);
			model2.addAttribute("updateuser",this.userrep.findById(ids) );
			return "Updateuser.html";
		}
		

			@PostMapping("/updateuser/{ids}")
			public String updateeuser(String name ,String email,@PathVariable String ids) {
			int id = Integer.parseInt(ids);
				this.userrep.update(name ,email , id);			
				return "redirect:/getusers";
			}
	
		

	//DELETE USER BY ID 
	@RequestMapping("/delete/{id}")
	public String deleteuserbyid(@PathVariable String id) {
		int ids  = Integer.parseInt(id);
	    this.userrep.deleteById(ids);
		
		return "redirect:/getusers";
	}
	
	//SEARCH USER BY NAME
	@PostMapping("/searchuser")
	public String searchuser(Model model3, String searchtext) {
		System.out.println("search"+ searchtext);
		List<User> listuser = this.userrep.search(searchtext);
	    model3.addAttribute("users", listuser);
		
		return "Users.html";
	}
	
	
	//ANOTHER REQUEST MAPPINGS
	@RequestMapping("/Newuser")
	public String newuserpage() {
		return "redirect:Newuser.jsp";
}}