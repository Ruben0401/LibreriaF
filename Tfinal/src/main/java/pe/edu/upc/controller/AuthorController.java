package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.entity.Author;
import pe.edu.upc.serviceinterface.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {
	@Autowired
	private AuthorService aS;

	@GetMapping("/new")
	public String newCategory(Model model) {
		model.addAttribute("author", new Author());
		return "author/author";

	}

	@PostMapping("/save")
	public String saveCategory(@Validated Author author, BindingResult result, Model model) throws Exception {
		if (result.hasErrors()) {
			return "author/author";
		} else {
			aS.insert(author);
			model.addAttribute("listAuthor", aS.list());
			return "author/listAuthor";
		}

	}

	@GetMapping("/list")
	public String listCategories(Model model) {
		try {
			model.addAttribute("listAuthor", aS.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "role/listAuthor";

	}
}
