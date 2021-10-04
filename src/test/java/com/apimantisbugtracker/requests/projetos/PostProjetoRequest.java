package com.apimantisbugtracker.requests.projetos;

import com.apimantisbugtracker.GlobalParameters;
import com.apimantisbugtracker.bases.RequestRestBase;
import com.apimantisbugtracker.jsonObjects.BuscaDadosProjeto;
import com.apimantisbugtracker.jsonObjects.Status;
import com.apimantisbugtracker.jsonObjects.ViewState;
import io.restassured.http.Method;

public class PostProjetoRequest  extends RequestRestBase {


    public PostProjetoRequest() {
        requestService = "/api/rest/projects/";
        method = Method.POST;
        headers.put("Authorization", GlobalParameters.TOKEN);
        headers.put("Content-Type", "application/json");
    }

    public void setJsonBodyUsingJavaObject(BuscaDadosProjeto buscaDadosProjeto) {
        jsonBody = buscaDadosProjeto;
    }


}
