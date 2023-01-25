package com.ernestspringboot.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import location.Location;

@Service
public class LocationService {
	
	Location location1 = new Location("11", "BonnyVille");
	Location location2 = new Location("23", "Shaw Drive");
	Location location3 = new Location("17", "Brawn Close");
	
	
	List<Location> locations = new ArrayList<> (Arrays.asList(location1, location2, location3));
	
	public List<Location> getAllLocations(){
	
		return locations;
	}
	
	public Location getLocation(String id) {
		Location location = locations.stream()
				.filter(l -> id.equals(l.getId()))
				.findFirst()
				.orElse(null);
		
				return location;
	}

	public void addLocation(Location location) {
		locations.add(location);
	}

}
