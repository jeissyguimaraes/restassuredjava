package com.apimantisbugtracker.dbsteps;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.apimantisbugtracker.jsonObjects.BuscaDadosUsuario;
import com.apimantisbugtracker.utils.DBUtils;
import com.apimantisbugtracker.utils.GeneralUtils;


public class UsuariosDBSteps {

    private static final String sqlPath = "src/test/java/com/apimantisbugtracker/queries/usuarios/";
    static BuscaDadosUsuario buscaDadosUsuario = new BuscaDadosUsuario();


    public static void insereUsuario() throws FileNotFoundException {

        String query = GeneralUtils.getFileContentAsString(sqlPath+"insereUsuario");

        query = query.replace("$username",buscaDadosUsuario.getUsername());
        query = query.replace("$realname", buscaDadosUsuario.getReal_name());
        query = query.replace("$email",buscaDadosUsuario.getEmail() );
        DBUtils.getQueryResult(query);
    }

    public static String retornaUltimoIdInserido() throws FileNotFoundException {
        String query = GeneralUtils.getFileContentAsString(sqlPath+"retornaIdUsuario");
        return DBUtils.getQueryResult(query).get(0);
    }

    public static ArrayList<String> retornaDadosAdministrador () throws FileNotFoundException {
        String query = GeneralUtils.getFileContentAsString(sqlPath+"retornaDadosUsuarioAdministrador");
        return DBUtils.getQueryResult(query);
    }




}
