package com.jayantrai.location.Controller;


import com.jayantrai.location.Model.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

        @GetMapping("/locations")
        public List<Location> getLocations() {

            List<Location> locationList = new ArrayList<>();

            Location l1 = new Location("900", "111 Lida Ct", 32.01, -123);
            Location l2 = new Location("800", "724 Elm St", 12.23, -145);
            Location l3 = new Location("700", "321 Prince St", 56.90, -100);

            locationList.add(l1);
            locationList.add(l2);
            locationList.add(l3);


            return locationList;
        }
    }

