package com.wiley.realworldjava.more;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class CitiesController {

    private List<Destination> cities = new ArrayList<>();

    @GetMapping("/cities")
    public List<Destination> cities() {
       return cities;
    }

    @GetMapping("/citiesByState/{state}")
    public List<Destination> citiesByState(@PathVariable("state") String state) {
        return cities.stream()
                .filter(c -> c.state().equals(state))
                .toList();
    }

    @PostMapping("/add")
    public void add(@RequestParam(name="city") String city,
                      @RequestParam(name="state") String state) {
        cities.add(new Destination(city, state));

    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam(name="city") String city,
                    @RequestParam(name="state") String state) {
        Destination dest = new Destination(city, state);
        cities.remove(dest);
    }

}
