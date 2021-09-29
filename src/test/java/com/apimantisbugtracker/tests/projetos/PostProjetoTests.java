package com.apimantisbugtracker.tests.projetos;

import com.apimantisbugtracker.bases.TestBase;
import com.apimantisbugtracker.dbsteps.UsuariosDBSteps;
import com.apimantisbugtracker.requests.usuarios.DelUsuarioRequest;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class PostProjetoTests extends TestBase {
    
    ValidatableResponse response;
    int statusCodeEsperado = HttpStatus.SC_NO_CONTENT;

    @Test
    public void criarProjetoSucesso() throws FileNotFoundException {

        // id do usuário para exclusão

        //fluxo

        //Validações

    }

}
