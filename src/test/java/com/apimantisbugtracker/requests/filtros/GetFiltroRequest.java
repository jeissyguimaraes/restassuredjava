package com.apimantisbugtracker.requests.filtros;

import com.apimantisbugtracker.GlobalParameters;
import com.apimantisbugtracker.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetFiltroRequest  extends RequestRestBase {

    public GetFiltroRequest(String filter_id) {
        requestService = "/api/rest/filters/"+filter_id;
        method = Method.GET;
        headers.put("Authorization", GlobalParameters.TOKEN);

    }

}
