package me.rafeeqstephens.controller.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientProgress;
import me.rafeeqstephens.service.patientInfo.PatientProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/patientProgress")
public class PatientProgressController {

    @Autowired
    private PatientProgressService patientProgressService;

    @PostMapping("/create")
    @ResponseBody
    public PatientProgress create(PatientProgress patientProgress) {
        return patientProgressService.create(patientProgress);
    }

    @PostMapping("/update")
    @ResponseBody
    public PatientProgress update(PatientProgress patientProgress) {
        return patientProgressService.update(patientProgress);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        patientProgressService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PatientProgress read(@PathVariable String id) {
        return patientProgressService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PatientProgress> getAll() {
        return patientProgressService.getAll();
    }
}
