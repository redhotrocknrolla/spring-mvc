package web.controller;
import model.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(Model model,@RequestParam(defaultValue = "5")int count) {
        Service service = new Service();
        model.addAttribute("count",service.getAllCar(count));
        return "cars";
    }
}
