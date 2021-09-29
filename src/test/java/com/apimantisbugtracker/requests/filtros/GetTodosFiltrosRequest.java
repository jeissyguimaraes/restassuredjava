package com.apimantisbugtracker.requests.filtros;

import com.apimantisbugtracker.GlobalParameters;
import com.apimantisbugtracker.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetTodosFiltrosRequest  extends RequestRestBase {

    public GetTodosFiltrosRequest() {
        requestService = "/api/rest/filters";
        method = Method.GET;
        headers.put("Authorization", GlobalParameters.TOKEN);

    }

}
