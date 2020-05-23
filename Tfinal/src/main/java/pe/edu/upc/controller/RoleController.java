package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.entity.Role;
import pe.edu.upc.serviceinterface.RoleService;

@Controller
@RequestMapping("/roles")
public class RoleController {
	@Autowired
	private RoleService rS;

	@GetMapping("/new")
	public String newCategory(Model model) {
		model.addAttribute("role", new Role());
		return "role/role";

	}

	@PostMapping("/save")
	public String saveCategory(@Validated Role role, BindingResult result, Model model) throws Exception {
		if (result.hasErrors()) {
			return "role/role";
		} else {
			rS.insert(role);
			model.addAttribute("listRoles", rS.list());
			return "role/listRoles";
		}

	}

	@GetMapping("/list")
	public String listCategories(Model model) {
		try {
			model.addAttribute("listRoles", rS.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "role/listRoles";

	}
}
