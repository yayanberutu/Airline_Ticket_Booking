package del.ac.id.jpa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import del.ac.id.jpa.model.Login;
import del.ac.id.jpa.repository.LoginRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import del.ac.id.jpa.model.Role;
import del.ac.id.jpa.model.User;
import del.ac.id.jpa.repository.RoleRepository;
import del.ac.id.jpa.repository.UserRepository;

import javax.servlet.http.HttpSession;

@RestController
public class RegistrationController {
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private LoginRepository loginRepository;
	public RegistrationController(UserRepository userRepository, RoleRepository roleRepository,LoginRepository loginRepository) {
			this.userRepository = userRepository;
			this.roleRepository = roleRepository;
			this.loginRepository = loginRepository;
	}

	@GetMapping("/registration")
	public ModelAndView registration() {
		List<Role> listRoles = roleRepository.findAll();
		System.out.println(listRoles.size());
		ModelAndView mv = new ModelAndView("registration");
		mv.addObject("roles", listRoles);
		mv.addObject("user", new User());
		return mv;
	}

	@RequestMapping(value="/registration", method = RequestMethod.POST)
	public ModelAndView registrationSubmit(@ModelAttribute User user, BindingResult bindingResult
			, Model model, HttpSession session) {
		if (bindingResult.hasErrors()) {
			System.out.println("Error");
		}

		user.setRoleid(2);
		model.addAttribute("user", user);
		userRepository.save(user);
		String role = "/User";
		if(user.getRoleid() != 2) {
			//Tidak User
			role = "/";
		}
		session.setAttribute("user",user);
		ModelAndView mv = new ModelAndView("redirect:"+role);
		mv.addObject("user", user);
		return mv;
	}
}
