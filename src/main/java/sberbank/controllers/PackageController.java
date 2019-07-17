package sberbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sberbank.entity.Package;
import sberbank.service.PackageService;

import java.io.*;

@Controller
@RequestMapping("/packages")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @GetMapping
    public ModelAndView list() {
        return new ModelAndView("list", "parcels", packageService.list());

    }

    @GetMapping("/{id}")
    public ModelAndView index(Model model, @PathVariable Integer id)
    {
        String str;
        Package p = packageService.get(id);
        StringBuffer sBuffer = new StringBuffer("");

        if (p == null) {
            return new ModelAndView("list", HttpStatus.NOT_FOUND);
        }
        try (BufferedReader in = new BufferedReader(new FileReader("src/main/res/" + id + ".txt"))) {

            while ((str = in.readLine()) != null) {
               // System.out.println(str);//test
                sBuffer.append(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        model.addAttribute("data", sBuffer);
        //System.out.println("//////////////////////////////////////" + sBuffer.toString());//for tests
        return new ModelAndView("form", "parcel", packageService.get(id));
    }
}
