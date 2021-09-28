package com.apimantisbugtracker.requests.usuarios;

import com.apimantisbugtracker.GlobalParameters;
import com.apimantisbugtracker.bases.RequestRestBase;
import com.apimantisbugtracker.jsonObjects.BuscaDadosUsuario;
import io.restassured.http.Method;

public class PostUsuarioRequest extends RequestRestBase {


    public PostUsuarioRequest() {
        requestService = "/api/rest/users/";
        method = Method.POST;
        headers.put("Authorization", GlobalParameters.TOKEN);
        headers.put("Content-Type", "application/json");
    }

    public void setJsonBodyUsingJavaObject(BuscaDadosUsuario buscaDadosUsuario) {
        jsonBody = buscaDadosUsuario;
    }



}
