package com.apimantisbugtracker.dbsteps;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.apimantisbugtracker.utils.DBUtils;
import com.apimantisbugtracker.utils.DadosFakeUtils;
import com.apimantisbugtracker.utils.GeneralUtils;


public class UsersDBSteps {

    private static final String sqlPath = "src/test/java/com/apimantisbugtracker/queries/";

    public static void insereUsuario() throws FileNotFoundException {
        String query = GeneralUtils.getFileContentAsString(sqlPath+"insereUsuario");
        query = query.replace("$username", DadosFakeUtils.geraNomeUsuario() );
        query = query.replace("$realname",DadosFakeUtils.geraNomeRealCompleto() );
        query = query.replace("$email", DadosFakeUtils.geraEmail() );
        DBUtils.getQueryResult(query);
    }

    public static String buscaUltimoIdInserido() throws FileNotFoundException {
        String query = GeneralUtils.getFileContentAsString(sqlPath+"retornaIdUsuario");
        return DBUtils.getQueryResult(query).get(0);
    }




}
