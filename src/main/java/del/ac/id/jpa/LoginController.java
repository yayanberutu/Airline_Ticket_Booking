package del.ac.id.jpa;

import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import del.ac.id.jpa.model.Role;
import del.ac.id.jpa.model.User;
import del.ac.id.jpa.repository.*;

@RestController
public class LoginController {
	private LoginRepository loginRepository;
	private PemesananRepository pemesananRepository;
	private PenerbanganRepository penerbanganRepository;
	private PesawatRepository pesawatRepository;
	private RoleRepository roleRepository;
	private TiketRepository tiketRepository;
	private UserRepository userRepository;
	
	public LoginController(LoginRepository loginRepository, PemesananRepository pemesananRepository,
			PenerbanganRepository penerbanganRepository, PesawatRepository pesawatRepository,
			RoleRepository roleRepository, TiketRepository tiketRepository, UserRepository userRepository) {
		this.loginRepository = loginRepository;
		this.pemesananRepository = pemesananRepository;
		this.penerbanganRepository = penerbanganRepository;
		this.pesawatRepository = pesawatRepository;
		this.roleRepository = roleRepository;
		this.tiketRepository = tiketRepository;
		this.userRepository = userRepository;
	}
	
	@GetMapping("/")
	public ModelAndView registration() {
//		List<Role> listRoles = roleRepository.findAll();
//		System.out.println(listRoles.size());
		ModelAndView mv = new ModelAndView("Admin/index");
//		mv.addObject("roles", listRoles);
//		mv.addObject("user", new User());
		return mv;
	}
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@GetMapping("/logout")
		public RedirectView logout() {

			return new RedirectView("login");
		}
	
	@RequestMapping("/login")
	public ModelAndView Signin(@ModelAttribute User user, BindingResult bindingResult) {
		
	}
	


}
