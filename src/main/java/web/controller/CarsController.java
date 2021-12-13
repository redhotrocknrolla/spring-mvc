package web.controller;
import org.springframework.context.annotation.ComponentScan;
import service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String printCars(Model model,@RequestParam(defaultValue = "5")int car) {
        model.addAttribute("cars",carService.addCar(car));
        return "cars";
    }
}
