package com.example.mednotes2.Services;

import com.example.mednotes2.Model.*;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IDoctorLogicService {
    void addNewAdvice(String title , String content , Date data , int doctorPersonal);
    void deleteAdvice(String title , int doctorPersonalN);
    List<Advice> adviceExists(String title);
    DoctorEntity docEnt(int nrPersonal);
    List<Advice> allAdvices();
    List<Advice>adviceByDocName(String name , String surname);
    void addDiagnosis(int patientEntity, int doctorEntity, String treatmentName, String diseasesName, Date startDate, Date endDate);
    List<Diagnosis> getDiagnosisByPatient(int patId);
    void editTreatment(int diagnosisId , Date eD , String treatmenN ,int patID);
    Treatment getTreatment(int treatmentId , int patId);
    void deleteTreatment(Treatment t);
    Diseases getDiseases(int dID , int patId);
    void  deleteDiseases(Diseases d);
    List<Treatment> byDiagnosis(int id);
    List<Diseases> byDiagnosisd(int id);
    int totalAdvice();
    PatientEntity pat(int id);
    Optional<Diagnosis> exists(int dId);




}
