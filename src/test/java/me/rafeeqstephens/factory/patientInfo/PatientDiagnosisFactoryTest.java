package me.rafeeqstephens.factory.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientDiagnosis;
import org.junit.Assert;
import org.junit.Test;

public class PatientDiagnosisFactoryTest {

    @Test
    public void getHospitalDiagnosed() {
        String code = "ADP 2";
        PatientDiagnosis i = PatientDiagnosisFactory.getHospitalDiagnosed(code);
        System.out.println(i);
        Assert.assertNotNull(i.getHospitalDiagnosed());
    }
}
