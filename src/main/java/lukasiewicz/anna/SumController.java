package lukasiewicz.anna;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Controller
public class SumController implements WebMvcConfigurer {



	@GetMapping("/")
	public String showForm(NumbersForm numbersForm) {
		return "form";
		
	}
	

	@PostMapping("/")
	public String checkPersonInfo(@Valid NumbersForm numbersForm, BindingResult bindingResult,HttpServletRequest request, HttpServletResponse response, ModelMap model) {

		if (bindingResult.hasErrors()) {
			return "form";
		}
		Double num1 = Double.parseDouble(request.getParameter("num1"));
		Double num2 = Double.parseDouble(request.getParameter("num2"));
		
		Double sum = num1 + num2;
	
		
		/*
		 * ModelAndView mv = new ModelAndView(); mv.setViewName("result");
		 * Map<String,Integer> map = new TreeMap<>(); map.put("sum",sum);
		 * map.put("num1",num1); map.put("num2", num2);
		 * 
		 * 
		 * mv.addAllObjects(map);
		 */
		 
		 model.addAttribute("sum",sum);
		 model.addAttribute("num1",num1);
		 model.addAttribute("num2", num2);
		 
		return "results";
	}


}

	 
