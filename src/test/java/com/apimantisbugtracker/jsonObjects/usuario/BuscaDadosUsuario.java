package com.apimantisbugtracker.jsonObjects.usuario;


import com.apimantisbugtracker.defaultParameters.GlobalStaticParameters;
import com.apimantisbugtracker.utils.DadosFakeUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BuscaDadosUsuario {

    private String username = DadosFakeUtils.geraNomeUsuario();
    private String password = GlobalStaticParameters.senhaUsuario;
    private String real_name = DadosFakeUtils.geraNomeRealCompleto();
    private String email = DadosFakeUtils.geraEmail();


}
