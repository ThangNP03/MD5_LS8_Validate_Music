package ra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ra.model.Music;
import ra.service.IMusicService;

@Controller
public class MusicController {
    @Autowired
    private IMusicService musicService;
    @GetMapping("/")
    public ModelAndView showIndex(){
        musicService.findAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("music", new Music());
        return modelAndView;
    }
    @PostMapping("create")
    public String create (@Validated @ModelAttribute("message") Music music, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            return "index";
        }
        musicService.save(music);
        model.addAttribute("music", music);
        return "result";
    }
}
