package me.rafeeqstephens.domain.physio;

import me.rafeeqstephens.domain.access.Therapist;

public class PhysioTherapist extends Therapist {
    private String qualification;

    private PhysioTherapist(){}
    private PhysioTherapist(Builder builder){
        this.qualification = builder.qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public static class Builder{
        private String qualification;

        public Builder qualification(String qualification){
            this.qualification = qualification;
            return this;
        }

        public PhysioTherapist build(){
            return new PhysioTherapist(this);
        }
    }

    @Override
    public String toString() {
        return "PhysioTherapistController{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
