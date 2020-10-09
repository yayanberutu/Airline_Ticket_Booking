package del.ac.id.jpa;

import del.ac.id.jpa.model.Pemesanan;
import del.ac.id.jpa.model.Penerbangan;
import del.ac.id.jpa.model.Pesawat;
import del.ac.id.jpa.model.User;
import del.ac.id.jpa.repository.*;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class PemesananController {
    private LoginRepository loginRepository;
    private PemesananRepository pemesananRepository;
    private PenerbanganRepository penerbanganRepository;
    private PesawatRepository pesawatRepository;
    private RoleRepository roleRepository;
    private TiketRepository tiketRepository;
    private UserRepository userRepository;

    public PemesananController(LoginRepository loginRepository, PemesananRepository pemesananRepository,
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

    @GetMapping("/User")
    public ModelAndView User(HttpSession session){
        if(session.getAttribute("user") == null){
            return new ModelAndView("redirect:/");
        }
        ModelAndView mv  =  new ModelAndView("User/index");

        List<Penerbangan> listpenerbangan = penerbanganRepository.findAll();

        List<Pesawat> listpesawat = pesawatRepository.findAll();
        System.out.println("hallo");
        mv.addObject("listpesawat",listpesawat);
        mv.addObject("listpenerbangan",listpenerbangan);
        return mv;
    }
    @GetMapping("/pesan/{id}")
    public ModelAndView Pesan(@PathVariable("id") int id, Model model, HttpSession session){
        Penerbangan penerbangan = penerbanganRepository.findById(id);
        ModelAndView mv = new ModelAndView("User/pesanan");
        System.out.println(session.getAttribute("user"));
        model.addAttribute("user",session.getAttribute("user"));
        mv.addObject("penerbangan",penerbangan);
        mv.addObject("pemesanan",new Pemesanan());
        return mv;
    }
    @PostMapping("/pesananku")
    public String Pesananku(@ModelAttribute Penerbangan penerbangan, @ModelAttribute("user") User user, @ModelAttribute Pemesanan pemesanan){
        System.out.println(penerbangan.getId_penerbangan());
        System.out.println(user.getUsername());
        System.out.println(pemesanan.getTelepon()+" "+pemesanan.getEmail());
        return "hello";
    }
}
