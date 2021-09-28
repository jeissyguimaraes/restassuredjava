package com.apimantisbugtracker.requests.usuarios;

import com.apimantisbugtracker.GlobalParameters;
import com.apimantisbugtracker.bases.RequestRestBase;
import io.restassured.http.Method;

public class DelUsuarioRequest extends RequestRestBase {


    public DelUsuarioRequest(String user_id) {
        requestService = "/api/rest/users/"+user_id;
        method = Method.DELETE;
        headers.put("Authorization", GlobalParameters.TOKEN);

    }

}
