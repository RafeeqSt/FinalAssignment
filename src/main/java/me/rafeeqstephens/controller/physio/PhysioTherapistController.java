package me.rafeeqstephens.controller.physio;
import me.rafeeqstephens.domain.Physiotherapist;
import me.rafeeqstephens.service.physio.PhysioTherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/physio")
@CrossOrigin(origins = "http://localhost:4200")
public class PhysioTherapistController {

    @Autowired
    private PhysioTherapistService physioTherapistService;

    @PostMapping("/create")
    public Physiotherapist create(@RequestBody Physiotherapist physioTherapist) {
        return physioTherapistService.create(physioTherapist);
    }

    @PutMapping("/update")
    public Physiotherapist update(@RequestBody Physiotherapist physioTherapist) {
        return physioTherapistService.update(physioTherapist);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        physioTherapistService.delete(id);

    }

    @GetMapping("/read/{id}")
    public Physiotherapist read(@PathVariable String id) {
        return physioTherapistService.read(id);
    }

    @GetMapping("/getall")
    public Set<Physiotherapist> getAll() {
        return physioTherapistService.getAll();
    }
}
