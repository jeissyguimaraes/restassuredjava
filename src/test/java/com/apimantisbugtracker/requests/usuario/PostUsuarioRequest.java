package com.apimantisbugtracker.requests.usuario;

import com.apimantisbugtracker.bases.RequestRestBase;
import com.apimantisbugtracker.jsonObjects.usuario.BuscaDadosUsuario;
import io.restassured.http.Method;

public class PostUsuarioRequest extends RequestRestBase {


    public PostUsuarioRequest() {
        requestService = "/api/rest/users/";
        method = Method.POST;
        headers.put("Authorization", "VkbYeLKTAGyXZIDEs9FGcnNnwgck2FZV");
        headers.put("Content-Type", "application/json");
    }

    public void setJsonBodyUsingJavaObject(BuscaDadosUsuario buscaDadosUsuario) {
        jsonBody = buscaDadosUsuario;
    }



}
