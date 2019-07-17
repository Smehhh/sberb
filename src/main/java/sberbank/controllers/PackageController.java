package sberbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sberbank.entity.Package;
import sberbank.service.PackageService;
import sberbank.utils.ReadUtils;

@Controller
@RequestMapping("/")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @GetMapping
    public ModelAndView list() {
        return new ModelAndView("list", "parcels", packageService.list());
    }

    @GetMapping("/{id}")
    public ModelAndView index(Model model, @PathVariable Integer id) {
        Package p = packageService.get(id);
        if (p == null) {
            return new ModelAndView("list", HttpStatus.NOT_FOUND);
        }
        model.addAttribute("data", ReadUtils.filesReader(id));
        return new ModelAndView("info", "parcel", packageService.get(id));
    }
}
