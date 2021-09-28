package com.apimantisbugtracker.requests.usuario;

import com.apimantisbugtracker.bases.RequestRestBase;
import io.restassured.http.Method;

public class DeleteUsuarioRequest extends RequestRestBase {


    public DeleteUsuarioRequest(String user_id) {
        requestService = "/api/rest/users/"+user_id;
        method = Method.DELETE;
        headers.put("Authorization", "VkbYeLKTAGyXZIDEs9FGcnNnwgck2FZV");

    }

}
