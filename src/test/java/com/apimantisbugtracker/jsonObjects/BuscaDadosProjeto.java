package com.apimantisbugtracker.jsonObjects;

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
public class BuscaDadosProjeto {

    private String name ="";
    private String status ="";
    private String description = "";
    private String enabled = "";
    private String file_path ="";

}
