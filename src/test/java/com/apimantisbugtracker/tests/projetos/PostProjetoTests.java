package com.apimantisbugtracker.tests.projetos;

import com.apimantisbugtracker.jsonObjects.BuscaDadosProjeto;
import com.apimantisbugtracker.bases.TestBase;
import com.apimantisbugtracker.jsonObjects.Status;
import com.apimantisbugtracker.jsonObjects.ViewState;
import com.apimantisbugtracker.requests.projetos.PostProjetoRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.hamcrest.Matchers.equalTo;

public class PostProjetoTests extends TestBase {

    ValidatableResponse response;
    int statusCodeEsperado = HttpStatus.SC_CREATED;

    @Test
    public void criarProjetoSucesso() throws FileNotFoundException {

      // Massa de dados BuscaDadosProjeto
        BuscaDadosProjeto buscaDadosProjeto = new BuscaDadosProjeto();

        //fluxo
        PostProjetoRequest postUsuarioRequest = new PostProjetoRequest();
        postUsuarioRequest.setJsonBodyUsingJavaObject(buscaDadosProjeto);
        response = PostProjetoRequest.executeRequest();


        response.log().all();
        response.statusCode(statusCodeEsperado);
        response.body(
                "project.name", equalTo(buscaDadosProjeto.getName()),
                "project.status.id",equalTo(buscaDadosProjeto.getStatus().getId()),
                "project.status.name",equalTo(buscaDadosProjeto.getStatus().getName()),
                "project.status.label",equalTo(buscaDadosProjeto.getStatus().getLabel()),
                "project.description",equalTo(buscaDadosProjeto.getDescription()),
                "project.enabled",equalTo(buscaDadosProjeto.isEnabled()),
                "project.view_state.id",equalTo(buscaDadosProjeto.getViewStates().getId()),
                "project.view_state.name",equalTo(buscaDadosProjeto.getViewStates().getName()),
                "project.view_state.label",equalTo(buscaDadosProjeto.getViewStates().getLabel()));




    }

}
