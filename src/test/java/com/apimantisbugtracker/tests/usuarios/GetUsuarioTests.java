package com.apimantisbugtracker.tests.usuarios;

import com.apimantisbugtracker.bases.TestBase;
import com.apimantisbugtracker.dbsteps.UsuariosDBSteps;
import com.apimantisbugtracker.requests.usuarios.GetUsuarioRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.hamcrest.Matchers.equalTo;

public class GetUsuarioTests extends TestBase {

    ValidatableResponse response;
    int statusCodeEsperado = HttpStatus.SC_OK;

    @Test
    public void buscarUsuarioSucesso() throws FileNotFoundException {

        // Dados para validar o retorno da requisição
        ArrayList<String> dadosAdministrador = UsuariosDBSteps.retornaDadosAdministrador();

        //fluxo
        GetUsuarioRequest getUsuarioRequest = new GetUsuarioRequest();
        response = getUsuarioRequest.executeRequest();

        //Validações
        response.log().all();
        response.statusCode(statusCodeEsperado);
        response.body(
                "name", equalTo(dadosAdministrador.get(0)),
                "real_name",equalTo(dadosAdministrador.get(1)),
                "email",equalTo(dadosAdministrador.get(2)) );


    }


}
