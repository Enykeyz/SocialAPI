package com.ernestspringboot.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import location.Location;

	
	
	@RestController
	public class LocationController {
	
		@Autowired
		private LocationService locationService;
		
		@GetMapping(value = "/locations")
		public List<Location> getAllLocations(){
			return locationService.getAllLocations();
		}
		
		@GetMapping(value = "/locations/{id}")
		public Location getLocation(@PathVariable String id) {
			return locationService.getLocation(id);
		}
		
		@PostMapping(value = "/locations")
		public void addLocation(@RequestBody Location location) {
			locationService.addLocation(location);
		}
	
}
