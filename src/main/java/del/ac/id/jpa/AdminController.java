package del.ac.id.jpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import del.ac.id.jpa.repository.LoginRepository;
import del.ac.id.jpa.repository.PemesananRepository;
import del.ac.id.jpa.repository.PenerbanganRepository;
import del.ac.id.jpa.repository.PesawatRepository;
import del.ac.id.jpa.repository.RoleRepository;
import del.ac.id.jpa.repository.TiketRepository;
import del.ac.id.jpa.repository.UserRepository;

@RestController
public class AdminController {
	private LoginRepository loginRepository;
	private PemesananRepository pemesananRepository;
	private PenerbanganRepository penerbanganRepository;
	private PesawatRepository pesawatRepository;
	private RoleRepository roleRepository;
	private TiketRepository tiketRepository;
	private UserRepository userRepository;
	public AdminController(LoginRepository loginRepository, PemesananRepository pemesananRepository,
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
	
	@GetMapping("/Admin")
	public ModelAndView admin() {
		ModelAndView mv = new ModelAndView("Admin/index");
		return mv;
	}
	@GetMapping("/Admin/Pemesanan")
	public ModelAndView pemesanan() {
		ModelAndView mv = new ModelAndView("Admin/pemesanan");
		return mv;
	}
	@GetMapping("/Admin/User")
	public ModelAndView user() {
		ModelAndView mv = new ModelAndView("Admin/user");
		return mv;
	}
	@GetMapping("/Admin/Pesawat")
	public ModelAndView pesawat() {
		ModelAndView mv = new ModelAndView("Admin/pesawat");
		return mv;
	}
	
	@GetMapping("/Admin/Penerbangan")
	public ModelAndView penerbangan() {
		ModelAndView mv = new ModelAndView("Admin/penerbangan");
		return mv;
	}
	

}
