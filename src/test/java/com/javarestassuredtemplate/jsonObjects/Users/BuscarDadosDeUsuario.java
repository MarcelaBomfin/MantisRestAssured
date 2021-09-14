package com.javarestassuredtemplate.jsonObjects.Users;

import com.javarestassuredtemplate.DefaultParameters.GlobalStaticParameters;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuscarDadosDeUsuario {

    private String username = GlobalStaticParameters.username;
    private String password = GlobalStaticParameters.password;
    private String real_name = GlobalStaticParameters.real_name;
    private String email = GlobalStaticParameters.email;


}
