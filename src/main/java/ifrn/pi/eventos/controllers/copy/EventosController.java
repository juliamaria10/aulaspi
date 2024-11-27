package ifrn.pi.eventos.controllers.copy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {
	
@RequestMapping("/eventos/forms")
	public String form() {
		return "formEvento";
	}

}
