package me.rafeeqstephens.controller.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientDiagnosis;
import me.rafeeqstephens.service.patientInfo.PatientDiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/patientDiagnosis")
public class PatientDiagnosisController {

    @Autowired

    private PatientDiagnosisService patientDiagnosisService;

    @PostMapping("/create")
    @ResponseBody
    public PatientDiagnosis create(PatientDiagnosis patientDiagnosis) {
        return patientDiagnosisService.create(patientDiagnosis);
    }

    @PostMapping("/update")
    @ResponseBody
    public PatientDiagnosis update(PatientDiagnosis patientDiagnosis) {
        return patientDiagnosisService.update(patientDiagnosis);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        patientDiagnosisService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PatientDiagnosis read(@PathVariable String id) {
        return patientDiagnosisService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PatientDiagnosis> getAll() {
        return patientDiagnosisService.getAll();
    }
}
