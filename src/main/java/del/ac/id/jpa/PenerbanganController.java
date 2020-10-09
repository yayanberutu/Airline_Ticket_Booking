package del.ac.id.jpa;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import del.ac.id.jpa.model.Penerbangan;
import del.ac.id.jpa.model.User;
import del.ac.id.jpa.repository.*;

@RestController
public class PenerbanganController {
	private PenerbanganRepository penerbanganRepository;
	
	

	public PenerbanganController(PenerbanganRepository penerbanganRepository) {
		this.penerbanganRepository = penerbanganRepository;
	}
	
	
	@GetMapping("/Penerbangan/Delete/{id}")
	@ResponseBody
	public RedirectView delete_user(@PathVariable Integer id) {
		penerbanganRepository.deleteById(id);
		return new RedirectView("/Admin/Penerbangan");
	}
	@GetMapping("/Penerbangan/Form")
	public ModelAndView showForm() {
		ModelAndView mv = new ModelAndView("Admin/penerbangan_tambah");
		mv.addObject("penerbangan", new Penerbangan());
		return mv;
	}
	
	@RequestMapping(value="/Penerbangan/Form", method = RequestMethod.POST)
	public RedirectView formSubmit(@ModelAttribute Penerbangan penerbangan, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			System.out.println("Error");
		}
		System.out.println(penerbangan.getTanggal());
		model.addAttribute("penerbangan", penerbangan);
		penerbanganRepository.save(penerbangan);
		
		return new RedirectView("/Admin/Penerbangan");
	}


	
}
