package com.apimantisbugtracker.requests.usuarios;

import com.apimantisbugtracker.GlobalParameters;
import com.apimantisbugtracker.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetUsuarioRequest extends RequestRestBase {

    public GetUsuarioRequest() {
        requestService = "/api/rest/users/me";
        method = Method.GET;
        headers.put("Authorization", GlobalParameters.TOKEN);

    }
}
