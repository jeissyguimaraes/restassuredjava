package com.apimantisbugtracker.tests.usuario;

import com.apimantisbugtracker.bases.TestBase;
import com.apimantisbugtracker.dbsteps.UsersDBSteps;
import com.apimantisbugtracker.requests.usuario.DeleteUsuarioRequest;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.hamcrest.Matchers.equalTo;

public class DeleteUsuarioTests  extends TestBase {

    ValidatableResponse response;
    int statusCodeEsperado = HttpStatus.SC_NO_CONTENT;

    @Test
    public void excluirUsuarioSucesso() throws FileNotFoundException {

        // id do usuário para exclusão
        UsersDBSteps.insereUsuario();
        String idUsuario = UsersDBSteps.buscaUltimoIdInserido();

        //fluxo
        DeleteUsuarioRequest deleteUsuarioRequest = new DeleteUsuarioRequest(idUsuario);
        response = deleteUsuarioRequest.executeRequest();

        //Validações
        response.log().all();
        response.statusCode(statusCodeEsperado);

    }

}
