package del.ac.id.jpa;

import java.util.List;

import del.ac.id.jpa.model.Penerbangan;
import del.ac.id.jpa.model.Pesawat;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import del.ac.id.jpa.model.Role;
import del.ac.id.jpa.model.User;
import del.ac.id.jpa.repository.*;

import javax.servlet.http.HttpSession;

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
	public ModelAndView home(HttpSession session) {
//		List<Role> listRoles = roleRepository.findAll();
//		System.out.println(listRoles.size());
		if(session.getAttribute("user") != null){
			return new ModelAndView("redirect:/User");
		}
		ModelAndView mv = new ModelAndView("home");
		List<Pesawat> listpesawat = pesawatRepository.findAll();
		System.out.println("hallo");
		List<Penerbangan> listpenerbangan = penerbanganRepository.findAll();
		Pesawat pesawat = pesawatRepository.findById(3);
		System.out.println(pesawat.getJenis_pesawat());
		System.out.println("hallo");
		mv.addObject("listpesawat",listpesawat);
		mv.addObject("listpenerbangan",listpenerbangan);
		return mv;
//		mv.addObject("roles", listRoles);
//		mv.addObject("user", new User());
	}
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("user",new User());
		return mv;
	}
	@GetMapping("/logout")
		public RedirectView logout(HttpSession httpSession) {
		httpSession.removeAttribute("user");
			return new RedirectView("login");
		}
	@RequestMapping(value = "/login")
	public ModelAndView Signin(@ModelAttribute User user, BindingResult bindingResult, HttpSession httpSession) {
		User user1 = userRepository.findByUsername(user.getUsername());
		if(user1.getUsername() != ""){
			if(user1.getRoleid() == 1){
				httpSession.setAttribute("user",user1);
				return new ModelAndView("redirect:/Admin");
			}else if(user1.getRoleid() == 2){
				httpSession.setAttribute("user",user1);
				return new ModelAndView("redirect:/User");
			}
		}
		return new ModelAndView("redirect:/");
	}

}
