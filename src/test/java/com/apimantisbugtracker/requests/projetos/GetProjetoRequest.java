package com.apimantisbugtracker.requests.projetos;

import com.apimantisbugtracker.GlobalParameters;
import com.apimantisbugtracker.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetProjetoRequest extends RequestRestBase {

    public GetProjetoRequest(String project_id) {
        requestService = "/api/rest/projects/"+project_id;
        method = Method.GET;
        headers.put("Authorization", GlobalParameters.TOKEN);

    }

}
