package me.rafeeqstephens.controller.occupational;


import me.rafeeqstephens.domain.Booking;
import me.rafeeqstephens.service.occupational.OTBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/booking")
@CrossOrigin(origins = "http://localhost:4200")
public class OTBookingController {

    @Autowired
    private OTBookingService otBookingService;

    @PostMapping("/create")
    public Booking create(@RequestBody Booking otBooking) {
        return otBookingService.create(otBooking);
    }

    @PutMapping("/update")
    public Booking update(@RequestBody Booking otBooking) {
        return otBookingService.update(otBooking);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        otBookingService.delete(id);

    }

    @GetMapping("/read/{id}")
    public Booking read(@PathVariable String id) {
        return otBookingService.read(id);
    }

    @GetMapping("/getall")
    public Set<Booking> getAll() {
        return otBookingService.getAll();
    }
}
