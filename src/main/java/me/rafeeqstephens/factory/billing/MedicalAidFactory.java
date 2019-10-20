package me.rafeeqstephens.factory.billing;

import me.rafeeqstephens.domain.billing.MedicalAid;

public class MedicalAidFactory {
    public static MedicalAid getMedicalAidNum(int medicalAidNum){
        return new MedicalAid.Builder().medicalAidNum(medicalAidNum).build();
    }
}
