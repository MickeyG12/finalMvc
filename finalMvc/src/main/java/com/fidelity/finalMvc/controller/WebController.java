/**
 * 
 */
package com.fidelity.finalMvc.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fidelity.finalMvc.entities.Song;


@Controller
public class WebController {
	
	

	@RequestMapping(value = "/index")
	public String index(Model model) {
		
		Song  cancion= new Song(01L,"Mi favorita","3.00","Rock");
		Song cancion2 = new Song(012L,"Mi favorita2","4.00","Rock");
		Song cancion3 = new Song(03L,"Mi favorita3","5.00","Rock");
		
		
		List<Song> Songs = new ArrayList<>();
		Songs.add(cancion);
		Songs.add(cancion2);
		Songs.add(cancion3);
		
		model.addAttribute("songs", Songs);
		
		return "index";
	}
	

}
