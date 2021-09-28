package com.apimantisbugtracker.tests.usuarios;

import com.apimantisbugtracker.bases.TestBase;
import com.apimantisbugtracker.defaultParameters.GlobalStaticParameters;
import com.apimantisbugtracker.jsonObjects.BuscaDadosUsuario;
import com.apimantisbugtracker.requests.usuarios.PostUsuarioRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;


public class PostUsuarioTests extends TestBase {


    ValidatableResponse response;
    int statusCodeEsperado = HttpStatus.SC_CREATED;
    GlobalStaticParameters globalStaticParameters;

    @Test
    public void criarUsuarioSucesso(){


        //Busca dados do usuario
        BuscaDadosUsuario buscaDadosUsuario = new BuscaDadosUsuario();

        //fluxo
        PostUsuarioRequest postUsuarioRequest = new PostUsuarioRequest();
        postUsuarioRequest.setJsonBodyUsingJavaObject(buscaDadosUsuario);
        response = postUsuarioRequest.executeRequest();

        //Validações
        response.log().all();
        response.statusCode(statusCodeEsperado);
        response.body(
                "user.name", equalTo(buscaDadosUsuario.getUsername()),
                "user.real_name",equalTo(buscaDadosUsuario.getReal_name()),
                "user.email",equalTo(buscaDadosUsuario.getEmail()));

    }

}
