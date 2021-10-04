package com.apimantisbugtracker.jsonObjects;
import com.apimantisbugtracker.defaultParameters.GlobalStaticParameters;
import com.apimantisbugtracker.utils.DadosFakeUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BuscaDadosProjeto {

    private int id;
    private String name ;
    private Status status;
    private String description;
    private boolean enabled;
    private String file_path;
    private ViewState viewStates;

    public BuscaDadosProjeto(){

        status = new Status();
        viewStates = new ViewState();

        this.name =DadosFakeUtils.gerarNomeProjeto();
        this.description = DadosFakeUtils.gerarDescricao();
        this.enabled = GlobalStaticParameters.enabled;
        this.file_path = GlobalStaticParameters.file_path;
        status.setId(GlobalStaticParameters.statusId);
        status.setLabel(GlobalStaticParameters.statusLabel);
        status.setName(GlobalStaticParameters.statusName);
        viewStates.setId(GlobalStaticParameters.viewStatesId);
        viewStates.setLabel(GlobalStaticParameters.viewStatesLabel);
        viewStates.setName(GlobalStaticParameters.viewStatesName);

    }



}
