package com.apimantisbugtracker.tests.usuarios;

import com.apimantisbugtracker.bases.TestBase;
import com.apimantisbugtracker.dbsteps.UsuariosDBSteps;
import com.apimantisbugtracker.requests.usuarios.DelUsuarioRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class DelUsuarioTests extends TestBase {

    ValidatableResponse response;
    int statusCodeEsperado = HttpStatus.SC_NO_CONTENT;

    @Test
    public void excluirUsuarioSucesso() throws FileNotFoundException {

        // id do usuário para exclusão
        UsuariosDBSteps.insereUsuario();
        String idUsuario = UsuariosDBSteps.retornaUltimoIdInserido();

        //fluxo
        DelUsuarioRequest delUsuarioRequest = new DelUsuarioRequest(idUsuario);
        response = delUsuarioRequest.executeRequest();

        //Validações
        response.log().all();
        response.statusCode(statusCodeEsperado);

    }

}
