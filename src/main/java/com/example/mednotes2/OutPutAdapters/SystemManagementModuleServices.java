package com.example.mednotes2.OutPutAdapters;

import com.example.mednotes2.Helpers.DoctorHelper;
import com.example.mednotes2.Helpers.PatientHelper;
import com.example.mednotes2.Model.DoctorEntity;
import com.example.mednotes2.Model.PatientEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class SystemManagementModuleServices implements ISystemManagementServices{
    public PatientEntity pacientiE(int nrPersonal){
        RestTemplate restTemplate = new RestTemplate();
        String userServiceUrl="http://localhost:8090/api/systemManagement/admin/PatientByPersonal/"+nrPersonal;
        ResponseEntity<PatientHelper> responseEntity = restTemplate.getForEntity(userServiceUrl , PatientHelper.class );
        String emri = responseEntity.getBody().getName();
        String mbiemri = responseEntity.getBody().getSurname();
        int nrpersonal2 = nrPersonal;

        return new PatientEntity(emri,mbiemri,nrpersonal2);
    }

    public DoctorEntity doctoriE(int doctorPersonalNumber){
        RestTemplate restTemplate = new RestTemplate();
        String userServiceUrl="http://localhost:8090/api/systemManagement/admin/DoctortByPersonal/"+doctorPersonalNumber;
        ResponseEntity<DoctorHelper> responseEntity = restTemplate.getForEntity(userServiceUrl , DoctorHelper.class );
        String emri = responseEntity.getBody().getDoctorName();
        String mbiemri = responseEntity.getBody().getDoctorSurname();
        int nrpersonal3 = doctorPersonalNumber;

        return new DoctorEntity(emri,mbiemri,nrpersonal3);
    }
}
